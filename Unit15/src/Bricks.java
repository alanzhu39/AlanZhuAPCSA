import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;

public class Bricks {
	private ArrayList<Brick> bricks;
	private Color color;
	
	public Bricks()
	{
		bricks = new ArrayList<Brick>();
		color = Color.GREEN;
	}
	
	public void addBrick(Brick b)
	{
		bricks.add(b);
	}
	
	public Brick[] getBrickArray()
	{
		Brick[] brickArray = bricks.toArray(new Brick[bricks.size()]);
		return brickArray;
	}
	
	public Brick getBrick(int index)
	{
		return bricks.get(index);
	}
	
	public void deleteBrick(int index)
	{
		bricks.remove(index);
	}
	
	public void deleteBrick(Brick b)
	{
		bricks.remove(b);
	}
	
	public void addBrick(Brick b, int index)
	{
		bricks.add(index,b);
	}
	
	public void drawBricks(Graphics window)
	{
		for(Brick b : bricks)
		{
			b.draw(window);
		}
	}
	
	public int getLength()
	{
		return bricks.size();
	}
	
	public void populate()
	{
		for(int x = 41; x < 740; x += 100)
		{
			for(int y = 1; y < 40; y += 20)
			{
				Brick b = new Brick(x,y,98,18,color);
				addBrick(b);
			}
		}
		
		for(int x = 41; x < 740; x += 100)
		{
			for(int y = 541; y < 580; y += 20)
			{
				Brick b = new Brick(x,y,98,18,color);
				addBrick(b);
			}
		}
		
		for(int y = 41; y < 540; y += 100)
		{
			for(int x = 1; x < 40; x += 20)
			{
				Brick b = new Brick(x,y,18,98,color);
				addBrick(b);
			}
		}
		
		for(int y = 41; y < 540; y += 100)
		{
			for(int x = 741; x < 780; x += 20)
			{
				Brick b = new Brick(x,y,18,98,color);
				addBrick(b);
			}
		}
	}
	
	public void setColor(Color c)
	{
		color = c;
	}
}
