package hook.demo;

public class HeroPro {
    private Weapon weaponMain;
    private final int weaponMainId;

    public HeroPro(Weapon weaponMain) {
        this.weaponMain = weaponMain;
        weaponMainId = this.weaponMain.hashCode();//记录原始Weapon对象的Id，hashCode对于每一个对象而言都是惟一的。
    }

    public void attack() {
        if (this.weaponMain.hashCode() != weaponMainId) { //关键位置检查是否遭到替换
            throw new IllegalAccessError(String.format("警告！遭到入侵！入侵者身份:%d", this.weaponMain.hashCode()));
        }
        weaponMain.attack();
    }
}
