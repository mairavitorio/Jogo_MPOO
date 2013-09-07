package app;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

import core.Game;

public class App {
	
	public static void main(String[] args) throws SlickException {
	
		Game game = new Game("jogo mpoo");
		AppGameContainer container = new AppGameContainer(game);
		container.setDisplayMode(800, 600, false);
		container.setTargetFrameRate(60);
		container.setShowFPS(false);
		container.start();
	}

}
