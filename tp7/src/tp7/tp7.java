package tp7;

public class tp7 {
	
	public static void main(String[] args) {
		/*
		ListeEntier list = new ListeEntier(15);
		list.AjouterFin(36);
		list.AjouterFin(-4);
		list.AjouterFin(9);
		list.AjouterFin(13);
		list.AjouterFin(22);
		list.AjouterFin(-9);
		list.AjouterFin(70);

		System.out.println(list.Longueur());
		System.out.println(list.Max()); */
		
		Arme épée = new Arme("Epée", 30);
		Armure casque = new Armure("Casque", 5, 10);
		Arme baton = new Arme("baton", 6);

		Personnage pierre = new Personnage("Pierre", "Mage", baton);
		Personnage francois = new Personnage("François", "Moine", casque);
		Attaque(pierre, francois);
	}
	
	public static void Attaque(Personnage perso1, Personnage perso2) {
		//Arme de l'attaquant
		Arme armeAttaquant = perso1.getMonArme();
		
		//Point d'attaque de l'arme
		int pointArme = armeAttaquant.getPuissance();
		
		//Armure de la cible
		Armure armureCible = perso2.getMonArmure();

		//Point de résistance de l'armure
		int pointArmure = armureCible.getPoints();
		
		//Point de résitance de la cible
		int pointResistance = perso2.getResistance();
		
		//Point d'attaque de l'attaquant
		int pointAttaquant = perso1.getDmg();
		//Point de vie perdue de la cible
		int pvLost = pointAttaquant * (1 + (pointArme/(1+pointArmure)))-pointResistance;
		//Pv 
		int pv = perso2.getPv()-pvLost;
		System.out.println(pv);
		//On retire les points de vie à la cible 
		perso2.setPv(pv);
		
		//Texte
		
		System.out.println(perso1.getNom() + " Attaque " + perso2.getNom());
		System.out.println(perso2.getNom() +  " perd " + pvLost + " pv, il lui reste " + perso2.getPv() + " pv");
	}
	
	public static void Verifmort(Personnage perso) {
		if(perso.getPv() < 0) {
			perso.setMonArme(null);
			perso.setMonArmure(null);
			System.out.println("Le personnage " + perso.getNom() + " est mort. Il perd ses équipements.");
		}
	}
}
