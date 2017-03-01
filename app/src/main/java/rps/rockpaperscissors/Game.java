package rps.rockpaperscissors;

import android.support.v7.widget.AppCompatMultiAutoCompleteTextView;

import java.util.Random;

/**
 * Created by user on 01/03/2017.
 */


public class Game {

    int playerMove;
    int compMove;
    Random random;
    String playerString;
            String compString;

    public Game(int playerMove) {
this.playerMove = playerMove;
        random = new Random();
       this.compMove = random.nextInt(3);

        this.playerString = Game.checkMove(this.playerMove);
                this.compString = Game.checkMove(this.compMove);

    }

    static String checkMove(int move){
        if (move == 0 ) {
            return "rock";
        } else if (move == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }


    public String play() {
        if (playerMove == 0 && compMove == 2) {
            return "Player wins with " + Game.checkMove(this.playerMove);
        } else if (compMove == 0 && playerMove == 2) {
            return "Computer wins with " + Game.checkMove(this.compMove);
        }            else if (playerMove > compMove) {
            return "Player wins with " + Game.checkMove(this.playerMove);
        } else if ( playerMove < compMove) {
            return "Computer wins with " + Game.checkMove(this.compMove);
        } else return "It is a draw";



    }

}