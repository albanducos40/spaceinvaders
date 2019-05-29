## The Spaceinvaders Project

## Séance n°1
# (Semaine du 29 Avril au 4 Mai, réalisée le 04/05/2019)

Objectif de la séance : Déplacer un vaisseau dans l'espace de jeu (fini)

Nombre de fonctionnalités implémentées durant la séance : 1

Description du travail réalisé durant cette séance :

Fonctionnalité n°1 : Déplacer un vaisseau dans l'espace de jeu (fini)

Story n°1 : Créer un espace de jeu :
- Un espace de jeu est créé aux dimensions données (2D) 
- Cet espace de jeu est vide


Story n°2 : Positionner un nouveau vaisseau dans l’espace de jeu :
- Un nouveau vaisseau est créé
- Le vaisseau est positionné aux coordonnées transmises
- Si un nouveau vaisseau essaye d’être positionné en dehors des limites de l’espace jeu, alors une exception devra être levée.

 Contraintes :
  - La position souhaitée est transmise par ses coordonnées x et y.
  - Le coin supérieur gauche de l’espace jeu (point en haut à gauche) a pour coordonnées (0,0)
  - La taille du vaisseau est réduite pour l'instant à son minimum (1 seul point)    


Story n°3 : Déplacer le vaisseau vers la droite dans l'espace de jeu
- Le vaisseau se déplace d'un pas vers la droite 
- Si le vaisseau se trouve sur la bordure droite de l'espace de jeu, le vaisseau doit rester immobile (aucun déplacement, aucune exception levée : le vaisseau reste juste à sa position actuelle).


Story n°4 : Déplacer le vaisseau vers la gauche dans l'espace de jeu
- Le vaisseau se déplace d'un pas vers la gauche 
- Si le vaisseau se trouve sur la bordure gauche de l'espace de jeu, le vaisseau doit rester immobile (aucun déplacement, aucune exception levée : le vaisseau reste juste à sa position actuelle).

Remarque: Pour pouvoir, mettre en place les tests, il a été nécessaire d’ajouter une fonctionnalité supplémentaire qui permet de représenter l’espace de jeu dans une chaîne ASCII.

## **Diagramme de classes (séance n°1)**

![alt text](https://github.com/albanducos40/spaceinvaders/blob/master/diagramme1.PNG)

__**Fonctionnalité en cours d’implémentation :**__ Aucune


# **Séance n°2**
### (Semaine du 06 mai au 11 Mai, réalisée le 07/05/2019)

 **Fonctionnalité n°2 : Dimensionner le vaiseau (fini)**

**Etape n°1 : Positionner un nouveau vaisseau avec une dimension donnée**
Nous devons donner une position et une dimension à notre vaisseau préalablement créer. Ses caractéristiques ne doivent pas dépasser du l'espace de jeu.

**Etape n°2 : Faire en sorte qu'il soit impossible de positionner un nouveau vaisseau qui déborde de l'espace de jeu**
Ecriture de tests par rapport aux débordements possibles.

**Etape n°3 : Déplacer un vaisseau vers la droite en tenant compte de sa dimension**
Nous faisons en sorte de faire déplacer le vaisseau à travers des tests qu'il devra valider pour faire avancer le projet.

**Etape n°4 : Déplacer un vaisseau vers la gauche en tenant compte de sa dimension**
Pour tester le déplacement du vaisseau vers la gauche (cas normal et cas limite), nous nous appuyerons sur les exemples suivants :

- Exemple n°1 : le vaisseau se déplace normalement vers la gauche avec par exemple dans un espace de dimensions (15, 10) un vaisseau de dimensions (3,2) positionné en (7,9) qui se retrouve à la position (6,9) après un déplacement vers la gauche.

- Exemple n°2 : le vaisseau reste immobile s'il est déjà sur la bordure gauche de l'espace de jeu avec par exemple dans un espace de dimensions (15, 10) un vaisseau de dimensions (3,2) positionné en (0,9) reste à la position (0,9) après un déplacement vers la gauche.

**Etape n°5 : refactorer la classe de test SpaceInvadersTest (Primitive Obsession)**
Nous faisons du refactoring pour rendre un code de qualité.

**Etape n°6 : Refactorer la classe Vaisseau (un Vaisseau a une Position et a une Dimension)**
Refactorer la classe Vaisseau de manière à ce qu'elle soit associée à ces deux classes c'est à dire faire apparaître un attribut de type Dimension et un attribut de type Position dans la classe Vaisseau de manière à ce que l'on puisse dire qu'un Vaisseau A-UNE Dimension et qu'un Vaisseau A-UNE Position.

## **Diagramme de classes séance 2**
![alt text](https://github.com/JeffAnnan/spaceinvaders/blob/master/data/s1Data/diagrammeClasseRapport1.jpg)

## **Nuage de mots du projet spaceinvaders (séance n°2)**
![alt text](https://github.com/JeffAnnan/spaceinvaders/blob/master/data/s1Data/spaceinvadersWordCloudSeance1.jpg)

# **Séance n°3**
### **(Semaine du 13 mai au 18 Mai, réalisée le 14/05/2019) 

## **Fonctionnalité n°3 : Choisir la vitesse du vaisseau (fini)**
L'objectif de cette fonctionnalité est de pouvoir choisir la vitesse du vaisseau afin que le vaisseau puisse se déplacer à une vitesse convenable dans l'application graphique.

# Etape 1 : Ajouter la vitesse au vaisseau sans régression de comportement
Il faut dans cette étape ajouter une vitesse au vaisseau.
Pour se faire, nous allons procéder en plusieurs étapes :
**Premièrement** nous allons ajouter un attribut vitesse à la classe vaisseau
**Ensuite** nous allons introduire la vitesse dans le code existant

# Etape 2 : Régler la vitesse du vaisseau :
il Faut pour cette étape créer une constante VITESSE_VAISSEAU et modifier le constructeur de la classe Vaisseau?

# Etape 3 : Faire en sorte que le déplacement se fasse correctement pour une vitesse quelconque :
Nous allons créer des tests afin de vérifier le bon déplacement du vaisseau

## **Diagramme de classes séance 3**
![alt text](https://github.com/albanducos40/spaceinvaders/blob/master/Diagramme3.PNG)

## **Nuage de mots du projet spaceinvaders (séance n°3)**
![alt text](https://github.com/albanducos40/spaceinvaders/blob/master/nuageMots3.PNG)


# **Séance n°4**
### (Semaine du 20 mai au 25 Mai, réalisée le 23/05/2019)

## **Fonctionnalité n°4 : Tirer un missile depuis le vaisseau**

L'objectif de cette fonctionnalité est de pouvoir tirer un missile depuis le vaisseau afin de donner un peu plus d'interactivité au jeu.
Pour réaliser cet objectif, il faut faire en sorte, qu'à chaque tir, un nouvel objet missile soit ajouté au jeu, en prenant soin de bien positionner ce missile au dessus du vaisseau au moment du tir. Une fois tiré, le missile devra se déplacer à la verticale de manière autonome et disparaître du jeu une fois le haut de l'écran de jeu atteint.

**Etape n°1 : Faire apparaître Sprite via un Extract Superclass**
Après avoir imginé le design de notre missile, nous créons une superClasse appelée Sprite qui contiendra Vaisseau et Missile.
Puis nous faisons du refactoring pour améliorer la qualité de notre code et éviter les répétitions inutiles.

**Etape n°2 : Tirer un missile en TDD**
Nous allons créer les méthodes propres au tir du missile et desuite implémenter les tests adéquats afin de respecter le bon déroulement du jeu et la méthode TDD. Sans oublier bien sûr du refactoring pour la qualité du code.

**Etape n°3 : Et bien, jouons maintenant !**
Nous allons devoir implémenter notre moteur graphique de la commande tir pour permettre au vaisseau de tirer un missile.

## **Diagramme de classes (séance n°4)**
![alt text](https://github.com/albanducos40/spaceinvaders/blob/master/Diagramme4.PNG)

## **Nuage de mots du projet spaceinvaders (séance n°2)**

![alt text](https://github.com/albanducos40/spaceinvaders/blob/master/nuageMots4.PNG)
