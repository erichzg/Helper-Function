import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class HelpDesk {

    private ArrayPriorityQueue queue;
    private ArrayList<String> solutions;
    private int id;
    private InputStreamReader isr;
    private BufferedReader in;

    public HelpDesk() {
	queue = new ArrayPriorityQueue();
	id = 0;
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
    }

    //adds ticket using user input
    public void addTicket() {
	String s = "";
	int vp = 0;
	String problem = "";
	String name = "";
	
	s = "Welcome to Helper_Function!\n";
	s = "Enter your name: ";
	System.out.print(s);
	try{
	    name = in.readLine();
	    s = "\nHi " + name + "! \n";
	}
	catch ( IOException e) { }

	s += "Please specify your problem: ";
	System.out.print( s );

	try {
	    problem = in.readLine();
	}
	catch ( IOException e ) { }
	
	s = "\nWhat is your VP level? \n";
	s += "Selection: ";
	System.out.print( s );

	try {
	    vp = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) {	}

	s = "Please wait while we work on solving your problem. Your ID number is " + id + ". \n\n";
	System.out.print(s);

	queue.add(new Ticket(id, vp, problem, name));
	id++;
    }

    public Ticket deQueue() {
	Ticket done = queue.removeMin();
	System.out.println("Sorry " + done.getName() + ", we were not able to solve your problem.");
	return done;
    }

    public Ticket deQueue(String solutionDesc) {
	Ticket done = queue.removeMin();
	if(done == null) return done;
	done.setSolved(true);
	done.setSolutionDesc(solutionDesc);
	System.out.println(solutionDesc);
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
	helper.addTicket();
	helper.addTicket();
	helper.addTicket();
	System.out.print(helper + "\n\n");

	helper.deQueue();
	System.out.print(helper + "\n\n");

        helper.deQueue("Turn your computer off, and then on again.");
	System.out.println(helper);

	helper.deQueue();
	System.out.println(helper);
	
	
    }

}
