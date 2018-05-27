package ua.od.hillel;


import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class GameTest {

    private Game game;
    @Mock
    Player firstPlayer;
    @Mock
    Player secondPlayer;

    @Before
    public void initGame() {
        game = new Game();
    }


    @Test
    public void mustCalculateAmountOfPlayersByJUnit() {
        game.addPlayer(firstPlayer);
        game.addPlayer(secondPlayer);
        assertEquals(game.getAmountOfPlayers(), 2);
    }

    @Test
    public void mustCalculateAmountOfPlayersByHamcrest() {
        game.addPlayer(firstPlayer);
        game.addPlayer(secondPlayer);
        assertThat(game.getAmountOfPlayers(), is(2));
    }
}