# 08.06.2022 - Algorithmics

| Exercice |                                                                  Code                                                                  |  Progress |
|:--------:|:--------------------------------------------------------------------------------------------------------------------------------------:|:----------:|
|    1     | [Exercice 1](https://github.com/ImNotTheGuy/formation-2-algorithmics/blob/dec58165ef192d29e083987428782b0c217749c6/src/Exercice1.java) | Completed |
|    2     | [Exercice 2](https://github.com/ImNotTheGuy/formation-2-algorithmics/blob/dec58165ef192d29e083987428782b0c217749c6/src/Exercice2.java) | Completed |
|    3     | [Exercice 3](https://github.com/ImNotTheGuy/formation-2-algorithmics/blob/dec58165ef192d29e083987428782b0c217749c6/src/Exercice3.java) | Completed |
|    4     | [Exercice 4](https://github.com/ImNotTheGuy/formation-2-algorithmics/blob/dec58165ef192d29e083987428782b0c217749c6/src/Exercice4.java) | Completed |
|    5     | [Exercice 5](https://github.com/ImNotTheGuy/formation-2-algorithmics/blob/dec58165ef192d29e083987428782b0c217749c6/src/Exercice5.java) | Completed |

# Exercice 1


## Instruction:

Ecrire un algorithme qui demande l'âge d'un enfant.
Ensuite, il l'informe de sa catégorie :

« Poussin » de 7 à 9 ans

« Pupille » de 10 à 11 ans

« Benjamin » de 12 à 13 ans

« Minime » de 14 à 15 ans

« Cadet » 16 à 17 ans

## Algorithme:

```
PRENDRE INPUT DE L'UTILISATEUR ET STOCKER DANS UN INT 'age'

IF 'age' < 7: OUTPUT: "TROP PETIT"

ELSE IF  'age' <= 9: OUTPUT: "POUSSIN"

ELSE IF  'age' <= 11: OUTPUT: "PUPILLE"

ELSE IF  'age' <= 13: OUTPUT: "BENJAMIN"

ELSE IF  'age' <= 15: OUTPUT: "MINIME"

ELSE IF  'age' <= 17: OUTPUT: "MINIME"

ELSE: OUTPUT: "TROP GRAND"

END IF
```


# Exercice 2

## Instructions

Ecrire un programme Java qui demande à l'utilisateur de saisir la valeur du diamètre, et qui ensuite va effectuer le calcul de la surface.

Surface = Rayon x Rayon x PI;
Rayon = Diamètre / 2

## Algorithme

```
PRENDRE INPUT DE L'UTILISATEUR ET STOCKER DANS UN FLOAT 'diametre'

CRÉER VARIABLE FLOAT (OU DOUBLE) 'surface'
CRÉER VARIABLE FLOAT (OU DOUBLE) 'rayon'

AFFECTER À 'rayon' LA VALEUR: 'diametre' / 2
AFFECTER À 'surface' LA VALEUR: 'rayon' **2 * PI

```

# Exercice 3

## Instructions

Ecrire un programme Java qui demande à l'utilisateur de saisir son nom,
prenom et age, et qui ensuite va afficher le message :
"Vous vous appelez <prenom> <nom>, et vous avez <age> ans"

## Algorithme

```

PRENDRE INPUT DE L'UTILISATEUR ET STOCKER DANS UN STRING 'nom'
PRENDRE INPUT DE L'UTILISATEUR ET STOCKER DANS UN STRING 'prenom'
PRENDRE INPUT DE L'UTILISATEUR ET STOCKER DANS UN INT 'age'

OUTPUT UN STRING: "Vous vous appelez " + 'prenom' + " " + 'nom' + "et vous avez " + 'age'+ " ans"
```


# Exercice 4 

## Instructions

Ecrire un programme Java qui déclare 3 variables, a,b,c et qui va ensuite effectuer une permutation de ces valeurs :
Exemple :
Entrez la première valeur(a) : 51
Entrez la deuxième valeur(b) : 876
Entrez la troisième valeur(c) : 235
Les valeurs entrées sont : a = 51, b = 876 et c = 235
Permutation: b <== a, c <== b, a <== c
Les valeurs permutées sont : a = 235, b = 51 et c = 876

## Alogrithme

```
DECLARER VARIABLE INT 'a'
DECLARER VARIABLE INT 'b'
DECLARER VARIABLE INT 'c'

PRENDRE INPUT UTILISATEUR SUR CHAQUE VARIABLE

AFFECTER À 'a' LA VALEUR: 51
AFFECTER À 'b' LA VALEUR: 876
AFFECTER À 'c' LA VALEUR: 235

AFFECTER À 'b' LA VALEUR: 'a'
AFFECTER À 'c' LA VALEUR: 'a'
AFFECTER À 'a' LA VALEUR: 'c' <-- Inutile car 'c' vaut déjà 'a'.



```


# Exercice 5

## Instructions


Ecrivez un programme Age.java qui :
declare l'âge de l'utilisateur ;
lit la réponse de l'utilisateur et l'enregistre dans une variable age de type entier ;
Effectue le calcul de l'année de naissance de l'utilisateur et l'enregistre dans la variable annee de type entier ;
affiche l'année de naissance ainsi calculée.

## Algorithme

```
PRENDRE INPUT DE L'UTILISATEUR ET STOCKER DANS UN INT 'age'
DÉCLARER VARIABLE INT 'yearBorn'

AFFECTER À 'yearBorn' la valeur: 2022 - 'age'.
```