/*
 * Karim Fathi
 * Salim Belkebir 
 */
package dico;

public abstract class AbstractDictionary implements IDictionary {
	
	protected String[] key;
	protected String[] value;
		
	abstract int indexOf(String key);
	abstract int size();
	abstract int newIndexOf(String key);
		
	@Override
	public String get(String key) {
		String valeur = null;
		int index = 0;
		for (String kk : this.key) {
			if (kk == key)
				valeur = this.value[index];
			else{
				index++;
			}
		}
		return valeur; 
	}	
	
	@Override
	public void put(String key, String value) {
		this.key[this.size()] = key;
		this.value[this.size()-1] = value;
		System.out.println("on a ajouter le couple : " +key+ " - " +value);
	}
	
	@Override
	public boolean isEmpty() {
		if(this.key[0] == null)
			return true;
		else
			return false;
	}
	
	@Override
	public boolean containsKey(String key) {
		boolean contCle = false;
		for (int i = 0; i < this.key.length; i++){
			while(!this.key[i].equals(key)){
				contCle = false;
			}
		}
		return contCle;		
	} 
	
	public String toString() {
		String str = "" ;
		for (int i = 0 ; i < key.length ; i++)
			str += "\nA l'index : " +i+ " on a le mot : " +this.key[i]+ ", qui a la définition : " +this.value[i];
		return str;
	}	
}
