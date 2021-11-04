package wc2;

import java.util.*;

class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("Animal eats");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }
}

class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public int getAge() {
        return this.age;
    }
}

class Dog extends Animal {
    private boolean hasPedigree;

    public Dog(String name, int age) {
        super(name, age);
        this.hasPedigree = false;
    }

    public Dog(String name, int age, boolean hasPedigree) {
        super(name, age);
        this.hasPedigree = hasPedigree;
    }

    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return hasPedigree == dog.hasPedigree && age == dog.age && name.equals(dog.name);
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hasPedigree=" + hasPedigree +
                '}';
    }
}

public class Advanced {
    public static void main(String[] args) {

        List<Animal> list = new LinkedList<>();

        Dog dog1 = new Dog("dog1", 12,false);
        Cat cat1 = new Cat("cat1", 100);
        Animal animal = new Animal("animal", 12);

        list.add(dog1);
        list.add(cat1);
        list.add(animal);
        list.add(dog1);

        //System.out.println(list);

        Dog dog2 = new Dog("dog1", 12,false);
        Dog dog3 = new Dog("dog1", 12,false);

        Set<Animal> animalSet = new HashSet<>();
        animalSet.add(dog2);
        animalSet.add(cat1);
        animalSet.add(animal);
        animalSet.add(dog3);

        //System.out.println(animalSet);

        Map<Integer, Animal> animalMap = new HashMap<>();

        animalMap.put(1, dog1);
        animalMap.put(2, cat1);
        animalMap.put(5, animal);

        //System.out.println(animalMap.get(5));

        Stack<Animal> animalStack = new Stack<>();
        animalStack.push(dog1);
        animalStack.push(cat1);

        //System.out.println(animalStack.pop());
        //System.out.println(animalStack);

        Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();

        //System.out.println(n);

        String s = scanner.nextLine();



        //System.out.println(s);

        Animal an = new Animal("hihi", 12);
        System.out.println(an);

    }
}
