## Séance n°4

Objectif de la séance : Créer interface graphique et missile + envahisseur (fini)

Nombre de fonctionnalités implémentées durant la séance : 1

Description du travail réalisé durant cette séance :

Fonctionnalité n°1 : Tirer un missile depuis le vaisseau (fini)

Etape n°1 : Quick Design Session : Comprendre ce qu'est un missile et refactorer (diagramme de classes) : 
cromprendre la modélisation du missile et refactorer notre code


Etape n°2 :  un Vaisseau EST-UN Sprite (un peu de refactoring via Extract Superclass) :
Création d'une superclasse Sprite pour les classes Missile et Vaisseau
Refactoring    



Etape n°3 : Tirer un missile en TDD 
le vaisseau tire un missile de bas en haut
si le missile se toruve sur la bordure haute de l'espace jeu, un autre ne sera pas tiré. On ne peut tirer qu'un missile à la fois.    


Etape n°4 : Jouer
Tester fonctionnalité de notre code et de notre missile.




Nuage de mots du projet spaceinvaders (séance n°1)  
[!alt text](https://github.com/albanducos40/spaceinvaders/blob/master/nuageMots4.PNG)

Diagramme de classes :
[!alt text](https://github.com/albanducos40/spaceinvaders/blob/master/Diagramme4.PNG)
 

