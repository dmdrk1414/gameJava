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

    public int attack() {
        if (this.isUseGun()) {
            this.durability -= 1;
        }
        return damege;
    }

    protected Boolean isUseGun() {
        if (this.durability == 0) {
            return false;
        }
        return true;
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
