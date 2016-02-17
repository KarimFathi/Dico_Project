/*
 * Karim Fathi
 */
package dico_generique;

public class OrderedDictionaryG<T, S> extends AbstractDictionaryG <T, S> {
	
	public OrderedDictionaryG () {	
	}
	
		
	@Override
	int indexOf(T key) {
		if(this.isEmpty())
			return -1;
		else {
			int index = 1;
			boolean trouve = false;
			for (T k : this.key) {				
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

	@Override
	int size() {
		int pt = 0;
		for(T kk : this.key) {
			if (kk != null)
				pt++;
		}
		return pt;
	}

	@Override
	int newIndexOf(T key) {
		if(this.isEmpty())
			return 0;
		else {
			int index = 0;
			for (T k : this.key) {
				while (!key.equals(k)) {
					index++;
			    }
			}
			return index;
		}
	}
	

}
