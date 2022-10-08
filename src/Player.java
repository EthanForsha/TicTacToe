import cs331Helper.cs331TicTacToeBoard;
import cs331Helper.cs331TicTacToeController;
import cs331Helper.cs331TicTacToePlayer;

public class Player implements cs331TicTacToePlayer {

    private String icon;
    private cs331TicTacToeBoard board;
    private cs331TicTacToeController controller;

    public Player() // empty constructor for testing
    {
        
    }
    
    public Player(String s, cs331TicTacToeBoard b, cs331TicTacToeController c){
        icon = s;
        board = b;
        controller = c;
    }

    public String getIcon(){
        return this.icon;
    }

    public void selectSquare(int arg0, int arg1){
        board.squareAt(arg0, arg1).markSquare(icon);
        controller.finishedTurn();
        if (controller.getWinningPlayer() == null){  // do this so "Player wins" text overrides the finished turn text
            controller.setControllerMessage("Player " + icon + " has finished their turn.");
        }
    }

}
