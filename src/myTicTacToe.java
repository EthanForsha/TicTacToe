import cs331Helper.cs331TicTacToeBoard;
import cs331Helper.cs331TicTacToeController;
import cs331Helper.cs331TicTacToeGame;
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
        board.squareAt(arg0, arg1).flashColor(Color.RED);
        controller.setControllerMessage("Square chosen has already been taken. Try again.");
    }
  
    public void playerWins(){
        Player winner = new Player();
        winner = (Player)controller.getWinningPlayer();
        if (!winner.equals(null)){  
            board.highlightWinningSquares(Color.GREEN);
            controller.setControllerMessage("Player " + winner.getIcon() + " wins!");
        }
        else{
            noWinner();
        }
    }
  
    public void restartGame(){
        board.clearHighlights();
        board.clearSymbols();
        controller.playAgain();
        controller.setControllerMessage("Select a square to start playing!");
    }
  
    public void noWinner(){
        controller.setControllerMessage("It's a tie.");
    }
}
