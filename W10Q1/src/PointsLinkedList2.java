
public class PointsLinkedList2 extends PointsLinkedList{
	// Write this method
		// Find if there is a point in a linked list with the same value as p,
		// but with different nextValue or different preValue

		public boolean pointValueExist(Point p) throws Exception {
			PointListIterator pi = new PointListIterator(header);
			pi.next();
			while (pi.currentNode != header ) {
				if(pi.currentNode.data.value == p.value && (pi.currentNode.data.nextValue != p.nextValue | pi.currentNode.data.preValue != p.preValue)) {
					return true;
				
				}
				pi.next();
			}
			return false;
		}
	
	
}
