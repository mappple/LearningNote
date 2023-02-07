package hook.demo;

//对于上面这段程序，游戏对咱们隐藏了Weapon的伤害值，但如今咱们想要在每次攻击的时候知道这个伤害值是多少。
//下面看看使用Hook机制如何来实现。

//首先咱们经过观察，发现切入点就是weaponMain，咱们要对它下手。
//建立一个Weapon的复制品WeaponHook，咱们须要用本身的人WeaponHook打入内部。
//WeaponHook一切看起来都和Weapon那么类似，可是咱们给它留了一个后门，使得咱们能够进行监控。
public class WeaponHook extends Weapon {
    private OnUseWeaponAttackListener onUseWeaponAttackListener;

    @Override
    public void attack() {
        super.attack();
        System.out.println("WeaponHook has called Weapon.attach");
        if (onUseWeaponAttackListener != null) {
            onUseWeaponAttackListener.onUseWeaponAttack(damage);
        }
    }

    public void setOnUseWeaponAttackListener(OnUseWeaponAttackListener onUseWeaponAttackListener) {
        this.onUseWeaponAttackListener = onUseWeaponAttackListener;
    }

    //这就是咱们的后门
    public static interface OnUseWeaponAttackListener {
        int onUseWeaponAttack(int damage);
    }
}