//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import static java.lang.System.out;

import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BallTestTwo extends Canvas implements Runnable
{
	private Ball ball;

	public BallTestTwo()
	{
		setBackground(Color.WHITE);
		setVisible(true);
		ball = new Ball(200,100,100,100,Color.GREEN, 10,10);

		//instantiate a new Ball
		Ball two = new Ball();

		//test the Ball thoroughly
		System.out.println(two);
		two.setPos(300, 300);
		System.out.println(two);
		two.setXSpeed(5);
		two.setYSpeed(3);
		System.out.println(two);

		//test all constructors
		Ball three = new Ball(200,300);
		System.out.println(three);
		Ball four = new Ball(500,600,20,60);
		out.println(four);
		
		Ball five = new Ball(200,200,60,500,Color.RED);
		out.println(five);
		
		Ball six = new Ball(50,150,30,40,Color.BLUE,5,6);
		out.println(six);

		Ball seven = new Ball(150,250,30,50,Color.GREEN,4,2);
		out.println(seven);

		new Thread(this).start();
	}
	
	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		ball.moveAndDraw(window);

		if(!(ball.getX()>=10 && ball.getX()<=550))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}

		if(!(ball.getY()>=10 && ball.getY()<=450))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
	}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(19);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}