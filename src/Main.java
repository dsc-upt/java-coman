import java.util.*;
class Cat{
    private String name;
    private int age;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name + " " + age;
    }
}

class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("negrutu", 1);
        Cat cat2 = new Cat("griutu", 2);
        System.out.println(cat1.toString());
        System.out.println(cat2.toString());

    }
}