package hook.demo;

public class Weapon {
    protected int damage = 10;

    public void attack() {
        System.out.printf("对目标形成 %d 点伤害%n", damage);
    }
}
