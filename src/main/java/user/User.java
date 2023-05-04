package user;

import gun.Wepon;

import java.util.ArrayList;

public class User {
    int age;
    String name;
    Wepon gun;
    ArrayList<Wepon> gunInventory;

    public User() {
        this(0, "");
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
        this.gun = new Wepon();
        this.gunInventory = new ArrayList<>();
    }
}
