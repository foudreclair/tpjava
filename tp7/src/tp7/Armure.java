package tp7;

public class Armure {
	private String name; 
	//points d'armure
	private int points;
	//Bonus de points de vie
	private int bonus;
	
	public Armure(String name, int points, int bonus) {
		this.name = name;
		this.points = points;
		this.bonus = bonus;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
}