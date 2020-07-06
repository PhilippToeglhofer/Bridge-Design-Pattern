package sample.calculations;

import sample.mobs.Mob;

public class BasicCalculation implements Calculator {
    protected Mob mob;

    public BasicCalculation() {}

    public BasicCalculation(Mob mob) {
        this.mob = mob;
    }

    @Override
    public void loseHitPoints() {
        System.out.println("Calculator: lower HitPoints");
        if (mob.getHitPoints() > 9) {
            mob.setHitPoints(mob.getHitPoints() - 10);
        }
    }

    @Override
    public void increaseHitPoints() {
        System.out.println("Calculator: increase HitPoints");
        mob.setHitPoints(mob.getHitPoints() + 10);
    }

    @Override
    public void lowerDamage() {
        System.out.println("Calculator: lower Damage");
        if (mob.getDamage() > 1) {
            mob.setDamage(mob.getDamage() - 1);
        }
    }

    @Override
    public void increaseDamage() {
        System.out.println("Calculator: increase Damage");
        mob.setDamage(mob.getDamage() + 1);
    }
}
