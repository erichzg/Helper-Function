import java.util.ArrayList;

public class HelpDesk {

    private ArrayPriorityQueue queue;
    private ArrayList<String> solutions;
    private int id;

    public HelpDesk() {
	queue = new ArrayPriorityQueue();
	id = 0;
    }

    public void addTicket(Ticket newTicket) {
	newTicket.setId(id);
	queue.add(newTicket);	
	id++;
    }

    public Ticket deQueue() {
	Ticket done = queue.removeMin();
	System.out.println("Sorry (unfixable), "+done.getName());
	return done;
    }

    public Ticket deQueue(String solutionDesc) {
	Ticket done = queue.removeMin();
	done.setSolved(true);
	done.setSolutionDesc(solutionDesc);
	System.out.println("You're welcome, "+done.getName());
	return done;
    }

    public Ticket peek() {
	return queue.peekMin();
    }

    public static void main(String[] args) {
	HelpDesk helper = new HelpDesk();
    }

}
