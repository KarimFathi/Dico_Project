/*
 * Karim Fathi
 */
package dico_generique;

public interface IDictionaryG<T, S> {	
	public S get(T key);            
	public void put(T key, S value); 
	public boolean isEmpty();         
	public boolean containsKey(T key);  
}
