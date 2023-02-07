package hook.demo;

import java.lang.reflect.Field;

public class GameHook {
    public static void main(String[] args) {
        Hero hero = new Hero(new Weapon());
        try {
            //Field weapon = ReflectUtils.getVariable(hero.getClass(), "weaponMain");
            Class<?> heroClass = hero.getClass();
            //Field weapon = heroClass.getField("weaponMain");// 不包含私有属性
            Field weapon = heroClass.getDeclaredField("weaponMain");// 包含私有属性
            weapon.setAccessible(true);
            Weapon weaponHook = new WeaponHook();
            ((WeaponHook) weaponHook).setOnUseWeaponAttackListener(damage -> {
                //经过后门进行操作，这其实就是咱们注入的代码
                System.out.println("damage = " + damage);
                return damage;
            });
            weapon.set(hero, weaponHook); //偷天换日  >>> 关键操作，替换掉原来的成员变量  (属性.set(对象，新的成员变量的对象))
            hero.attack(); //最终调用的是 weaponHook
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}