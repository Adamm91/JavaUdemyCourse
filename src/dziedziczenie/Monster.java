package dziedziczenie;

public abstract class Monster {

    private int HP;
    private int speed;
    private int mana;

    public  Monster(int HP, int speed, int mana) {
        this.HP = HP;
        this.speed = speed;
        this.mana = mana;
    }

    protected int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getSpeed() {
        return speed;
    }

    public abstract void attack ();

    @Override
    public String toString() {
        return "Monster{" +
                "HP=" + HP +
                ", speed=" + speed +
                ", mana=" + mana +
                '}';
    }

}
