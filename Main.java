class Cat {

    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Mew", 10);
        Cat cat2 = new Cat("Mur", 3);

        System.out.println(cat1.name + " " + cat1.age);
        System.out.println(cat2.name + " " + cat2.age);
    }
}