public class Sort {
	//Hint: You can create other methods and then use sortFrequency to call them.
	
	
	
	public static int[] sortFrequency(int[] x) {
		Pair[] p = new Pair[11];
		for (int i : x) {
			if (p[i]==null) {
				p[i] = new Pair(i,1);
			}
			else {p[i].freq++;}
		}
		int c = 0;
		for (Pair m : p) {
			if (m!=null) {
				c++;
			}
		}
		Pair[] r = new Pair[c];
		int[] y = new int[c];
		c=0;
		for (Pair m : p) {
			if (m!=null) {
				r[c] = m;
				c++;
			}
		}
		
		for(int i = r.length-1; i >=0  ; i--) {
			for (int j = 0; j < i; j++) {
				if (r[j].freq < r[j+1].freq) {
					Pair t = r[j];
					r[j] = r[j+1];
					r[j+1] = t;
				}
				else if (r[j].freq == r[j+1].freq) {
					if (r[j].value > r[j+1].value) {
						Pair t = r[j];
						r[j] = r[j+1];
						r[j+1] = t;
					}
				}
			}
			
		}
		c = 0;
		for (Pair w : r) {
			y[c] = w.value;
			c++;
		}
		return y;
		
	}
	

	

}
