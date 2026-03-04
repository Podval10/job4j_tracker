package ru.job4j.tracker;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Arrays;

public class SingleTracker {
    private Tracker tracker = new Tracker();

    private SingleTracker(){

    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public List<Item> findAll() {
        return tracker .findAll();
    }

//    public Item[] findByName(String name) {
//        return tracker.findByName(name);
//    }
    public List<Item> findByName(String name) {
        return tracker.findByName(name);
     }


    public Item findById(int id) {
        return tracker.findById(id);
    }


    public boolean replace(int id, Item item) {
        return tracker.replace(id,item);
    }

    public void delete(int id) {
        tracker.delete(id);
    }
}
