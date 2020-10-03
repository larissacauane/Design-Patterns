package factory;


import model.Door;
import model.Maze;
import model.SimpleDoor;
import model.SimpleMaze;
import model.SimpleRoom;
import model.SimpleWall;
import model.Room;
import model.Wall;

public class SimpleMazeFactory extends AbstractMazeFactory{
	
	
	
	public Room makeRoom() {
		return new SimpleRoom();
	}
	
	public Wall makeWall() {
		return new SimpleWall();
	}


	public Maze makeMaze() {
		return new SimpleMaze();
	}

	public Door makeDoor() {
		return new SimpleDoor();
	}
	

}
