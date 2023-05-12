class VisibilitySubclass extends VisibilityParent {

    public static void main (String[] argv)
    {
	// Call a protected method in parent
	printProtected (); // Output: Accessed: protected method in VisibilityParent
	//printPublic(); 
    }

    protected static void printProtected ()
    {
	System.out.println ("Overriding a protected method in VisibilityParent");
    }

    /*
    private static void printPublic ()
    {
	System.out.println ("Accessed: private void printPublic in VisibilitySubclass, which overrides public static void printPublic() in VisibilityParent");
    }
    */
    /*
    When an attempt to override a parent's public method is made,
    making the the subclass's method protected or private, an error
    is thrown: attempting to assign weaker access privileges; was public
    */

}
