package fightGame;

public class Main {
	
	public static void main(String[] args) {
		Character figther1 = new SwordsMan("Darius", "SwordsMan", 70, 30, 100, 100);
		Character wizard = new Wizard("Mago", "Wizard", 30, 90, 100, 100);
		
		System.out.println("##########  :::" + figther1);
		System.out.println("##########  :::" + wizard);
	}

	
}
