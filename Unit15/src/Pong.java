//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int leftScore;
	private int rightScore;
	private Wall topWall;
	private Wall bottomWall;
	private Wall rightWall;
	private Wall leftWall;
	private Paddle paddle;
	private Bricks bricks;

	public Pong()
	{
		//set up all variables related to the game
		//leftScore = 0;
		//rightScore = 0;
		paddle = new Paddle(400,200,40,40,4);
		ball = new Ball();
		ball.setXSpeed(1);
		//leftPaddle = new Paddle(0,100,10,50,2);
		//rightPaddle = new Paddle(790,100,10,50,2);
		topWall = new Wall(0,0,800,0,Color.WHITE);
		bottomWall = new Wall(0,580,800,0,Color.WHITE);
		rightWall = new Wall(780,0,0,800,Color.WHITE);
		leftWall = new Wall(0,0,0,800,Color.WHITE);
		bricks = new Bricks();
		bricks.populate();

		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();


		ball.moveAndDraw(graphToBack);
		//leftPaddle.draw(graphToBack);
		//rightPaddle.draw(graphToBack);
		//graphToBack.drawString("Right Score : " + rightScore, 600, 500);
		//graphToBack.drawString("Left Score : " + leftScore, 600, 525);
		bottomWall.draw(graphToBack);
		topWall.draw(graphToBack);
		rightWall.draw(graphToBack);
		leftWall.draw(graphToBack);
		paddle.draw(graphToBack);
		bricks.drawBricks(graphToBack);
		Brick[] bArray = bricks.getBrickArray();
		for(Brick b : bArray)
		{
			if(b.getColor() == Color.WHITE)
			{
				bricks.deleteBrick(b);
			}
		}
		
		bArray = bricks.getBrickArray();
		
		if(bricks.getLength() == 0)
		{
			ball.draw(graphToBack,Color.WHITE);
			ball.setColor(Color.BLACK);
			bricks.setColor(Color.RED);
			bricks.populate();
			ball.setPos(200, 200);
		}

		//see if ball hits left wall or right wall
		if(ball.didCollideLeft(leftWall) || ball.didCollideRight(rightWall))
		{
			//leftPaddle.setSpeed(0);
			//rightPaddle.setSpeed(0);
			ball.setXSpeed(ball.getXSpeed() * (-1));
			//ball.setYSpeed(ball.getYSpeed() * (-1));
			/*if(ball.didCollideLeft(leftWall))
			{
				graphToBack.setColor(Color.WHITE);
				graphToBack.drawString("Right Score : " + rightScore, 600, 500);
				rightScore++;
				graphToBack.setColor(Color.BLACK);
				graphToBack.drawString("Right Score : " + rightScore, 600, 500);
			}
			else if(ball.didCollideRight(rightWall))
			{
				graphToBack.setColor(Color.WHITE);
				graphToBack.drawString("Left Score : " + leftScore, 600, 525);
				leftScore++;
				graphToBack.setColor(Color.BLACK);
				graphToBack.drawString("Left Score : " + leftScore, 600, 525);
			}
			graphToBack.setColor(Color.WHITE);
			graphToBack.fillOval(ball.getX(), ball.getY(), ball.getWidth(), ball.getHeight());
			ball.setXSpeed(1);
			ball.setYSpeed(1);
			ball.setPos(250,250);
			leftPaddle.setSpeed(2);
			rightPaddle.setSpeed(2);*/
		}
		
		
		//see if the ball hits the top or bottom wall 
		if(ball.didCollideTop(topWall) || ball.didCollideBottom(bottomWall))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}

		//see if the ball hits the left paddle
		/*if(ball.didCollideLeft(leftPaddle))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		//see if the ball hits the right paddle
		if(ball.didCollideRight(rightPaddle))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}*/
		
		//check ball and paddle collision
		/*if(ball.didCollideLeft(paddle))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		if(ball.didCollideRight(paddle))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}
		if(ball.didCollideBottom(paddle))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
		if(ball.didCollideTop(paddle))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}*/
		
		if(ball.paddleCollide(paddle).equals("up"))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
		if(ball.paddleCollide(paddle).equals("down"))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
		if(ball.paddleCollide(paddle).equals("left"))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}
		if(ball.paddleCollide(paddle).equals("right"))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		for(int i = 0; i < bArray.length; i++)
		{
			Brick b = bricks.getBrick(i);
			if(ball.didCollideLeft(b))
			{
				ball.setXSpeed(-ball.getXSpeed());
				b.setColor(Color.WHITE);
			}
			
			if(ball.didCollideRight(b))
			{
				ball.setXSpeed(-ball.getXSpeed());
				b.setColor(Color.WHITE);
			}
			if(ball.didCollideBottom(b))
			{
				ball.setYSpeed(-ball.getYSpeed());
				b.setColor(Color.WHITE);
			}
			if(ball.didCollideTop(b))
			{
				ball.setYSpeed(-ball.getYSpeed());
				b.setColor(Color.WHITE);
			}
		}

		//see if the paddles need to be moved
		if(keys[0])
		{
			paddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1])
		{
			paddle.moveLeftAndDraw(graphToBack);

		}
		if(keys[2])
		{
			paddle.moveDownAndDraw(graphToBack);
		}
		if(keys[3])
		{
			paddle.moveRightAndDraw(graphToBack);
		}

		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'A' : keys[1]=true; break;
			case 'S' : keys[2]=true; break;
			case 'D' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'A' : keys[1]=false; break;
			case 'S' : keys[2]=false; break;
			case 'D' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}