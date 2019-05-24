package fr.unilim.iut.spaceinvaders;

import fr.unilim.iut.spaceinvaders.utils.Dimension; 
import fr.unilim.iut.spaceinvaders.utils.Position;
import moteurJeu.Commande;

public class Vaisseau extends Sprite {

    public Vaisseau(Dimension dimension, Position positionOrigine, int vitesse) {
	    super(dimension, positionOrigine, vitesse);
    }

    public Missile tirerUnMissile(Dimension dimensionMissile, int vitesseMissile) {
    	if (dimensionMissile.longueur() > this.getDimension().longueur()) {
    		throw new MissileException("la longueur du missile est supérieure à celle du vaisseau");
    	}
		Position positionOrigineMissile = calculerLaPositionDeTirDuMissile(dimensionMissile);
		return new Missile(dimensionMissile, positionOrigineMissile, vitesseMissile);
	}

    public Position calculerLaPositionDeTirDuMissile(Dimension dimensionMissile) {
    	int abscisseMilieuVaisseau = this.abscisseLaPlusAGauche() + (this.getLongueur() / 2);
    	int abscisseOrigineMissile = abscisseMilieuVaisseau - (dimensionMissile.longueur() / 2);

    	int ordonneeeOrigineMissile = this.ordonneeLaPlusBasse() - 1;
    	Position positionOrigineMissile = new Position(abscisseOrigineMissile, ordonneeeOrigineMissile);
    	return positionOrigineMissile;
    }
    
    public void deplacer(Commande c) {
    	if (c.gauche) {
    		this.seDeplacerVersLaGauche();
    	}
    	if (c.droite) {
    		this.seDeplacerVersLaDroite();
    	}
    }
}

