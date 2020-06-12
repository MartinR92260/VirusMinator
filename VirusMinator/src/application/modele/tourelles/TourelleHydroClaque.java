package application.modele.tourelles;

import java.util.ArrayList;

import application.modele.Environnement;
import application.modele.tir.Tir;
import application.modele.tir.TirAvecDegats;
import application.modele.virus.Virus;

public class TourelleHydroClaque extends TourellesAvecDegats {

	// cette tourelle dispose d�un petit champs de tir mais asperge les ennemis
	// non-stop

	public TourelleHydroClaque( int x, int y, Environnement env) {
		super(50, 1, "TourelleHydroClaque", x, y, env);
		this.setAtq(10);
	}

	public void amelioration() {

		this.setAtq(this.getAtq() * 1.2);
		this.setPortee(this.getPortee() + 5);

	}

	@Override
	public void tirer() {
		ArrayList<Virus> v = PlusieursVirusAPorteeDeTir();
		for (int i = 0; i < v.size(); i++) {
			Tir t1 = new TirAvecDegats(this.getX(), this.getY(), v.get(i), this.env, this.getAtq(), this.getPortee());
			this.env.ajouterListeTirs(t1);
			
		}
		// VirusAPorteeDeTir().setVie(VirusAPorteeDeTir().getVie()-this.getAtq());
		// code pour tirer / apelle de la m�thode tir

	}


}
