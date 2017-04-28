/**
 * 
 */
package tp8;

/**
 * @author foudre
 *
 */
public class Balle {
	private int x;
	private int y;
	private float g = 9.81f;
	private float vx;
	private float vy;
	private float largeur;

	public float getLargeur() {
		return largeur;
	}

	public void setLargeur(float largeur) {
		this.largeur = largeur;
	}

	public Balle(int x, int y, int largeur, float vx, float vy) {
		this.x = x;
		this.y = y;
		this.largeur = largeur;
		this.vx = vx;
		this.vy = vy;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public float getG() {
		return g;
	}

	public float getVx() {
		return vx;
	}

	public void setVx(float vx) {
		this.vx = vx;
	}

	public float getVy() {
		return vy;
	}

	public void setVy(float vy) {
		this.vy = vy;
	}

	public void lancer(int t) {
		if (vx <= 0) {
			this.vy = this.vy + g * t;
			this.y = (int) (this.y - vy * t);
			System.out.println("Vitesse vy " + vy + " Possition y : " + y);
		}
		else {
			this.vy = this.vy + g * t;
			this.y = (int) (this.y - this.vy * t - 0.5 *g *t);
			this.x = (int) (this.x + this.vx * t);
			System.out.println("Vitesse vy : " + vy + " Position y : " + y + " Position x : " + x);
			
		}

	}
	
	public void rebondir() {
		this.vx = -this.vx;
		this.vy = -this.vy;
		this.x = 100;
		this.y = 100;
		System.out.println("Rebond");
	}

}
