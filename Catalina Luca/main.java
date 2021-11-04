
class cat{
    private int age;
    private String name;

    public cat(int Age, String Name){
        name=Name;
        age=Age;
    }
    public cat(){

    }
    public int getAge(){
        return age;
    }
    public void setAge(int Age){
        age=Age;
    }

    public String getName(){
        return name;
    }

    public void setName(String Name){
        name=Name;
    }

    public String toString(){
        return name + " " +age+ "\n";
    }
}
class main{
    public static void main(String[] args) {
        cat c1= new cat(3,"Mia");
        cat c2= new cat();
        c2.setAge(2);
        c2.setName("Viorica");
        System.out.println(c1);
        System.out.println(c2);
    }
}