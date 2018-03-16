package exercicepratique;

import java.util.Scanner;

/**
 * 
 * @author PDU
 *@version
 *
 */

//Contrainte : tableau, boucle, scaner, condition (si majeur : afficher)
public class correctionexercicepratique {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// On crée un tableau en deux dimensions qui représente mes utilisateurs
		Object[][] informationUtilisateur = new Object[2][4]; // Premier encadrement c'est "y" (ligne) et le deuxième encadrement c'est "x" (colonne)
		
		//On importe le scanner en passant la souris sur le premeier mot et en sélectionnant la première importation, on crée le clavier
		Scanner clavier = new Scanner(System.in);
		
		//Je déclare sans initialiser 3 variables du même type
		//Pour demander ces infos, on va créer une fonction
		String nom, prenom, dateDeNaissance;
		
		//On crée une boucle for pour créer nos utilisateurs
		// On connait les bornes de la boucles. [0;2[
		for (int utilisateurCrees = 0; utilisateurCrees < 2; utilisateurCrees++) {
			prenom = recupererPrenom(clavier);
			nom = recupererNom(clavier);
			dateDeNaissance = recupererDateDeNaissance(clavier);
			String dateAujourdHui = "15/03/2018";
			byte age = calculerAge(dateAujourdHui, dateDeNaissance);
			System.out.println(age);
			
			// On affiche la majoritée de la personne
			verifierMajorite(nom, prenom, age); // en appuyant sur CTRL+clique gauche sur la fonction, on peut demander à Eclipse de nous ramener vers la fonction au niveau du code.

			 // on ne peut pas faire de comparaison avec switch, il vaut mieux utiliser if
			// on initialise le tableau en fonction de l'utilisateur
			
			informationUtilisateur[utilisateurCrees][0] = nom; 
			informationUtilisateur[utilisateurCrees][1] = prenom;
			informationUtilisateur[utilisateurCrees][2] = dateDeNaissance;
			informationUtilisateur[utilisateurCrees][3] = age;
			
			
			
		}
		
		afficherTableau2D(informationUtilisateur);

	}

	private static void afficherTableau2D(Object[][] informationUtilisateur) {
		for (int index = 0; index < informationUtilisateur.length; index++) {
			for (Object information : informationUtilisateur[index]) {
				System.out.println(information);
			}
		}
	}

	/**
	 * 
	 * @param nom
	 * @param prenom
	 * @param age
	 */
	
	private static void verifierMajorite(String nom, String prenom, byte age) {
		if (age < 18) {
			System.out.println(nom + " " + prenom +" n'est pas majeur.");
		}
		else {
			System.out.println(nom + " " + prenom +" est majeur.");
		}
	}
	
	
/**
 * Calcule la difference d'années entre deux dates
 * @param dateAujourdHuiCopie date d'aujourd'hui
 * @param dateDeNaissanceCopie date d'anniversaire
 * @return Age calculé
 */
	private static byte calculerAge(String dateAujourdHuiCopie, String dateDeNaissanceCopie) {
		// TODO Auto-generated method stub
		short anneeDeNaissance = Short.parseShort(dateDeNaissanceCopie.split("/")[2]); //la fonction parse permet de transformer en ce que l'on veut, il suffit juste de mettre ce que l'on veut avant la fonction parse
		short anneeDAujourdHui = Short.parseShort(dateAujourdHuiCopie.split("/")[2]);
		
		return (byte) (anneeDAujourdHui - anneeDeNaissance);
	}

	//pour une fonction on utilise en général un verbe
	/**
	 * Récupérer le prénom d'une personne.
	 * @param clavierCopie Object de type Scanner.
	 * @return Prenom de l'utilisateur.
	 */
	
	static String recupererPrenom(Scanner clavierCopie) {
		//Vérifier qu'un prénom est au bon format.
		boolean verificateur = false;
		String firstName;
		
		// On doit au moins rentrer une fois dans la boucle.
		// On boucle tant que le vérificateur est faux.
		
		do {
			System.out.print("Entrez votre prénom : ");
			firstName = clavierCopie.nextLine();
			
			if (firstName.length()>= 3) {
				// On vérifie que le prénom est composé d'au moins 3 lettres
				verificateur = firstName.chars().allMatch(Character::isLetter); //allMatch vérifie chaque caractère si c'est bien de type lettre
				
				// Si le prénom ne contient que des lettres.....
				if (verificateur == true) { // les expressions régulières ne sont pas pris en compte dans la fonction contains. Avec la fonction matches ça marche.
				// tout est OK
				System.out.println("OK");
			}
			}
			
		} while (verificateur != true);
		
		// On veut des vrais prénoms, que des lettres, pas de chiffres
		return firstName;
		
	}
	
	/**
	 * Récupérer le nom d'une personne
	 * @param clavierCopie Object de type Scanner.
	 * @return nom de l'utilisateur
	 * 
	 */
	
	static String recupererNom(Scanner clavierCopie) {
		//Vérifier qu'un nom est au bon format.
		boolean verificateur = false;
		String lastName;
		
		// On doit au moins rentrer une fois dans la boucle.
		// On boucle tant que le vérificateur est faux.
		
		do {
			System.out.print("Entrez votre nom : ");
			lastName = clavierCopie.nextLine();
			if (lastName.length()>= 3) {
				// On vérifie que le nom est composé d'au moins 3 lettres
				verificateur = lastName.chars().allMatch(Character::isLetter); //allMatch vérifie chaque caractère si c'est bien de type lettre
				
				// Si le nom ne contient que des lettres.....
				if (verificateur == true) { // les expressions régulières ne sont pas pris en compte dans la fonction contains. Avec la fonction matches ça marche.
				// tout est OK
				System.out.println("OK");
			
			}
			}
		} while (verificateur != true);
		
		return lastName;
	}
	
	/**
	 * Récupérer la date de naissance d'une personne
	 * @param clavierCopie Object de type Scanner.
	 * @return date de naissance de l'utilisateur
	 */
	
	static String recupererDateDeNaissance (Scanner clavierCopie) {
		//Vérifier qu'une date de naissance est au bon format.
			String firstDate;
			
			System.out.print("Entrez votre date de naissance (XX/XX/YYYY) : ");
			firstDate = clavierCopie.nextLine();
			
		return firstDate;
			
	}
	
	
}
