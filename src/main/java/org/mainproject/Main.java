package org.mainproject;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());

        System.out.println("Первая коробка с яблоками весит: " + appleBox1.getWeight());
        System.out.println("Вторая коробка с яблоками весит: " + appleBox2.getWeight());
        System.out.println("Коробка с апельсинами весит: " + orangeBox.getWeight());
        System.out.println("Сравнение массы первой коробки с яблоками и второй коробки с яблоками: "
                + appleBox1.compare(appleBox2));
        System.out.println("Сравнение массы первой коробки с яблоками и коробки с апельсинами: "
                + appleBox1.compare(orangeBox));
    }
}