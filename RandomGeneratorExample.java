
public class RandomGeneratorExample extends RandomGenerator {

    public static void main (String[] argv)
    {
	// Test whether integer generation is working:
	makeHistogram (1, 20);                

	// Test for generating double's between 1 and 20.
	makeHistogram (1.0, 20.0);
    }

    static void makeHistogram (int a, int b)
    {
	// We will generate random numbers between a and b, inclusive.
	// And we'll count how many of a, how many of a+1, a+2, etc.
	int[] count = new int [b+1];
	for (int n=0; n<10000; n++) {    // Generate lots (10000)
	    int k = random (a,b);
	    count[k]++;
	}

	// Print the histogram (from a to b):
	System.out.println ("Histogram: a=" + a + " b=" + b);
	for (int i=a; i<=b; i++) {
	    System.out.printf ("i=%2d  count[i]=%3d\n", i,count[i]);
	}

    }

    static void makeHistogram (double x, double y)
    {
	// WRITE CODE to test whether the generation of random
	// numbers between x and y is correct.

	double[] count = new double [(int)y+1];
	for (int n=0; n<10_000; n++) { // Generate 10,000 doubles
	    double k = random (x, y);
	    count[(int) k]++;
	}

	// Print the histogram (from x through y):
	System.out.println ("Histogram: x=" + x + " y=" + y);
	int start = (int) x;
	int end = (int) y;
	for (int i=start; i<end; i++) {
	    double doubleNum = (double) i;
	    System.out.printf ("Numbers between %3.1f and %3.1f  count=%.0f\n", doubleNum,(doubleNum+1.0), count[i]);
	}	
    }

}
