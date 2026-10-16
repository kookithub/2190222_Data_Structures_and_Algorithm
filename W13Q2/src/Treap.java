public class Treap {
	TreapNode root;
	int size;
	
	public Treap() {
		root = null;
		size = 0;
	}
	
	public TreapNode insert(int v, int h) {
		TreapNode n = BST(v,h);
		
		while(n.parent !=null && n.heapValue < n.parent.heapValue) {
			if (n.parent.left == n) {
				n = rotateright(n);
			}
			else {
				n = rotateleft(n);
			}
		}
		
		return n;
	}
	
	
	public TreapNode BST(int v,int h) {
		TreapNode parent = null;
		TreapNode temp = root;
		
		// This first part is almost the same as find,
		// but it has an extra pointer called parent.
		while (temp != null && temp.bstValue != v) {
			if (v < temp.bstValue) {
				parent = temp;
				temp = temp.left;

			} else {
				parent = temp;
				temp = temp.right;

			}
		}

		if (temp == null) {
			TreapNode n = new TreapNode(v, h, null, null, parent);
			if (parent == null) {
				root = n;	
			} else if (v < parent.bstValue) {
				parent.left = n;
			} else {
				parent.right = n;
			}
			size++;
			return n;
		} else {
			// we do nothing since
			// we don't want to add duplicated data.
			return null;
		}

	}	
	
	public TreapNode rotateright(TreapNode j) {
		TreapNode n = j.parent;
		
		TreapNode l = n.left;
		TreapNode lr = n.left.right; // can be null
		n.left = lr;
		if (lr != null) {
			lr.parent = n;
		}
		l.right = n;
		l.parent = n.parent;
		if (n.parent == null) {
	        root = l; 
		}
		else if (n.parent.left == n) {
	        n.parent.left = l;
		} 
		else {
		    n.parent.right = l;
		 }
		n.parent = l;
		return l;
	}

	public TreapNode rotateleft(TreapNode j) {
		TreapNode n = j.parent;
		
		TreapNode r = n.right;
		TreapNode rl = n.right.left; // can be null
		n.right = rl;
		if (rl != null) {
			rl.parent = n;
		}
		r.left = n;
		r.parent = n.parent;
		if (n.parent == null) {
	        root = r; 
		}
		else if (n.parent.left == n) {
	        n.parent.left = r;
		} 
		else {
		    n.parent.right = r;
		 }
		n.parent = r;
		return r;
	}
	
}