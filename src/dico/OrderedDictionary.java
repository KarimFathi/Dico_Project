/*
 * Karim Fathi
 * Salim Belkebir 
 */
package dico;


public class OrderedDictionary extends AbstractDictionary {
		
	public OrderedDictionary() {
	}
	
	public OrderedDictionary(int tailleInitiale) {
		super.key = new String[tailleInitiale];
		super.value = new String[tailleInitiale];
	}
	
	public int indexOf(String key) {
		if(this.isEmpty())
			return -1;
		else {
			int index = 1;
			boolean trouve = false;
			for (String k : this.key) {				
				if (key.equals(k))
					trouve = true;
				else
					index++;
			}
			if (trouve)
				return index;
			else
				return -1;
		}
	}
		
	public int size() {
		int pt = 0;
		for(String kk : this.key) {
			if (kk != null)
				pt++;
		}
		return pt;
	}
		
	public int newIndexOf(String key) {
		if(this.isEmpty())
			return 0;
		else {
			int index = 0;
			for (String k : this.key) {
				while (!key.equals(k)) {
					index++;
			    }
			}
			super.key = new String[index-1];
			super.value = new String[index-1];
			return index;
		}
	}	
}
