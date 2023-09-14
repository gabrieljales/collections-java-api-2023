package main.java.sandbox.generics;

import java.util.ArrayList;
import java.util.List;

public class Shelf <T> {
    private List<T> shelfObjectsList;

    public Shelf() {
        this.shelfObjectsList = new ArrayList<T>();
    }

    public void addObject(T obj) {
        shelfObjectsList.add(obj);
    }

    public void removeObjects(T targetObject) {
        List<T> objectsToRemove = new ArrayList<>();

        if (!shelfObjectsList.isEmpty()) {
            for (T obj: shelfObjectsList) {
                if (obj.equals(targetObject)) {
                    objectsToRemove.add(obj);
                }
            }
            shelfObjectsList.removeAll(objectsToRemove);
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void showObjectInShelf() {
        System.out.println(shelfObjectsList);
    }
}
