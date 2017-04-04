package models;

/**
 * Created by Роберт on 03.04.2017.
 */
public class Parent {
    private int id;
    private String name;

    public Parent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
