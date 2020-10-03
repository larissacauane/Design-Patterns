package view;

import factory.AbstractMazeFactory;
import factory.EnchantedMazeFactory;
import factory.SimpleMazeFactory;

public class App {
	
	private static MazeGame createGame(String maze) {
		AbstractMazeFactory mf = null;
		
		if(maze.equals("simples"))
			mf = new SimpleMazeFactory();
		
		else if(maze.equals("encantado"))
			mf = new EnchantedMazeFactory();
		
		MazeGame game = new MazeGame();
		
		game.setDoor(mf.makeDoor());
		game.setMaze(mf.makeMaze());
		game.setRoom(mf.makeRoom());
		game.setWall(mf.makeWall());
		
		return game;
	}
	
	public static void main(String[] args) {
		MazeGame simples = createGame("simples");
		MazeGame encantado = createGame("encantado");
	}

}
