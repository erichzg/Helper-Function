import java.util.ArrayList;
public class ArrayPriorityQueue implements PriorityQueue{
    
    private ArrayList<Ticket> q;
    public ArrayPriorityQueue(){
	q = new ArrayList<Ticket>();
    }
     public void add(Ticket x)
   { 
	//initialize high, low, midpt indices
	int lo = 0;
	int med = 0;
	int hi = q.size()-1;

	while ( lo <= hi ) { //running until target is found or bounds cross

	    med = (lo + hi) / 2;
	    int a = q.get(med).compareTo( x );
	        
	    if ( a == 0 ) {
		//equal value found, insert here
		lo = med;
		break;
	    }
	    else if ( a > 0 )
		//newVal < med, so look at lower half of data
		hi = med - 1;
	    else
		//newVal > med, so look at upper half of data
		lo = med + 1;
	}
	// If you made it this far, newVal is not present.
	// So insert at lo.
	q.add(lo,x);
	
    }//end add

    //returns whether or not the PQ is empty
    public boolean isEmpty(){
	return q.size() == 0;
    }

    //Returns the smallest item in the PQ from the front
    public Ticket peekMin(){
	return q.get(0);
    }

    //Removes and returns the smallest item from the front
    public Ticket removeMin(){
	Ticket old = peekMin();
	q.remove(0);
	return old;
    }

    public String toString(){
	String retStr = "";
	for (Ticket tick: q) {
	    retStr += tick.getId()+": "+tick.getName()+", ";
	}
	return retStr.substring(0, retStr.length()-2);
    }
    /*
    public static void main(String[] args){
	ArrayPriorityQueue<Integer> a = new ArrayPriorityQueue<Integer>();
	a.add(1);
	a.add(3);
	a.add(2);
	a.add(4);
	a.removeMin();
	System.out.println(a);
    }
    */

}
