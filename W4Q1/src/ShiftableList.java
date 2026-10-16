	
public class ShiftableList extends CDLinkedList {

	public ShiftableList() throws Exception {
		this("");
	}

	public ShiftableList(String s) throws Exception {
		// initialize the list
		// each data comes from each character in s
		int n = s.length();
		DListIterator d = new DListIterator(header);
		for (int i = n - 1; i >= 0; i--) {
			insert(s.charAt(i), d);
		}

	}

	//change the nth data (counting from header) to be a new first 
	//data of the list 
	public void shift(int n) throws Exception {
		try{
		

        DListIterator it = new DListIterator(header);
        for (int i = 0; i < n; i++) it.next();   // move from header to kth data node
		
		
		DListNode n1 = header.nextNode;
		DListNode p1 = header.previousNode;
		DListNode k1 = it.currentNode.previousNode;
		
		n1.previousNode = p1;
		p1.nextNode = n1;
		
		it.currentNode.previousNode = header;
		header.nextNode = it.currentNode;
		
		k1.nextNode = header;
		header.previousNode = k1;
		}
		catch (Exception e) {
			
		}
		
	}

	// shift the list such that the data at position newStart becomes the first data
	// for list a,b,c,d,e,f
	// if newStart is pointing at c, 
	// the new list will be c,d,e,f,a,b
	public void shift(DListNode newStart) {
		DListNode n1 = header.nextNode;
		DListNode p1 = header.previousNode;
		DListNode k1 = newStart.previousNode;
		
		
		n1.previousNode = p1;
		p1.nextNode = n1;
		
		
		newStart.previousNode = header;
		header.nextNode = newStart;
		
		k1.nextNode = header;
		header.previousNode = k1;
	} 
}
