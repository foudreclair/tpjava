package tp7;

public class Personnage {
	private String nom;
	private String classe;
	//Points de vie
	private int pv; 
	//Points d'attaque
	private int dmg;
	private Armure monArmure;
	private Arme monArme;
	
	
	public Personnage(String nom, String classe, Armure monArmure, Arme monArme) {
		super();
		this.nom = nom;
		this.classe = classe;
		this.pv = 20;
		this.dmg = 5;
		this.monArmure = monArmure;
		this.monArme = monArme;
		this.resistance = 0;
	}
	
	public Personnage(String nom, String classe, Armure monArmure) {
		super();
		this.nom = nom;
		this.classe = classe;
		this.pv = 20;
		this.dmg = 5;
		this.monArmure = monArmure;
		this.resistance = 0;
	}
	
	public Personnage(String nom, String classe) {
		super();
		this.nom = nom;
		this.classe = classe;
		this.pv = 20;
		this.dmg = 5;
		this.resistance = 0;
	}
	
	

	public Personnage(String nom, String classe, Arme monArme) {
		super();
		this.nom = nom;
		this.classe = classe;
		this.pv = 20;
		this.dmg = 5;
		this.monArme = monArme;
		this.resistance = 0;
	}

	public Arme getMonArme() {
		return monArme;
	}
	public void setMonArme(Arme monArme) {
		this.monArme = monArme;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPv() {
		if(this.monArmure == null) {
			return pv;
		}
		else {
			return pv + monArmure.getBonus();
		}
	}


	public void setPv(int pv) {
		this.pv = pv;
	}
	public int getDmg() {
		return dmg;
	}
	public void setDmg(int dmg) {
		this.dmg = dmg;
	}
	public int getResistance() {
		if(this.monArmure == null) {
			return resistance;
		}
		else {
			return resistance + monArmure.getPoints();
		}
	}
	public void setResistance(int resistance) {
		this.resistance = resistance;
	}
	public Armure getMonArmure() {
		return monArmure;
	}
	public void setMonArmure(Armure monArmure) {
		this.monArmure = monArmure;
	}
	private int resistance;
}
