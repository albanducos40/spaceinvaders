package fr.unilim.iut.spaceinvaders;

import moteurJeu.MoteurGraphique;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		final SpaceInvaders jeu = new SpaceInvaders(Constante.ESPACEJEU_LONGUEUR,Constante.ESPACEJEU_HAUTEUR);
		final DessinSpaceInvaders afficheur = new DessinSpaceInvaders(jeu);
		jeu.initialiserJeu();
		
		MoteurGraphique moteurJeu = new MoteurGraphique(jeu, afficheur);
		moteurJeu.lancerJeu(Constante.ESPACEJEU_LONGUEUR, Constante.ESPACEJEU_HAUTEUR);
	}
}
