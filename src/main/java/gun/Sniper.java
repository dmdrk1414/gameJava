package gun;

public class Sniper extends Wepon {
    public Sniper() {
        super.damege = 10;
        super.durability = 500;
        super.gunSpeed = 5;
    }

    @Override
    public String toString() {
        return "Sniper{" +
                "damege=" + damege +
                ", durability=" + durability +
                ", gunSpeed=" + gunSpeed +
                '}';
    }
}
