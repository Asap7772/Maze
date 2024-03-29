package numPaths;

import java.io.*;
import java.util.ArrayList;

/** Programming Challenge: Maze Route Finder
 * @author anikaitsingh
 */

public class Coordinator {
	
	public static void main(String[] args){		
		// instantiation and initialization
		String inputStr;
		ArrayList<String> arrL = new ArrayList<String>();
		char[][] arr = null;
		String file = "maze.txt";

		// input maze.txt as lines of strings
		try{
			BufferedReader reader = new BufferedReader(new FileReader(file));
			while((inputStr = reader.readLine())!=null){
				arrL.add(inputStr);
			}
			reader.close();
		}catch(FileNotFoundException ex){
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//arraylist of strings to 2D array of chars
		if(arrL != null){
			arr = new char[arrL.size()][arrL.get(0).length()];
			for(int i = 0; i< arrL.size(); i++){
				inputStr = arrL.get(i); //reuse of string
				for(int j = 0; j< arrL.get(0).length(); j++){
					arr[i][j] = inputStr.charAt(j);
				}
			}
		}
		
		print2DCharArray(arr);
		//maze number of paths — algorithm
		MazeFinder maze = new MazeFinder(arr);
		System.out.println("The number of paths in this array are: " + maze.numPaths());
	}
	
	
	//prints a 2 dimensional character array
	public static void print2DCharArray(char[][] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\n");
	}
	
	
	
}
