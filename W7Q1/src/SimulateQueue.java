
public class SimulateQueue {

	CustomerInfo[][] allEvents; //events in each and every queue
 
	MyQueue[] allQueues; // queues of people, corresponding to the events

	public SimulateQueue(CustomerInfo[][] allEvents, MyQueue[] allQueues) {
		super();
		this.allEvents = allEvents;
		this.allQueues = allQueues;
	}

	public void stateBeforeTimeT(int t) throws Exception {
		int n = 0;
		for(CustomerInfo[] m : allEvents) {
			for(CustomerInfo i : m) {
				if (i.time < t) {
					if(i.event == 1) {
						allQueues[n].insertLast(1);
					}
					else {
						allQueues[n].removeFirst();
					}
				}
			}
			n++;
		}




	}

}
