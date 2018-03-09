//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	private String story = "";
	
	public MadLib()
	{
	}

	public MadLib(String fileName)
	{
		//load stuff
		loadNouns();
		loadVerbs();
		loadAdjectives();
		try{
			Scanner file = new Scanner(new File(fileName));
			while(file.hasNext())
			{
				String next = file.next();
				if(next.equals("#"))
				{
					story = story + getRandomNoun() + " ";
				}
				else if(next.equals("@"))
				{
					story = story + getRandomVerb() + " ";
				}
				else if(next.equals("&"))
				{
					story = story + getRandomAdjective() + " ";
				}
				else
				{
					story = story + next + " ";
				}
			}
		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try
		{
			nouns = new ArrayList<>();
			Scanner file = new Scanner(new File("/Users/alanzhu39/Desktop/AlanZhuAPCSA/Unit10/src/nouns.dat"));
			while(file.hasNext())
			{
				nouns.add(file.next());
			}
		
		
		
		}
		catch(Exception e)
		{
		}	
		
	}
	
	public void loadVerbs()
	{
		try
		{
			verbs = new ArrayList<>();
			Scanner file = new Scanner(new File("/Users/alanzhu39/Desktop/AlanZhuAPCSA/Unit10/src/verbs.dat"));
			while(file.hasNext())
			{
				verbs.add(file.next());
			}
	
	
		}
		catch(Exception e)
		{
		}
	}

	public void loadAdjectives()
	{
		try
		{
			adjectives = new ArrayList<>();
			Scanner file = new Scanner(new File("/Users/alanzhu39/Desktop/AlanZhuAPCSA/Unit10/src/adjectives.dat"));
			while(file.hasNext())
			{
				adjectives.add(file.next());
			}
	
	
	
		}
		catch(Exception e)
		{
		}
	}

	public String getRandomVerb()
	{
		int index = (int)(Math.random() * verbs.size());
		return verbs.get(index);
	}
	
	public String getRandomNoun()
	{
		int index = (int)(Math.random() * nouns.size());
		return nouns.get(index);
	}
	
	public String getRandomAdjective()
	{
		int index = (int)(Math.random() * adjectives.size());
		return adjectives.get(index);
	}		

	public String toString()
	{
	   return story;
	}
}