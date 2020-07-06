package sample;

import sample.mobs.Mob;
import sample.mobs.Player;
import sample.mobs.Enemy;
import sample.calculations.AdvancedCalculation;
import sample.calculations.BasicCalculation;

public class Game {
    public static void main(String[] args) {
        testMob(new Enemy());
        testMob(new Player());
    }

    public static void testMob(Mob mob) {
        System.out.println("Tests with mob.");
        BasicCalculation deadMob = new BasicCalculation(mob);
        deadMob.increaseDamage();
        mob.printStatus();

        System.out.println("Tests with advanced mob.");
        AdvancedCalculation advancedMob = new AdvancedCalculation(mob);
        mob.revive();
        advancedMob.increaseHitPoints();
        advancedMob.increaseDamage();
        advancedMob.upgrade();
        mob.printStatus();
    }
}
