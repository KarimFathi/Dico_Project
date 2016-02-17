/*
 * Karim Fathi
 * Salim Belkebir 
 */
package dico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------------------------------1-------------------------------------------");
		System.out.println("Veuillez saisir la taille du dictionnaire (Il faut que ça soit un entier) :");
		int i = sc.nextInt();
		System.out.println("Instancier un dictionnaire de longueur : " + i);
		OrderedDictionary dd = new OrderedDictionary(i);
		System.out.println("\nAffichage du contenu du dictionnaire : " + dd.toString());
		System.out.println("\nCe dictionnaire est-il vide : " + dd.isEmpty());
		System.out.println("Nombre de couple clé - valeur éfectivement contenu dans le dictionnaire : " + dd.size());
		
		System.out.println("\n\n---------------------------------2-------------------------------------------");
		dd.put("vache", "animale doméstique");
		System.out.println("\nAffichage du contenu du dictionnaire : " + dd.toString());
		System.out.println("\nCe dictionnaire est-il vide : " + dd.isEmpty());
		System.out.println("Nombre de couple clé - valeur éfectivement contenu dans le dictionnaire : " + dd.size());
		System.out.println("Donnez la définition du mot 'cargo' : " + dd.get("cargo"));
		
		System.out.println("\n\n---------------------------------3-------------------------------------------");
		dd.put("rose", "fleur du rosier");
		dd.put("cargo", "navire de charge");
		dd.put("mississipi", "fleuve se jetant dans le golf du Méxique");
		System.out.println("\nAffichage du contenu du dictionnaire : " + dd.toString());
		System.out.println("\nCe dictionnaire est-il vide : " + dd.isEmpty());
		System.out.println("Nombre de couple clé - valeur éfectivement contenu dans le dictionnaire : " + dd.size());
		System.out.println("Donnez la définition du mot 'cargo' : " + dd.get("cargo"));
	}

}
