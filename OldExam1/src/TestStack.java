import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStack {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testShuffle1() throws Exception {
		MyStack s = new StackLinkedList();
		s.push(2);
		s.push(1);

		GameStack.shuffle1(s);
		assertEquals(2,s.size());
		assertEquals(2,s.top());
		s.pop();
		assertEquals(1,s.top());
		s.pop();
		assertEquals(true,s.isEmpty());
		
	}
	
	@Test
	void testShuffle2() throws Exception {
		MyStack s = new StackArray();
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);

		GameStack.shuffle1(s);
		assertEquals(4,s.size());
		assertEquals(2,s.top());
		s.pop();
		assertEquals(1,s.top());
		s.pop();
		assertEquals(4,s.top());
		s.pop();
		assertEquals(3,s.top());
		s.pop();
		assertEquals(true,s.isEmpty());
        		
	}
	
	@Test
	void testShuffle3() throws Exception {

		MyStack s = new StackLinkedList();
		s.push(6);
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		

		GameStack.shuffle1(s);
		assertEquals(6,s.size());
		assertEquals(2,s.top());
		s.pop();
		assertEquals(1,s.top());
		s.pop();
		assertEquals(4,s.top());
		s.pop();
		assertEquals(3,s.top());
		s.pop();
		assertEquals(6,s.top());
		s.pop();
		assertEquals(5,s.top());
		s.pop();
		assertEquals(true,s.isEmpty());

	}
	
	@Test
	void testShuffle4() throws Exception {
		MyStack s = new StackArray();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		s.push(7);
		s.push(8);
		

		GameStack.shuffle1(s);
		assertEquals(8,s.size());
		assertEquals(7,s.top());
		s.pop();
		assertEquals(8,s.top());
		s.pop();
		assertEquals(5,s.top());
		s.pop();
		assertEquals(6,s.top());
		s.pop();
		assertEquals(3,s.top());
		s.pop();
		assertEquals(4,s.top());
		s.pop();
		assertEquals(1,s.top());
		s.pop();
		assertEquals(2,s.top());
		s.pop();
		assertEquals(true,s.isEmpty());
		
	}
	

}
