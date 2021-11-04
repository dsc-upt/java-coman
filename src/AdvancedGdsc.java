class Cat {
    private String name;
    private int age;
    public Cat(String name,int age)
    {
        this.age=age;
        this.name=name;
    }
    public int getAge()
    {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString()
    {
        return this.name+" "+this.age;
    }
}

public class AdvancedGdsc {
    public static void main(String[] args) {
        Cat c1=new Cat("Pisi1",12);
        Cat c2=new Cat("Pisi2",11);
        System.out.println(c1);
        System.out.println(c2);
    }
}
