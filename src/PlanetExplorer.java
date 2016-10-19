
// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID:
// Finish time:

public class PlanetExplorer {
	private String obstacle = null;
	int gridX;
	int gridY;
	
	public PlanetExplorer(int x, int y, String obstacles){
		gridX = x - 1;
		gridY = y - 1;
		obstacle = obstacles;
		
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use: For a 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  
		 
	 */
	}
	
	public String executeCommand(String command){
		
		int posX = 0;
		int posY = 0;
		char direction = 'N';
		int i = 0;
		
		while(i < command.length()){
			if(command.charAt(i) == 'f'){
				if(direction == 'N'){
					posY++;
						if(posY > gridY){
							posY = 0;
						}
				}
				i++;
			}else if (command.charAt(i) == 'b'){
				posY= posY - 1;
					if(posY < 0){
						posY = gridY - 1;
					}
				i++;
			}else{
				direction = command.charAt(i);
				i++;
			}
		}
			
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		String position = "(" + Integer.toString(posX) + "," + Integer.toString(posY) + "," + direction + ")";
		
		return position;
	}
	
}
