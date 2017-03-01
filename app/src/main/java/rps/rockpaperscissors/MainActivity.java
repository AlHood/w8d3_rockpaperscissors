package rps.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button rockBtn;
    Button paperBtn;
    Button scissorsBtn;
    int playerMove;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rockBtn = (Button) findViewById(R.id.rockBtn);
        paperBtn = (Button) findViewById(R.id.paperBtn);
        scissorsBtn = (Button) findViewById(R.id.scissorsBtn);
    }

    public void onRockButtonClicked(View button) {
playerMove = 0;

        Intent intent = new Intent(MainActivity.this, WinnerActivity.class);
        intent.putExtra("winner", playerMove);
        startActivity(intent);

    }

public void onPaperButtonClicked(View button) {
    playerMove = 1;

    Intent intent = new Intent(MainActivity.this, WinnerActivity.class);
    intent.putExtra("winner", playerMove);
    startActivity(intent);

}

    public void onScissorsButtonClicked(View button) {
        playerMove = 2;

        Intent intent = new Intent(MainActivity.this, WinnerActivity.class);
        intent.putExtra("winner", playerMove);
        startActivity(intent);

    }

}
