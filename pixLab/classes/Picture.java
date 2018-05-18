import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */





// BLUR METHOD IS AT VERY BOTTOM ! ! ! ! ! ! ! ! ! ! !

// BLUR METHOD IS AT VERY BOTTOM ! ! ! ! ! ! ! ! ! ! !

// BLUR METHOD IS AT VERY BOTTOM ! ! ! ! ! ! ! ! ! ! ! 

// BLUR METHOD IS AT VERY BOTTOM ! ! ! ! ! ! ! ! ! ! !

// BLUR METHOD IS AT VERY BOTTOM ! ! ! ! ! ! ! ! ! ! !






public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this f	ileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  
  public void keepOnlyBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setGreen(0);
        pixelObj.setRed(0);

      }
    }
  }
  
  public void keepOnlyRed()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setGreen(0);
        pixelObj.setBlue(0);

      }
    }
  }
  
  public void keepOnlyGreen()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
        pixelObj.setRed(0);

      }
    }
  }
  
  
  public void negate() 
	{
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setGreen(255 - pixelObj.getGreen());
	        pixelObj.setRed(255 - pixelObj.getRed());
	        pixelObj.setBlue(255 - pixelObj.getBlue());
	      }
	    }
		
	}
  
  public void gray() 
	{
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	    	int thing;
	    	thing = (pixelObj.getBlue() + pixelObj.getGreen() + pixelObj.getRed())/3;
	        pixelObj.setGreen(thing);
	        pixelObj.setRed(thing);
	        pixelObj.setBlue(thing);
	      }
	    }
		
	}
  
  public void fish() 
	{
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setBlue(pixelObj.getBlue() - 75);
	        pixelObj.setGreen(pixelObj.getGreen() - 75);

	      }
	    }
		
	}
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
	  int count = 0;
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
        count++;
      }
    }
    System.out.println(count);
  }
  
  
  public void mirrorArms()
  {
	  int mirrorPoint = 190;
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    Pixel[][] pixels = this.getPixels2D();
	    
	    // loop through the rows
	    for (int row = 160; row < 200; row++)
	    {
	      // loop from 13 to just before the mirror point
	      for (int col = 110; col < 305; col++)
	      {
	        
	        leftPixel = pixels[row][col];      
	        rightPixel = pixels[mirrorPoint - row + mirrorPoint]                       
	                         [col];
	        rightPixel.setColor(leftPixel.getColor());
	      }
	    }
  }
  
  public void mirrorGull()
  {
	  int mirrorPoint = 354;
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    Pixel[][] pixels = this.getPixels2D();
	    
	    // loop through the rows
	    for (int row = 220; row < 330; row++)
	    {
	      // loop from 13 to just before the mirror point
	      for (int col = 225; col < 354; col++)
	      {
	        
	        leftPixel = pixels[row][col];      
	        rightPixel = pixels[row]                       
	                         [mirrorPoint - col + mirrorPoint];
	        rightPixel.setColor(leftPixel.getColor());
	      }
	    }
  }
  
  public void mirrorDiag()
  {
	  int mirrorPoint = 0;
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    Pixel[][] pixels = this.getPixels2D();
	    for (int row = 0; row < pixels.length; row++)
	    {
	      for (int col = 0; col < pixels[0].length; col++)
	      {
	        if (col < pixels.length)
	        {
	            leftPixel = pixels[col][row];
	            rightPixel = pixels[row][col];
	            rightPixel.setColor(leftPixel.getColor());
	        }
	      }
	    } 
	    
  }
  
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  public void copy2(Picture fromPic, 
          int startRow, int startCol)
		{
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; 
		  fromRow < 300 &&
		  toRow < 300; 
		  fromRow++, toRow++)
		{
		for (int fromCol = 0, toCol = startCol; 
		    fromCol < 300 &&
		    toCol < 300;  
		    fromCol++, toCol++)
		{
		 fromPixel = fromPixels[fromRow][fromCol];
		 toPixel = toPixels[toRow][toCol];
		 toPixel.setColor(fromPixel.getColor());
		}
		}   
}

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit16\\pixLab\\images\\flower1.jpg");
    Picture flower2 = new Picture("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit16\\pixLab\\images\\flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit16\\pixLab\\images\\collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    
   
    		
    		
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
    
  
  }
  
  
  public void edgeDetection2(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    
   
    		
    		
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }

   
      }
    
    
  
  
  
  
  /** Method blurs picture within certain parameters
   * takes average of pixel color + surrounding colors
   **/
  
  public void blur(int x, int y, int w, int h)
  {
	Pixel[][] pixels = this.getPixels2D();
	int avgb = 0, avgg = 0, avgr = 0;
	
    for (int row = x; row < x + w; row++)
    {
      for (int col = y; col < y + h; col++)
      {
        avgb = (pixels[row][col].getBlue() +  pixels[row - 1][col].getBlue() + pixels[row + 1][col].getBlue() +  pixels[row][col + 1].getBlue() + pixels[row][col - 1].getBlue())/5;
        avgg = (pixels[row][col].getGreen() +  pixels[row - 1][col].getGreen() + pixels[row + 1][col].getGreen() +  pixels[row][col + 1].getGreen() + pixels[row][col - 1].getGreen())/5;
        avgr = (pixels[row][col].getRed() +  pixels[row - 1][col].getRed() + pixels[row + 1][col].getRed() +  pixels[row][col + 1].getRed() + pixels[row][col - 1].getRed())/5;

        pixels[row][col].setBlue(avgb);
        pixels[row][col].setGreen(avgg);
        pixels[row][col].setRed(avgr);

      }
    }
  }
  
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
	  System.out.print("Name: Jennifer Yang \nPeriod: 2 \nDate: 4/24/18 \nComputer #: 13");
   
	  
	//Picture beach = new Picture("C:\\Users\\JY\\Desktop\\APCSA-P2\\Unit16\\pixLab\\images\\beach.jpg");
    //beach.explore();
    //beach.zeroBlue();
    //beach.explore();
  }

	
  
} // this } is the end of class Picture, put all new methods before this
