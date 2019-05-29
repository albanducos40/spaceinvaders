package fr.unilim.iut.spaceinvaders;

import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Graphics2D;

import moteurJeu.DessinJeu;

public class DessinSpaceInvaders implements DessinJeu {

	private SpaceInvaders jeu;
	
	public DessinSpaceInvaders(SpaceInvaders jeu) {
		this.jeu = jeu;
	}
	
	private void dessinerVaisseau(int x, int y, int dx, int dy, BufferedImage img) {
		Graphics2D crayon = (Graphics2D) img.getGraphics();
		crayon.setColor(Color.GRAY);
		crayon.fillRect(x,  y , dx, dy);
	}
	
	private void dessinerMissile(int x, int y, int dx, int dy, BufferedImage img) {
		Graphics2D crayon = (Graphics2D) img.getGraphics();
		crayon.setColor(Color.BLUE);
		crayon.fillRect(x, y, dx, dy);
	}
	
		
	public void dessiner(BufferedImage image) {

		SpaceInvaders j = (SpaceInvaders) jeu;
		Vaisseau vaisseau = j.getVaisseau();

		this.dessinerVaisseau(vaisseau.origine.abscisse(),
				vaisseau.ordonneeLaPlusBasse(),
				vaisseau.dimension.longueur(),
				vaisseau.dimension.hauteur(),image);
		
		if (j.aUnMissile()) {
			Missile missile = j.getMissile();
			this.dessinerMissile(missile.origine.abscisse(), 
					missile.ordonneeLaPlusBasse(),
					missile.dimension.longueur(),
					missile.dimension.hauteur(),image);
		}
		
	}

	
	

}
