package exam05;

import exam2.Test;

public class Key {
		int id;
		
		public Key(int id) {
			this.id = id;
		}
		
		
		public int hashCode() {
			return id;
			
		}
		
		public boolean equals(Object obj) {
			if(obj instanceof Key) 
				return true;
				
			
		}

}
