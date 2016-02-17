/*
 * Karim Fathi
 * Salim Belkebir 
 */
package dico_generique;

public class Main {

	public static void main(String[] args) {
		
		OrderedDictionaryG<String, String> ODG = new OrderedDictionaryG<String, String>();
		ODG.put("vache", "animale doméstique");
		ODG.put("rose", "fleur du rosier");
		ODG.put("cargo", "navire de charge");
		ODG.put("mississipi", "fleuve se jetant dans le golf du Méxique");
		System.out.println("\nAffichage du contenu du dictionnaire : " + ODG.toString());
		System.out.println("\nCe dictionnaire est-il vide : " + ODG.isEmpty());
		System.out.println("Nombre de couple clé - valeur éfectivement contenu dans le dictionnaire : " + ODG.size());
		System.out.println("Donnez la définition du mot 'cargo' : " + ODG.get("cargo"));		
	}
}
