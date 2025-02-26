package ru.job4j.tracker;

public class Item {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Пусто ");
        System.out.println("Имя: " + name);
        System.out.println("ID + Имя: " + id + " " + name);
    }

    public static void main(String[] args) {
        Item item = new Item(258, " Имя ");
        item.printInfo();
    }
}
