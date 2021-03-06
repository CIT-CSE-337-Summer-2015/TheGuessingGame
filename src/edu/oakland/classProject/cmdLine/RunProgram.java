package edu.oakland.classProject.cmdLine;

import edu.oakland.classProject.production.Main;
import edu.oakland.classProject.cmdLine.Display;

public class RunProgram{
	
	public static void main(String[] args){
		Display display = new Display();
		Main main = new Main(display);

		while(main.startGame()){
			while(main.makeGuess()) {
				main.giveFeedback();
			}
			main.endGame();
		}
	}
}

