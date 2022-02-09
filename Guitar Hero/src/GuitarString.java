/******************************************************************************
 *  Name:    
 *  NetID:   
 *  Precept: 
 *
 *  Partner Name:    
 *  Partner NetID:   
 *  Partner Precept: 
 * 
 * Description: 
 *  
 * This is a template file for GuitarString.java. It lists the constructors
 * and methods you need, along with descriptions of what they're supposed
 * to do.
 *  
 * Note: it won't compile until you fill in the constructors and methods
 *       (or at least commment out the ones whose return type is non-void).
 *
 ******************************************************************************/

public class GuitarString {
    // YOUR INSTANCE VARIABLES HERE
	private RingBuffer BigArray;
	

    // creates a guitar string of the specified frequency,
    // using sampling rate of 44,100
    public GuitarString(double frequency) {
        // YOUR CODE HERE
    	BigArray = new RingBuffer((int)(44100/frequency));
    }

    // creates a guitar string whose size and initial values are given by
    // the specified array
    public GuitarString(double[] init) {
        // YOUR CODE HERE
    	BigArray = new RingBuffer(init);
    }

    // returns the number of samples in the ring buffer
    public int length() {
    	return BigArray.size();
        // YOUR CODE HERE
    }

    // plucks the guitar string (by replacing the buffer with white noise)
    public void pluck() {
    	while(!BigArray.isEmpty()) {
    		BigArray.dequeue();
    	}
    	while(!BigArray.isFull()) {
    		BigArray.enqueue((Math.random()-0.5));
    	}
        // YOUR CODE HERE
    }

    // advances the Karplus-Strong simulation one time step
    public void tic() {
    	double tim = BigArray.dequeue();
    	BigArray.enqueue(.994 * (((tim +BigArray.peek())/2)));
    	
        // YOUR CODE HERE
    }

    // returns the current sample
    public double sample() {
    	return BigArray.peek();
        // YOUR CODE HERE
    }
    
    


    // tests and calls every constructor and instance method in this class
    public static void main(String[] args) {
        // YOUR CODE HERE
    	double[] tim  = new double[] {.3,.2,.429};
    	GuitarString tester = new GuitarString(tim);
    	tester.pluck();
    	System.out.println(tester.BigArray);
    	tester.tic();
    	System.out.println(tester.BigArray);
    
    	
    	
    }

}