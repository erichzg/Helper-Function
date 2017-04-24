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

    public String toString() {
	return queue.toString();
    }

    public static void main(String[] args) {
	HelpDesk helper = new HelpDesk();
	Ticket first = new Ticket(0,1,"problem1","first");
	Ticket second = new Ticket(0,0,"problem2","second");
	Ticket third = new Ticket(0,2,"problem3","third");
	helper.addTicket(first);
	helper.addTicket(second);
	helper.addTicket(third);
	System.out.println(helper);
    }

}
