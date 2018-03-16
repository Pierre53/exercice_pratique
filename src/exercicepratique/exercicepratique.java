package exercicepratique;

import java.text.DateFormat;
import java.util.Scanner;

public class exercicepratique {
	
	static String age;
	static String prenom;
	static String nom;
	static String date_de_naissance;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		// demande de présentation
		// création de la boucle pour demander le nom, prénom, age et date de naissance pour deux personnes
		do {
			System.out.println("nom");
			System.out.println("prénom");
			System.out.println("age");
			System.out.println("date_de_naissance");
			
			// On crée l'invit de commande pour demander les 4 informations désirées
			
			Scanner clavier = new Scanner(System.in);
			nom = clavier.nextLine();
			prenom = clavier.nextLine();
			age = clavier.nextLine();
			date_de_naissance = clavier.nextLine();
			System.out.println(nom +" "+ prenom +" "+ age +" "+  date_de_naissance);
			
			// boucle pour indiquer la majoritée
			
			if (Integer.parseInt(age) >= 18) { //Integer.parseInt() permet de transformer un objet en nombre entier
				System.out.println(nom +" "+ prenom + " est majeur");
				i ++;
			} 
			Object [] montableau = new Object[] {nom, prenom, age, date_de_naissance};
			// on affiche le tableau l'affichage est inclus dans la boucle
			for (Object x : montableau) {
				System.out.println(x);
		}	
		}	while (i < 2);
		
	}
}

		
	

