/*
 * Karim Fathi 
 */
package dico_generique;

public abstract class AbstractDictionaryG <T, S> implements IDictionaryG<T, S> {
	
	protected T[] key;
	protected S[] value;
		
	abstract int indexOf(T key);
	abstract int size();
	abstract int newIndexOf(T key);
	
	@Override
	public S get(T key) {
		S valeur = null;
		int index = 0;
		for (T kk : this.key) {
			if (kk == key)
				valeur = this.value[index];
			else{
				index++;
			}
		}
		return valeur; 
	}

	@Override
	public void put(T key, S value) {
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
	public boolean containsKey(T key) {
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
			str += "\nA l'index : " +i+ " on le numéro : " +this.key[i]+ ", qui corréspond à : " +this.value[i];
		return str;
	}

}
