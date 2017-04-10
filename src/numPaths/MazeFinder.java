package numPaths;


/** Programming Challenge: Maze Route Finder
 * @author anikaitsingh
 */

public class MazeFinder {
	
	private final int START_R;
	private final int START_C;
	private final int END_R;
	private final int END_C;
	private final char[][] MAZE;
	
	
	public MazeFinder(char[][] arr){
		this(arr, 0, 0, arr.length-1, arr[0].length-1);
	}
	
	public MazeFinder(char[][] arr, int sR, int sC, int eR, int eC){
		MAZE = arr;
		this.START_R = sR;
		this.START_C = sC;
		this.END_R = eR;
		this.END_C = eC;
	}
		
	public int numPaths(){
		return numPaths(START_R, START_C, END_R, END_C);
	}
	
	public int numPaths(int sR, int sC, int eR, int eC){
		if(!isValidSquare(sR, sC)){
			return 0;
		}else if(sR == eR && sC == eC){
			return 0;
		}
		return numPaths(sR + 1, sC, eR, eC) + numPaths(sR, sC + 1, eR, eC);		
	}
	
	public boolean isValidSquare(int r, int c){
		return !(r< MAZE.length && c< MAZE[0].length) || this.MAZE[r][c] != 'B';
	}

	public int getStartRow() {
		return START_R;
	}

	public int getStartCollumn() {
		return START_C;
	}

	public int getEndRow() {
		return END_R;
	}

	public int getEndCollumn() {
		return END_C;
	}

	public char[][] getMaze() {
		return MAZE;
	}
	
}

