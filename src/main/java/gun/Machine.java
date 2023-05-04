package gun;

public class Machine extends Wepon {
    public Machine() {
        super.damege = 1;
        super.durability = 10000;
        super.gunSpeed = 30;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "damege=" + damege +
                ", durability=" + durability +
                ", gunSpeed=" + gunSpeed +
                '}';
    }
}
