package kleber.animal;

public class Fish extends Animal{

	public Fish(String name, int age) {
		super(name, age);
		
		// super call the parent method
	}
	
	
	private void setColor(int rgb ) {
		
	}
	
	private void setColor(int rgb, int rgb1 ) {
		
	}
	
	@Override
	public String toString() {
		return "Fish [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	protected void parler() {
		super.parler();
		System.out.println("Je sais nager");
	}
	
//	@Override
//	public boolean equals(Fish obj) {
//		return this.name.equalsIgnoreCase(obj.nam)
//	}
	
	

	
}
 