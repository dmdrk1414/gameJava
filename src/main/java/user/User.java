package user;

import func.UseFunc;
import gun.Wepon;

import java.util.ArrayList;

public class User {
    private int age;
    private String name;
    private Wepon gun;
    private ArrayList<Wepon> gunInventory;

    public User() {
        this(0, "");
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
        this.gun = new Wepon();
        this.gunInventory = new ArrayList<>();
    }

    public boolean takeGun(Wepon wepon) {
        if (UseFunc.isNotNullObject(wepon)) {
            this.gunInventory.add(wepon);
            return true;
        }
        return false;
    }
}
