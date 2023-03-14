package kleber.animal;
public class Animal {
	
	protected String name;
	protected int age;
	public static int compteur ;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		compteur++;
	}
	
	public Animal() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}
	
	protected void parler() {
		//System.out.println("je suis un animal");
	
	}
	
	

}
