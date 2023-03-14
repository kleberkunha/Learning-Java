package kleber.animal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world"); // TODO Auto-generated method stub

		Animal animal1 = new Animal("Devi", 2);
		Fish fish1 = new Fish("dora", 3);
		Fish fish2 = new Fish("maurice", 3);
		Cat cat = new Cat("bibi", 3, 20);
		List<Animal> listanimal1 = new ArrayList<Animal>();
		listanimal1.add(new Fish("dora", 3));
		listanimal1.add(new Cat("bibi", 3, 20));
		
		List<Animal> listanimal2 = new ArrayList<Animal>();
		listanimal2.add(new Fish("bido", 3));
		listanimal2.add(new Cat("tom", 3, 20));
		
		List<Animal> listanimal3 = new ArrayList<Animal>();
		listanimal3.add(new Fish("quiqui", 3));
		listanimal3.add(new Cat("bado", 3, 20));
		
		listanimal3.sort(new Comparator<Animal>() {
			@Override
			public int compare(Animal o1, Animal o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		System.out.println("======================================"+listanimal3);
		
		
		Map<String,List> seats = new HashMap();
		seats.put("1", listanimal1);
		seats.put("2", listanimal2);
		seats.put("3", listanimal3);
		
		System.out.println(seats.get("3"));
		
		
		Animal bete = new Cat("bibi", 3, 20);
		//casting
		((Cat)bete).rasePoil();
		
//		System.out.println(listanimal);
		for(Animal animal : listanimal1) {
			if(animal instanceof Fish) {
				animal.parler();
			}
			//casting
			if(animal instanceof Cat) {
				animal.parler();
				((Cat) animal).rasePoil();
				
			}

		}
		System.out.println("No of animals "+Animal.compteur);

//		if(fish1==fish2) {
//			System.out.println("les memes!");
//		}
	}
	
	

}
