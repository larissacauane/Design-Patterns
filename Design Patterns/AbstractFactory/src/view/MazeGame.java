package view;

import model.Door;
import model.Maze;
import model.Room;
import model.Wall;

public class MazeGame {
	
	Maze maze;
	Door door;
	Wall wall;
	Room room;
	
	public MazeGame() {}

	public Maze getMaze() {
		return maze;
	}

	public void setMaze(Maze maze) {
		this.maze = maze;
	}

	public Door getDoor() {
		return door;
	}

	public void setDoor(Door door) {
		this.door = door;
	}

	public Wall getWall() {
		return wall;
	}

	public void setWall(Wall wall) {
		this.wall = wall;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	
	
	
	

}
