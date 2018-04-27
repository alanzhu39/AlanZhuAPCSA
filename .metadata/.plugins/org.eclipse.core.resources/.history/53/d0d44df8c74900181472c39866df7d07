/**
 * Creates an Asteroid object that spawns at a random spot on the field
 * somewhere near the ship. If the ship collides with the 
 * asteroid, it will die. If a bullet hits the asteroid, it will stop.
 * 
 * @author Alan Zhu
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
public class Asteroid {
	/** x position of asteroid*/
	private int xPos;
	/** y position of asteroid*/
	private int yPos;
	/** image of asteroid*/
	private Image image;
	/**
	 * public constructor, sets asteroid image
	 * 
	 * @param x position for asteroid
	 * @param y position for asteroid
	 */
	public Asteroid(int x, int y)
	{
		xPos = x;
		yPos = y;
		try
		{
			image = ImageIO.read(new File("/Users/alanzhu39/Desktop/AlanZhuAPCSA/Unit17/src/edu_asteroid_large.jpg"));
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("File not found");
		}
	}
	/**
	 * accesses x position of asteroid
	 * @return x position
	 */
	public int getX()
	{
		return xPos;
	}
	/**
	 * accesses y position of asteroid
	 * @return y position
	 */
	public int getY()
	{
		return yPos;
	}
	/**
	 * sets the x position of the asteroid
	 * @param x position
	 */
	public void setX(int x)
	{
		xPos = x;
	}
	/**
	 * sets the y position of the asteroid
	 * @param y position
	 */
	public void setY(int y)
	{
		yPos = y;
	}
	
	public void draw(Graphics window)
	{
		window.drawImage(image, getX(), getY(), 80, 80, null);
	}
}
