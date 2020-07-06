package sample.mobs;

public interface Mob {
    boolean isAlive();

    void revive();

    void isDead();

    int getHitPoints();

    void setHitPoints(int hitPoints);

    int getDamage();

    void setDamage(int damage);

    void printStatus();
}
