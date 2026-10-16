
public class GameStack {
	
	public static MyStack shuffle1(MyStack s) throws Exception {
		MyStack C = new StackArray();
		while(s.size()>=2) {
			MyStack T = new StackArray();
			T.push(s.top());
			s.pop();
			T.push(s.top());
			s.pop();
			C.push(T.top());
			T.pop();
			C.push(T.top());
			T.pop();
		}
		s.makeEmpty();
		while (!C.isEmpty()) {
			s.push(C.top());
			C.pop();
		}
		
		return s;

	}
	
	
	

}
