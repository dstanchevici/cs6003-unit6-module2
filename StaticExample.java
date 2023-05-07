public class StaticExample {

    static double x;
    static int y;

    static void printx ()
    {
	System.out.println ("x = " + x);
    }

    static void printy ()
    {
	System.out.println ("y = " + y);
    }

    public static void main (String[] argv)
    {
	x = 5.34;
	printx ();

	y = 45;
	printy ();
    }
    
}
