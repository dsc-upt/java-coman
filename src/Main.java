import java.util.Random;

/*
    In fiecare clasa poate sa existe:
        - toString()
        - equals(obj);
        - hashCode();

 */

class Dog {
    private String name;
    public int age;
    private boolean hasPedigree;

    public Dog(){

    }

    public Dog(String name, int age, boolean hasPedigree) {
        this.name = name;
        this.age = age;
        this.hasPedigree = hasPedigree;
    }

    public String toString() {
        return "Name: " + this.name + ", age: " + this.age + ", pedigree: " + this.hasPedigree;
    }

    public boolean equals(Object object) {
        if(object instanceof Dog) {
            Dog dog = (Dog) object;
            if(dog.age == this.age && dog.hasPedigree == this.hasPedigree && dog.name.equals(this.name))
                return true;
            return false;
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getHasPedigree() {
        return this.hasPedigree;
    }

    public void setHasPedigree(boolean hasPedigree) {
        this.hasPedigree = hasPedigree;
    }
}

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Alin", 12, true);
        //dog1.printAge();
        //System.out.println(dog1.age);

        //System.out.println(dog1);

        Dog dog2 = new Dog("Alin", 12, true);
        System.out.println(dog2);

        if(dog1.equals(dog2)) {
            System.out.println("Egale");
        }
        else {
            System.out.println("Nu sunt egale");
        }

        //System.out.println(dog1.name);    <-      gresit
        //dog1.setName("Cosmin");
        System.out.println(dog1.getName());

    }
}
