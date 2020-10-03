package factory;

import model.Door;
import model.Maze;
import model.Room;
import model.Wall;

public abstract class AbstractMazeFactory {
	
	public abstract Maze makeMaze();
	
	public abstract Door makeDoor();
	
	public abstract Room makeRoom();
	
	public abstract Wall makeWall();
	

}
