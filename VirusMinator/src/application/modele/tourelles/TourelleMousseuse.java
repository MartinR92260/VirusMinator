package application.modele.tourelles;

public class TourelleMousseuse extends Tourelles {

	
	// cette tourelle ralentit les ennemis mais inflige peu de d�g�ts

	public TourelleMousseuse(double atq, int portee, double atqSpeed, double slow, String nom, int x, int y) {
		super(atq, portee, atqSpeed, slow, nom, x, y);
	}
	

	@Override
	public void amelioration() {


		this.setAtq(this.getAtq()*1.2);
		this.setPortee(this.getPortee()+5);
		this.setAtqSpeed(this.getAtqSpeed()+1);		
	}

}
