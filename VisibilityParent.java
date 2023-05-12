// default: no visibility keyword: visible to all classes
// in the package
// but not visible to subclasses that are not in the package

class VisibilityParent {

    // protected: visible inside class, inside subclasses, and inside package
    protected static void printProtected ()
    {
	System.out.println ("Accessed: protected method in VisibilityParent");
    }

    public static void printPublic ()
    {
	System.out.println ("Accessed: public method in VisibilityParent");
    }
}
