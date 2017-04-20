/*
  Team JDK: Judy Liu, David Frid, Karina Ionkina
  APCS2 pd5
  HW32 -- Getting Past the Velvet Rope
  2017-04-19
 */
import java.util.ArrayList;
public class ArrayPriorityQueue<Ticket> implements PriorityQueue<Ticket>{
    
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
    public T peekMin(){
	return q.get(0);
    }

    //Removes and returns the smallest item from the front
    public T removeMin(){
	T old = peekMin();
	q.remove(0);
	return old;
    }
    public String toString(){
	return q.toString();
    }
    public static void main(String[] args){
	ArrayPriorityQueue<Integer> a = new ArrayPriorityQueue<Integer>();
	a.add(1);
	a.add(3);
	a.add(2);
	a.add(4);
	a.removeMin();
	System.out.println(a);
    }
    

}
