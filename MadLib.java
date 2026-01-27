// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.load;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MadLib
{
	private ArrayList<String> verbs = new ArrayList<String>();
	private ArrayList<String> nouns = new ArrayList<String>();
	private ArrayList<String> adjectives = new ArrayList<String>();
	private String story = "";

	public MadLib()
	{
		verbs.add("run");
		nouns.add("Jonathon Leohr");
		adjectives.add("purple");
		story= ("Johnathon Leohr run down the purple road");
	}

	public MadLib(String fileName)
	{
		//load stuff
		
		try
		{
			//Read the different parts of the story and concatenate the resulting
			//story using the symbols to tell you the parts of speech


			//While there is more of the story, read in the word/symbol

				//If what was read in is one of the symbols, find a random
				//word to replace it.
			}


		}
		catch (Exception e)
		{
			System.out.println("Houston we have a problem!");
		}

	}

	public void loadNouns()
	{
		try
		{
			Scanner reader = new Scanner(new File( "nouns.dat"));
			while (reader.hasNextLine())
			{
				nouns.add(reader.next());
			}

			reader.close();			
		}
		catch(Exception e)
		{
			System.out.println("nouns.dat does not exist");
		}

	}

	public void loadVerbs()
	{
		try
		{
		Scanner reader = new Scanner(new File( "verbs.dat"));
			while (reader.hasNextLine())
			{
				verbs.add(reader.next());
			}
			
			reader.close();
		}
		catch(Exception e)
		{
			System.out.println("verbs.dat does not exist");
		}
	}

	public void loadAdjectives()
	{
		try
		{

		}
		catch(Exception e)
		{
			System.out.println("adjectives.dat does not exist");
		}
	}

	public String getRandomVerb()
	{
		return "";
	}

	public String getRandomNoun()
	{
		return "";
	}

	public String getRandomAdjective()
	{
		return "";
	}

	public String toString()
	{
		return "";
	}
}