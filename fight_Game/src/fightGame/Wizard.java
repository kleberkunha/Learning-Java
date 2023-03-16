package fightGame;

public class Wizard extends Character{

	public Wizard(String name, String classe, int strength, int mana, int life, int def) {
		super(name, classe, strength, mana, life, def);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Wizard[name=" + name + ", classe=" + classe + ", strength=" + strength + ", mana=" + mana +", life=" + life +", def="+ life +"]";
	}
}
