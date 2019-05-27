package fr.unilim.iut.spaceinvaders;

import fr.unilim.iut.spaceinvaders.utils.Dimension;
import fr.unilim.iut.spaceinvaders.utils.Position;
import moteurJeu.Commande;

public class Missile extends Sprite{

	public Missile(Dimension dimension, Position position, int vitesse) {
		super(dimension, position, vitesse);
	}

	public void deplacer(Commande c) {
		if (c.tir) {
			this.deplacerVerticalementVers(Direction.HAUT_ECRAN);
		}
	}
	
}
