//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		xPos = 100;
		yPos = 150;
		width = 10;
		height = 10;
		color = Color.BLACK;
	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y)
	{
		xPos = x;
		yPos = y;
		width = 10;
		height = 10;
		color = Color.BLACK;
	}
	public Block(int x, int y, int w, int h)
	{
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = Color.BLACK;
	}
	
	public Block(int x, int y, int w, int h, Color c)
	{
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = c;
	}
   //add the other set methods
   public void setX(int x)
   {
	   xPos = x;
   } 
   public void setY(int y)
   {
	   yPos = y;
   }
   public void setWidth(int w)
   {
	   width = w;
   }
   public void setHeight(int h)
   {
	   height = h;
   }
   public void setColor(Color col)
   {
	   color = col;
   }
   public void setPos(int x, int y)
   {
	   xPos = x;
	   yPos = y;
   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   setColor(col);
	   draw(window);
   }
   
	public boolean equals(Object obj)
	{
		Block bloc = (Block)obj;
		if(xPos == bloc.getX() && yPos == bloc.getY() && width == bloc.getWidth() && height == bloc.getHeight() && color == bloc.getColor())
		{
			return true;
		}
		return false;
	}   

   //add the other get methods
	public int getX()
	{
		return xPos;
	}
	public int getY()
	{
		return yPos;
	}
	public int getWidth()
	{
		return width;
	}
	public int getHeight()
	{
		return height;
	}
	public Color getColor()
	{
		return color;
	}
   //add a toString() method  - x , y , width, height, color
	public String toString()
	{
		String output = "";
		output += getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor();
		return output;
	}
}