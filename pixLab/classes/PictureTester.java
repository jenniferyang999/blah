/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit16\\pixLab\\images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit16\\pixLab\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit16\\pixLab\\images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit16\\pixLab\\images\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit16\\pixLab\\images\\swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit16\\pixLab\\images\\swan.jpg");
    swan.edgeDetection2(5);
    swan.explore();
  }
  

	public static void testKeepOnlyBlue() 
	{
		Picture beach = new Picture("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit16\\pixLab\\images\\beach.jpg");
	    beach.explore();
	    beach.keepOnlyBlue();
	    beach.explore();
	}
	
	public static void testKeepOnlyRed() 
	{
		Picture beach = new Picture("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit16\\pixLab\\images\\beach.jpg");
	    beach.explore();
	    beach.keepOnlyRed();
	    beach.explore();
	}
	
	public static void testKeepOnlyGreen() 
	{
		Picture beach = new Picture("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit16\\pixLab\\images\\beach.jpg");
	    beach.explore();
	    beach.keepOnlyGreen();
	    beach.explore();
	}
	
	public static void testNegate() {
		Picture beach = new Picture("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit16\\pixLab\\images\\beach.jpg");
		beach.explore();
		beach.negate();
		beach.explore();
	}
	
	public static void testGrayscale() {
		Picture beach = new Picture("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit16\\pixLab\\images\\beach.jpg");
		beach.explore();
		beach.gray();
		beach.explore();
	}
	
	public static void testFixUnderwater() {
		Picture water = new Picture("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit16\\pixLab\\images\\water.jpg");
		water.explore();
		water.fish();
		water.explore();
	}
	
	public static void testMirrorArms() {
		Picture water = new Picture("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit16\\pixLab\\images\\snowman.jpg");
		water.explore();
		water.mirrorArms();
		water.explore();
	}
	
	public static void testMirrorGull() {
		Picture water = new Picture("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit16\\pixLab\\images\\seagull.jpg");
		water.explore();
		water.mirrorGull();
		water.explore();
	}
	
	public static void testMirrorDiagonal() {
		Picture water = new Picture("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit16\\pixLab\\images\\seagull.jpg");
		water.explore();
		water.mirrorDiag();
		water.explore();
	}
	
	public static void testCopy() {
		Picture water = new Picture("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit16\\pixLab\\images\\seagull.jpg");
		water.explore();
		water.copy(water, 50, 150);
		water.explore();
	}
	
	public static void testCopy2() {
		Picture water = new Picture("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit16\\pixLab\\images\\seagull.jpg");
		water.explore();
		water.copy2(water, 50, 150);
		water.explore();
	}
	
	
	public static void testBlur(int x, int y, int w, int h, int n) {
		Picture water = new Picture("C:\\Users\\yangj4919\\Downloads\\APCSA-P2-master (1)\\APCSA-P2-master2\\Unit16\\pixLab\\images\\seagull.jpg");
		water.explore();
		for (int i = 0; i < n; i++)
		{
			water.blur(x, y, w, h);
		}
		water.explore();
	}
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	  
	 testBlur(190, 204, 200, 200, 10);
	  
	  
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testCopy2();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }



}