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

class Main{
    public static void main(String[] args){
        Cat cat1 = new Cat("pufi1", 3);
        Cat cat2 = new Cat("pufi2", 4);

        System.out.println(cat1.toString());
        System.out.println(cat2.toString());
    }
}