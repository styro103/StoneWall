/*
 * Shaun Mbateng
 * Stone Wall
 * This program finds the minimum number of blocks needed to build a stone wall given
 * 	a length and multiple heights.
 * It has a time complexity of O(N).
 */

import java.util.Scanner; //For User Inputs

public class StoneWall 
{
	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in); //For Inputs
		Building Rectangles = new Building(); //Class That Sorts Array
		int [] heights; //Array to Sort
		int len; //Length of Array
		
		//Enter and Set Array Length
		System.out.print("Enter the Stone Wall Length: ");
		len = cin.nextInt();
		heights = new int [len];
		
		//Fill Array
		for (int i=0; i<len; i++)
		{
			System.out.print("Enter Height "+(i+1)+": ");
			heights[i] = cin.nextInt();
		}
		
		cin.close(); //No More Inputs Needed
		
		//Print Arrays
		System.out.println();
		System.out.println("Minimum Number of Blocks Needed: "+Rectangles.getBlocks(heights));
	}
}