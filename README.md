# Poo
## Partie I
### l’implémentation d’une classe Date (jour, mois (enum), année). La classe comporte :
- Un constructeur sans paramètres et un constructeur avec paramètres,
- Une méthode Vérif () qui vérifie si une date est correcte ou non (le cas du mois de février doit être vérifié aussi).
- Une méthode Bissextile () qui vérifie si une année est bissextile ou non
- Une méthode Saisir () qui saisit une date au clavier en vérifiant que la date est correcte et demande de refaire la saisie jusqu’à introduire une date correcte.
- Une méthode Afficher () qui affiche une date
- Une méthode Compare (...) qui compare deux dates, retourne 0 si les deux dates sont égales, -1 si la première est inférieure à la deuxième et 1 sinon.

## Partie II
### l’implémentation d’une classe AdresseMail (nomUser, nomSite(enum), extension).La classe comporte :
- Un constructeur sans paramètres et un constructeur avec paramètres.
- Une méthode Saisir () qui saisit une adresse mail au clavier en vérifiant que les données sont correctes et demande de refaire la saisie jusqu’à introduire une adresse correcte.
- Une méthode toString () qui renvoie l’adresse mail sous forme d’une chaine de caractères.
- Une méthode Afficher () qui affiche une adresse mail (exemple section2a@gmail.com).
- Une méthode memeSite () qui vérifie si deux adresses email sont domiciliées dans le même site.
- Une méthode statique Egal (...) qui vérifie si deux adresses sont identiques.
- Une méthode d’instance Egal (...)
- Une méthode statique Compare (...) qui compare deux adresses mail, retourne 0 si les deux adresses sont égales, -1 si la première est inférieure à la deuxième et 1 sinon ( selon l’ordre lexicographique des nomUser puis des nomSite).
- Une méthode d’instance Compare (...)

## Partie III
### l’implémentation d’une classe Profil (définie pour une personne). La classe comporte :
- Un constructeur sans paramètres et un constructeur avec paramètres.
- Une méthode Saisir () qui saisit la description d’une personne au clavier en vérifiant que les données sont correctes.
- La méthode toString () redéfinie.
- Une méthode Afficher () qui affiche la description d’un profil.
- Une méthode ChangerMotdePass (...) qui modifie le mot de passe.
- Une méthode ChangerQuestion (...) permettant de changer la question secrète.
### l’implémentation d’une classe VectProfil représentant un vecteur dont les éléments sont de type Profil. La classe comporte :
- Un constructeur.
- Une méthode Remplir () qui remplit le vecteur.
- Une méthode Afficher () qui affiche le contenu du vecteur.
- Une méthode Existe (...) qui vérifie si un profil donné existe dans le vecteur (on vérifiera l’adresse mail).
- Une méthode Ajouter (...) qui ajoute un profil donné dans le vecteur s’il n’existe pas déjà.
- Une méthode trierParNom () qui trie le vecteur dans l’ordre croissant des noms de personnes (utiliser la méthode sort prédéfinie).
- Une méthode trierParDate () qui trie le vecteur dans l’ordre croissant des dates de naissance des personnes.
- Une méthode trierParAdresse ()qui trie le vecteur dans l’ordre croissant des adresses mails des personnes.
- Une méthode Supprimer (...) qui supprime un profil donné (on donnera l’adresse mail du profil à supprimer).
- Une méthode statique Extraire (...) qui extrait un nouveau vecteur comportant tous les profils dont les adresses mail sont domiciliées dans un site S donné (par exemple gmail).
- Une méthode d’instance Extraire (...).

## Partie IV : Utilisation des classes implémentées
### Dans une classe ProgProfil. La classe comporte :
#### une méthode statique **Menu ()** qui affiche le menu.
#### Une méthode statique **Main()** qui : 
selon le choix de l’utilisateur, affiche les différentes options du
menu permettant de :
- Créer un vecteur V de profils de taille n
- Remplir le vecteur de Profils (peut se faire par instanciations directes (valeurs données dans le constructeur, dans une méthode de remplissage que l’on écrira et qu’on appellera automatiquement).
- Ajouter des profils par saisie au clavier
- Modifier le mot de passe d’un profil donné (on donnera l’adresse mail pour la recherche)
- Modifier la question secrète d’un profil donné (on donnera l’adresse mail pour la recherche)
- Créer plusieurs vecteurs à partir du vecteur initial, on mettra dans un même vecteur tous les profils domiciliés dans un même site.
- Afficher les vecteurs nouvellement construits
