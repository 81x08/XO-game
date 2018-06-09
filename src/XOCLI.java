import com.game.xo.model.Field;
import com.game.xo.model.Figure;
import com.game.xo.model.Game;
import com.game.xo.model.Player;
import com.game.xo.view.ConsoleView;

public class XOCLI {
    public static void main(final String[] args) {
        final String name1 = "Player 1";
        final String name2 = "Player 2";

        final Player[] players = new Player[2];
        players[0] = new Player(name1, Figure.X);
        players[1] = new Player(name2, Figure.O);

        final Game gameXO = new Game(players, new Field(3), "XO");
        final ConsoleView consoleView = new ConsoleView();

        do {
            consoleView.show(gameXO);
        } while (consoleView.move(gameXO));
    }
}
