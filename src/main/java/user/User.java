package user;

import func.UseFunc;
import gun.Wepon;

import java.util.ArrayList;

public class User {
    private int age;
    private String name;
    private Wepon gun;
    private ArrayList<Wepon> gunInventory;
    int gunInventoryIndex;

    public User() {
        this(0, "");
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
        this.gun = new Wepon();
        this.gunInventory = new ArrayList<>();
        this.gunInventory.add(new Wepon());
        this.gunInventoryIndex = 0;
    }

    public boolean takeGun(Wepon wepon) {
        if (UseFunc.isNotNullObject(wepon)) {
            this.gunInventory.add(wepon);
            return true;
        }
        return false;
    }

    public int attackEnemy() {
        return gun.attack();
    }

    public boolean ChangeWepon() {
        int gunInventorySize = this.gunInventory.size();
        int gunChangeRight = 1;
        this.gunInventoryIndex = (this.gunInventoryIndex + gunChangeRight) % gunInventorySize;
        Wepon currentWepon = this.gunInventory.get(gunInventoryIndex);

        if (UseFunc.isNotNullObject(currentWepon)) {
            this.gun = currentWepon;
            return true;
        }
        return false;
    }
}
