package kleber.animal;

public class Cat extends Animal  implements Action{

	private int longueurPoil;

	public Cat(String name, int age, int longueurPoil) {
		super(name, age);
		this.longueurPoil = longueurPoil;
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	protected void parler() {
		super.parler();
		System.out.println("Je miaule");
	}

	@Override
	public void deplacer() {
		// TODO Auto-generated method stub
		
	}
	
	public void rasePoil() {
		System.out.println("on rase mes poils");
	}
	
	

}
