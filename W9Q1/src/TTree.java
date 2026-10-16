
public class TTree {
	Node[][] theArray;
	int level; // what is the max level of the Tree
	Node winner; // The node that stores the champion.

	public TTree(int level) {
		this.level = level;
		theArray = new Node[level + 1][];

		for (int i = 0; i <= level; i++) { // create all arrays
			theArray[i] = new Node[(int) Math.pow(2, level - i)];
		}

		for (int i = 0; i <= level; i++) { // create all default nodes inside arrays
			for (int j = 0; j < theArray[i].length; j++) {
				theArray[i][j] = new Node();
			}
		}

		for (int i = 0; i < level; i++) { // linked all nodes into a tree
			for (int j = 0, k = 0; j < theArray[i].length;) {
				theArray[i][j].down = theArray[i + 1][k];
				theArray[i][j + 1].down = theArray[i + 1][k];
				theArray[i + 1][k].upLeft = theArray[i][j];
				theArray[i + 1][k].upRight = theArray[i][j+1];
				j = j + 2;
				k++;
			}
		}

		winner = theArray[level][0];

	}

	public void predictResult() {
		
		for(int j = 0 ; j<level ; j++) {
			int no = (int) Math.pow(2,level-j);
		for (int i = 0 ; i < no/2 ;i++) {
			if(theArray[j][2*i].ranking < theArray[j][2*i+1].ranking) {
				theArray[j+1][i] = theArray[j][2*i];
				
				//theArray[j][2*i].down = theArray[j][2*i];
				//theArray[j][2*i+1].down = theArray[j][2*i];
				//theArray[j][2*i].down.upLeft = theArray[j][2*i];
				//theArray[j][2*i].down.upRight = theArray[j][2*i+1];
			}
			else {
				theArray[j+1][i] = theArray[j][2*i+1];
				
				//theArray[j][2*i].down = theArray[j][2*i+1];
				//theArray[j][2*i+1].down = theArray[j][2*i+1];
				//theArray[j][2*i].down.upLeft = theArray[j][2*i];
				//theArray[j][2*i].down.upRight = theArray[j][2*i+1];
			
			}
			
		}
		
		}
		winner = theArray[level][0];
	

	}

	

	

}
