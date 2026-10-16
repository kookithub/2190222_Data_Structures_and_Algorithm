import java.util.ArrayList;

public class BSTList {
	BSTNodeList root;
	int size;

	public BSTList() {
		root = null;
		size = 0;
	}

	public BSTList(BSTNodeList root, int size) {
		this.root = root;
		this.size = size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void makeEmpty() {
		root = null;
		size = 0;
	}

	public BSTNodeList find(Pairdata v) {
		BSTNodeList t = root;
		
		while (t != null) {
		if (t.dataList.getFirst().first == v.first) {
			if (t.dataList.contains(v)) {
				return t;
			
			}
			return null;
		}
		else if (t.dataList.getFirst().first < v.first){
			t = t.right;
		}
		else {
			t = t.left;
		}
		
		}
		return null;
	}
	public BSTNodeList findnode(Pairdata v) {
		BSTNodeList t = root;
		
		while (t != null) {
		if (t.dataList.getFirst().first == v.first) {
			
			return t;
		}
		else if (t.dataList.getFirst().first < v.first){
			t = t.right;
		}
		else {
			t = t.left;
		}
		
		}
		return null;
	}
	
	
	public BSTNodeList insert(Pairdata v) {
		BSTNodeList parent = null;
		BSTNodeList temp = root;
		BSTNodeList exist = findnode(v);
		if(find(v)!= null) {return root;}
		else if (exist != null) {
			exist.dataList.add(v);
			size++;
			return root;
		}
		else {
		
		while (temp != null && !temp.dataList.contains(v)) {
			if (v.first < temp.dataList.getFirst().first) {
				parent = temp;
				temp = temp.left;

			} else {
				parent = temp;
				temp = temp.right;

			}
		}
		
		
		if (temp == null) {
			ArrayList<Pairdata> k = new ArrayList<>();
			k.add(v);
			BSTNodeList n = new BSTNodeList(k, null, null, parent);
			if (parent == null) {
				root = n;
			} else if (v.first < parent.dataList.getFirst().first) {
				parent.left = n;
			} else {
				parent.right = n;
			}
			size++;
			return root;
		} 
		return null;
		}
	}
	
	

}
