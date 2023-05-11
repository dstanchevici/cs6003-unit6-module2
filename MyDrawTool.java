public class MyDrawTool extends DrawTool {

    public static void drawTriangle ( double x1, double y1,
				      double x2, double y2,
				      double x3, double y3,
				      String color
				     )
    {
	// inherited from DrawTool
	setLineColor (color);
	
	// inherited from DrawTool
	drawLine (x1,y1, x2,y2); 
	drawLine (x1,y1, x3,y3);
	drawLine (x3,y3, x2,y2);	
    }
}
