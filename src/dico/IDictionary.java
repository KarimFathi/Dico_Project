/*
 * Karim Fathi
 * Salim Belkebir 
 */
package dico;

public interface IDictionary {
	
	public String get(String key);            
	public void put(String key, String value); 
	public boolean isEmpty();         
	public boolean containsKey(String key);  

}
