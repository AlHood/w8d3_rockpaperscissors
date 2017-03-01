package rps.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 01/03/2017.
 */

public class GameTest {

    Game game;
String result;
Random random;
    @Before
    public void before() {

    }

    @Test
    public void testCanPlayGame() {
game = new Game(1);
        result = game.play();

        assertEquals("Player wins with paper", result);
//       passes approx 1 time in 3 consistent with expectations
    }


}







