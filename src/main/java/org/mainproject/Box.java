package org.mainproject;
import java.util.ArrayList;
import java.util.List;

class Box<T extends Fruit> {
    private List<T> fruits;
    public Box() {
        this.fruits = new ArrayList<>();
    }
    public void addFruit(T fruit) {
        fruits.add(fruit);
    }
    public float getWeight() {
        if (fruits.isEmpty()) {
            return 0;
        }
        float weight = 0;
        for (T fruit : fruits) {
            if (fruit instanceof Apple) {
                weight += 1.0f;
            } else if (fruit instanceof Orange) {
                weight += 1.5f;
            }
        }
        return weight;
    }
    public boolean compare(Box<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }

    public void transferFruits(Box<? super T> anotherBox) {
        if (this == anotherBox) {
            return;
        }

        anotherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}