
public class MyDrawToolExample2 {

    public static void main (String[] argv)
    {
	MyDrawTool.setXYRange (0,10, 0,10);
	MyDrawTool.display ();

	String[] colors = MyDrawTool.getColors ();

	// Triangles

	int N = 20;
	
	for (int i=0; i<N; i++) {

	    // INSERT YOUR CODE HERE to:
	    // 1. Make a random triangle by picking x,y values 
	    //    in the range 0,10.
	    // 2. Pick a random color from the array
	    // 3. Draw the triangle.

	    double x1 = RandomGenerator.random (1.0, 10.0);
	    double y1 = RandomGenerator.random (1.0, 10.0);
	    
	    double x2 = RandomGenerator.random (1.0, 10.0);
	    double y2 = RandomGenerator.random (1.0, 10.0);

	    double x3 = RandomGenerator.random (1.0, 10.0);
	    double y3 = RandomGenerator.random (1.0, 10.0);

	    String color = RandomGenerator.random (colors);
	   
	    MyDrawTool.drawTriangle (x1,y1, x2,y2, x3,y3, color);
	}

	// Concentric concentric circles and arrows

	String circleColor = RandomGenerator.random (colors);
	MyDrawTool.drawConcentricCircles (2.0, 2.0, circleColor);
	MyDrawTool.drawArrow (0.0,0.0, 2.0,2.0, circleColor);

	circleColor = RandomGenerator.random (colors);
	MyDrawTool.drawConcentricCircles (2.0, 8.0, circleColor);
	MyDrawTool.drawArrow (0.0,10.0, 2.0,8.0, circleColor);
	    
	circleColor = RandomGenerator.random (colors);
	MyDrawTool.drawConcentricCircles (8.0, 8.0, circleColor);
	MyDrawTool.drawArrow (10.0,10.0, 8.0,8.0, circleColor);
	    
	circleColor = RandomGenerator.random (colors);
	MyDrawTool.drawConcentricCircles (8.0, 2.0, circleColor);
	MyDrawTool.drawArrow (10.0,0.0, 8.0,2.0, circleColor);	
	
    }

}
