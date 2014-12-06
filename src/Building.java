/*
 * The class that finds the minimum number of rectangular blocks needed to build.
 * This has a time complexity of O(N).
 */

import java.util.Stack; //For Built in Stack Function

public class Building 
{
	public int getBlocks(int [] H)
	{
		if (H.length==1) //Base Case, Only One Height
			return 1;
		
		int N = H.length; //Number of Required Heights
		int count = 1; //Count of Blocks, At Least One
		Stack<Integer> Wall = new Stack<Integer>(); //Stack to Keep Track of Heights
		
		Wall.add(H[0]); //Add First Height to Stack
				
		for (int i=1; i<N; i++) //Loop Through Heights
		{
			while (!Wall.isEmpty() && H[i]<Wall.peek()) //Remove Elements Until Height That Isn't
				Wall.pop(); //Greater Than Current
			if (!Wall.isEmpty() && H[i]==Wall.peek()) //If Equal
				continue; //Skip
			
			count++; //Increment Count of Blocks
			Wall.add(H[i]); //Add Height to Stack
		}
		
		return count; //Return Number of Blocks Needed
	}
}