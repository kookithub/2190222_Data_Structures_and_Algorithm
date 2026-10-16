
public class StackUtility {
	static String a = "abcdefghijklmnopqrstuvwxyz";
	
	public static String operate(MyStack s1, MyStack s2) throws Exception {
		String t = "";
			while (s1.size()> 1 && !s2.isEmpty()) {
				int x = s1.top();
				s1.pop();
				int y = s1.top();
				s1.pop();
				int o = s2.top();
				s2.pop();
				
				if (o>=0) {
					t += a.charAt(x+y);
				}
				else{
					t += a.charAt(x-y);
				}
				
				
				
				
			}
		String tt = "";
		for (int i = t.length()-1 ; i >= 0 ;i--) {
			tt += t.charAt(i);
		}
		return tt;

		
		
	}
}
