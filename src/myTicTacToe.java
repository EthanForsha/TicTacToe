import cs331Helper.cs331TicTacToeBoard;
import cs331Helper.cs331TicTacToeController;
import cs331Helper.cs331TicTacToeGame;
import cs331Helper.cs331TicTacToePlayer;
import javafx.scene.paint.Color;

public class myTicTacToe implements cs331TicTacToeGame {
    cs331TicTacToeBoard board;
    cs331TicTacToeController controller;
    
    public myTicTacToe(){    
        board = new cs331TicTacToeBoard();
        controller = new cs331TicTacToeController();
        controller.setControllerMessage("Select a square to start playing!");
        Player player1 = new Player("X", board, controller);
        controller.addPlayer(player1);
        Player player2 = new Player("O", board, controller);
        controller.addPlayer(player2);
    }

    public void invalidSquareChosen(int arg0, int arg1){
        
    }
  
    public void playerWins(){
        //cs331TicTacToePlayer winner = this.controller.getWinningPlayer();
        //winner = (Player)winner;
        //controller.setControllerMessage("Player " + winner.getIcon() + " wins!");
    }
  
    public void restartGame(){
        board.clearHighlights();
        board.clearSymbols();
        controller.setControllerMessage("Select a square to start playing!");
    }
  
    public void noWinner(){
        controller.setControllerMessage("It's a tie.");
    }
}
