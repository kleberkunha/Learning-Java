package fightGame;

public class Character {
	protected String name;
	protected String classe;
	protected int strength;
	protected int mana;
	protected int life;
	private int def;
	
	
	public Character(String name, String classe, int strength, int mana, int life, int def) {
		this.name = name;
		this.classe = classe;
		this.strength = strength;
		this.mana = mana;
		this.life = life;
		this.def = def;
	}
	
	public Character() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public int getStrenght() {
		return strength;
	}
	public void setStrenght(int strength) {
		this.strength = strength;
	}
	
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}

	@Override
	public String toString() {
		return "Figther [name=" + name + ", classe=" + classe + ", strength=" + strength + ", mana=" + mana +", life=" + life +", def="+ def +"]";
	}
	
	
}
