
class Animal extends Object{
	//protected -> vizibil in toata ierarhia de clase
	protected String name;
	protected int age;
	
	public Animal() {
		
	}
	
	public Animal(String name, int age) {
		this.name =name;
		this.age = age;
	}
    
	public String toString() {
		return "Animal:" + this.name + " " + this.age;
	}
   
	public void eat() {
		System.out.println("Animal eats:");
	}
	
}

class Cat extends Animal {
	
   //private String name;
   //private int age;
   
  
   public Cat(String nume, int varsta) {
	   super(nume,varsta);
	   //this.name=nume;
	   //this.age=varsta;
   }
   
   
   public String getNume() {
	   return this.name;
   }
   /*
   public int getVarsta() {
	   return this.age;
   }
   
   public void setNume(String nume) {
	     this.name = nume;
   }
   
   public void setValue(int value) {
	    this.age = value;
   }
    public String toString() {
    	return this.name + " " + this.age;
    }
*/
   
}

class Dog extends Animal{
	
	private boolean hasPedigree;
	
	public Dog(String name, int age) {
		super(name,age);//apelam constructorul din superclasa
		this.hasPedigree=false;
		//this.name = name;
		//this.age =age;
		
	}
	
	public Dog(String name, int age, boolean hasPedigree) {
		super(name,age);
		this.hasPedigree=hasPedigree;
		
	}
	
	public String toString() {
		return "Dog: name=" +this.name + " varsta=" +this.age + " pedigree: "+ this.hasPedigree;
	}
	
	public void eat() {
		System.out.println("Dog eats");
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		Dog dog =(Dog) o;
		return hasPedigree == dog.hasPedigree && age == dog.age && name.equals(dog.name);
	
	}
	
}
