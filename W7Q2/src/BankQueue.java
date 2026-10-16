
public class BankQueue { // must work for any implementation of DeQ
	DeQ[] counters;
	DeQ special;

	public BankQueue(DeQ[] counters, DeQ special) {
		super();
		this.counters = counters;
		this.special = special;
	}

	//Write this method
	public void distribute() throws Exception {
		int np = 0;
		int nc = 0;
		for(DeQ c : counters) {
			np += c.size();
			nc++;
		}
		double nq = (double) np/(nc+1);
		int nql = np/(nc+1);
		if(nq-nql >= 0.5) {
			nql++;
		}
		
		
		
		for(DeQ c : counters) {
			
			DeQ temp = new DeQArray();
			
			while (c.size()>nql) {
				temp.insertFirst(c.back());
				c.removeLast();
				
			}
			
			while (special.size()<nql &temp.size() != 0) {
				special.insertLast(temp.front());
				temp.removeFirst();
				
			}
			
			if(temp.size() != 0) {
				while(temp.size()!=0) {
					c.insertLast(temp.front());
					temp.removeFirst();
					
				}
			}
		
		}
		if(special.size() == 0) {
			special.insertFirst(counters[nc-1].back());
			counters[nc-1].removeLast();
		}
		
	}

}
