package fightGame;

public class Fighter {
	protected String name;
	protected String classe;
	protected int strength;
	protected int mana;
	protected int life;
	
	
	public Fighter(String name, String classe, int strength, int mana, int life) {
		this.name = name;
		this.classe = classe;
		this.strength = strength;
		this.mana = mana;
		this.life = life;
	}
	
	public Fighter() {
		
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
	public void setStrenght() {
		this.strength = strength;
	}
	
	public int getMana() {
		return mana;
	}
	public void setMana() {
		this.mana = mana;
	}
	public int getLife() {
		return life;
	}
	public void setLife() {
		this.life = life;
	}

	@Override
	public String toString() {
		return "Figther [name=" + name + ", classe=" + classe + ", strength=" + strength + ", mana=" + mana +", life=" + life +"]";
	}
	
	
}
