package sample.calculations;

import sample.mobs.Mob;

public class AdvancedCalculation extends BasicCalculation {

    public AdvancedCalculation(Mob device) {
        super.mob = device;
    }

    public void upgrade() {
        System.out.println("Calculator: upgrade");
        mob.setHitPoints(mob.getHitPoints() + 20);
        mob.setDamage(mob.getDamage() + 5);
    }
}
