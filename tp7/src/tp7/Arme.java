package tp7;

public class Arme {
	private String name;
	private int puissance;
	
	public Arme(String name, int puissance) {
		this.name = name;
		this.puissance = puissance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
}
