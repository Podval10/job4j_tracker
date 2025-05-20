package ru.job4j.tracker;

public class Item {
    private int id;
    private String name;

    public Item(){
    }
    public Item(String papam){
      name=papam;
    }
    public Item(int id,String name){
       this.id=id;
      this.name =name;
    }
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
    public void www(){
        System.out.println("Сколько мне лет? "+ id );
        System.out.println("Кто я? " + name);
    }

    public static void main(String[] args) {
        Item popa= new Item();
        Item popa1 = new Item("Sex");
        Item popa2 = new Item(29,"Sex");
        popa.www();
        popa1.www();
        popa2.www();
    }
}