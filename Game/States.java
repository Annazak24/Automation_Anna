package Game;

public static class Stats {
    private int hp, mp, atk, mPow, range, speed;
    private String name;

    public Stats (int hp, int mp, int atk, int mPow,
                  int range, int range, int speed, String name){
        this.hp = hp;
        this.mp = mp;
        this.atk = atk;
        this.mPow = mPow;
        this.range = range;
        this.speed = speed;
        this.name=name;
    }
    @Override
    public String toString()
    {
        return "Stats{" +
                "hp=" + hp +
                ", mp =" + mp +
                ", atk =" + atk +
                ", mPow=" + mPow +
                ", range =" + range +
                ", speed=" + speed +
                ", name =" + name + "'" +
                '}';

    }
}
