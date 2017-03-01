package rps.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WinnerActivity extends AppCompatActivity {

    TextView winner;
int playerMove;
    Game game;
    String holder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);
        winner = (TextView) findViewById(R.id.winnerText);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        playerMove = extras.getInt("winner");

        game = new Game(playerMove);
       holder = game.play();

winner.setText(holder);


    }
}
