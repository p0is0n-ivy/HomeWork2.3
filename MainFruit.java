package project3;

import java.util.ArrayList;

public class MainFruit {
    public static void main(String[] args) {
        ArrayList<Apple> apple = new ArrayList<Apple>();
        Apple apple1 = new Apple("apple", 1.0f);
        apple.add(apple1);
        apple.add(apple1);
        apple.add(apple1);
        apple.add(apple1);
        apple.add(apple1);
        apple.add(apple1);
        ArrayList<Apple> apple2 = new ArrayList<Apple>();
        apple2.add(apple1);
        apple2.add(apple1);
        apple2.add(apple1);
        apple2.add(apple1);
        apple2.add(apple1);
        apple2.add(apple1);
        apple2.add(apple1);
        apple2.add(apple1);
        int i = apple.size();
        System.out.println("Number of apples in a box: "+ i);
        ArrayList<Orange> orange = new ArrayList<>();
        Orange orange1 = new Orange("orange", 1.5f);
        orange.add(orange1);
        orange.add(orange1);
        orange.add(orange1);
        orange.add(orange1);
        orange.add(orange1);
        int j = orange.size();
        System.out.println("Number of oranges in a box: " + j);
        Box box1 = new Box(apple);
        System.out.println( "Weight of the box: " + box1.getWeightBox());
        Box box2 = new Box(orange);
        System.out.println( "Weight of the box: " + box2.getWeightBox());
        System.out.println(box1.compare(box2));
        Box box3 = new Box(apple2);
        box1.pourItIntoAnotherBox(box3);
        System.out.println( "Weight of the box1: " + box1.getWeightBox());
        box3.getList().clear();
        System.out.println( "Weight of the box3: " + box3.getWeightBox());
       }
    }
