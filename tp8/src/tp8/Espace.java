/**
 * 
 */
package tp8;

/**
 * @author foudre
 *
 */
public class Espace {
	private int hauteur;
	private int largueur;
	
	public Espace(int hauteur, int largueur) {
		super();
		this.hauteur = hauteur;
		this.largueur = largueur;
	}
	
	public int gethauteur() {
		return hauteur;
	}
	public void sethauteur(int hauteur) {
		this.hauteur = hauteur;
	}
	public int getLargueur() {
		return largueur;
	}
	public void setLargueur(int largueur) {
		this.largueur = largueur;
	}
	
	public void testBalle(Balle balle) {
		if(balle.getX() < 0 || balle.getX() > this.largueur) {
			balle.rebondir();
		}
		if(balle.getY() < 0 || balle.getY() > this.hauteur) {
			balle.rebondir();
		}
	}
	
	
}
