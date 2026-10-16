
public class StackUtility {
	
	public static MyStack removeRange(MyStack s, int i, int j) throws Exception {
		MyStack m = new StackArray(100);
		for (int k = 0;k<i;k++) {
			m.push(s.top());
			s.pop();
		}
		while( i <= j) {
			s.pop();
			i++;
		}
		while (!m.isEmpty()) {
			s.push(m.top());
			m.pop();
		}
		
		
		return s;
	}
}
