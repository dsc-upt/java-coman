import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class MainCat {

	

	public static void main(String[] args) {
		/*Cat cat1,cat2;
		cat1 = new Cat("John",5);
		cat2 = new Cat("Nori",1);
		Dog dog1;
		dog1 = new Dog("Max",10);
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(dog1);
		
		Animal animal = new Dog("dog2",100,true);
		System.out.println(animal); // =>to string din dog
        */
		List<Animal> list = new LinkedList<>();
		Dog dog1 = new Dog("dog1", 12, false);
		Cat cat1 = new Cat("cat1",100);
		Animal animal = new Animal("animal", 12);
	
		list.add(dog1);
		list.add(cat1);
		list.add(animal);
		list.add(dog1);
		
		/*for(int i = 0; i<list.size();i++) {
			list.get(i).eat();
		}
		
		System.out.println();
		
		for(Animal a:list) {
			a.eat();
		}
		*/
		
		Dog dog2 = new Dog("dog2",6,true);
		Dog dog3 = new Dog("dog2",6,true);
		
		//System.out.println(dog2.equals(dog3));
		
		//Multimi 
		
		Set<Animal> animalSet = new HashSet<>();
		animalSet.add(dog2);
		animalSet.add(cat1);
		animalSet.add(animal);
		animalSet.add(dog3);
		
		System.out.println(animalSet);
		
	    Map<Integer, Animal> animalMap = new HashMap<>();
	    
	    animalMap.put(1,dog1);
	    animalMap.put(2, cat1);
	    animalMap.put(5, animal);
	    
	    System.out.println(animalMap);
	    System.out.println(animalMap.get(5));
	    
	    Stack<Animal> animalStack = new Stack();
	    animalStack.push(dog1); // adauga un nou animal
	    animalStack.push(cat1);
	    
	    System.out.println(animalStack.pop());//ultimul 
	    System.out.println(animalStack);
	    
	    Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    System.out.println(n);
	    scanner.close();
	    
	}

}
