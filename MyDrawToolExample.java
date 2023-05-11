
public class MyDrawToolExample {

    public static void main (String[] argv)
    {
	MyDrawTool.setXYRange (0,10, 0,10);
	MyDrawTool.display ();

	// Get the array of colors.
	//String[] colors = MyDrawTool.getColors ();
	//System.out.println (colors);
	
	// Draw two triangles.
	//MyDrawTool.drawTriangle (1.0,1.0, 1.0,3.0, 3.0,1.0, colors[1]);
	//MyDrawTool.drawTriangle (4.0,4.0, 4.0,8.0, 8.0,1.0, colors[7]);

	MyDrawTool.drawTriangle (1.0,1.0, 1.0,3.0, 3.0,1.0, "red");
	MyDrawTool.drawTriangle (4.0,4.0, 4.0,8.0, 8.0,1.0, "blue");	
    }

}
