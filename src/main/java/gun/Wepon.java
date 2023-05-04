package gun;

public class Wepon {
    int damege;
    int durability;
    int gunSpeed;

    public Wepon() {
        this.damege = 1;
        this.durability = 1000;
        this.gunSpeed = 10;
    }

    @Override
    public String toString() {
        return "BasicWepon{" +
                "damege=" + damege +
                ", durability=" + durability +
                ", gunSpeed=" + gunSpeed +
                '}';
    }
}
