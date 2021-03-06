//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public String paddleCollide(Paddle p)
	{
		int diffUp = Math.abs(this.getY() + this.getHeight() - p.getY());
		int diffDown = Math.abs(this.getY() - (p.getY() + p.getHeight()));
		int diffLeft = Math.abs(this.getX() + this.getWidth() - p.getX());
		int diffRight = Math.abs(this.getX() - (p.getX() + p.getWidth()));
		int[] diffs = {diffUp, diffDown, diffLeft, diffRight};
		int min = 0;
		if(this.getX() + this.getWidth() >= p.getX() && this.getX() <= p.getX() + p.getWidth() && this.getY() + this.getHeight() >= p.getY() && this.getY() <= p.getY() + p.getHeight())
		{
			for(int diff : diffs)
			{
				if(diff < min)
				{
					min = diff;
				}
			}
			if(min == diffUp)
			{
				return "up";
			}
			if(min == diffDown)
			{
				return "down";
			}
			if(min == diffRight)
				return "right";
			if(min == diffLeft)
				return "left";
		}
		return "";
	}
	
	public boolean didCollideLeft(Object obj)
	{
		Block block = (Block)obj;
		if((getX() == block.getX() + block.getWidth()) && getY() + getHeight()/2 > block.getY() && getY() + getHeight()/2 < block.getY() + block.getHeight())
		{
			return true;
		}
		return false;
	}
	public boolean didCollideRight(Object obj)
	{
		Block block = (Block)obj;
		if(getX() + getWidth() == block.getX() && getY() + getHeight()/2 > block.getY() && getY() + getHeight()/2 < block.getY() + block.getHeight())
		{
			return true;
		}
		return false;
	}
	public boolean didCollideTop(Object obj)
	{
		Block block = (Block)obj;
		if(getY() == block.getY() + block.getHeight() && getX() + getWidth() > block.getX() && getX() < block.getX() + block.getWidth())
		{
			return true;
		}
		return false;
	}
	public boolean didCollideBottom(Object obj)
	{
		Block block = (Block)obj;
		if(getY() + getHeight() == block.getY() && getX() + getWidth() > block.getX() && getX() < block.getX() + block.getWidth())
		{
			return true;
		}
		return false;
	}
	
	//add the other Ball constructors
	public Ball(int x,int y)
	{
		super(x,y);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int w, int h)
	{
		super(x,y,w,h);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int w, int h, int xSp, int ySp)
	{
		super(x,y,w,h);
		xSpeed = xSp;
		ySpeed = ySp;
	}
	public Ball(int x, int y, int w, int h, Color c)
	{
		super(x,y,w,h,c);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int w, int h, Color c, int xSp, int ySp)
	{
		super(x,y,w,h,c);
		xSpeed = xSp;
		ySpeed = ySp;
	}
	   
   //add the set methods
   public void setXSpeed(int x)
   {
	   xSpeed = x;
   }
   public void setYSpeed(int y)
   {
	   ySpeed = y;
   }

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   window.setColor(Color.WHITE);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
      setX(getX()+xSpeed);
		setY(getY() + ySpeed);

		//draw the ball at its new location
		window.setColor(getColor());
		window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Ball b = (Ball)obj;
		if(super.equals(b) && xSpeed == b.getXSpeed() && ySpeed == b.getYSpeed())
		{
			return true;
		}
		return false;
	}   

   //add the get methods
	public int getXSpeed()
	{
		return xSpeed;
	}
	public int getYSpeed()
	{
		return ySpeed;
	}
   //add a toString() method
	public String toString()
	{
		String output = "";
		output += super.toString() + "\t" + getXSpeed() + " " + getYSpeed();
		return output;
	}
}