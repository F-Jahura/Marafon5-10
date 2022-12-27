package Day7;

import javax.swing.*;
import java.util.Random;

public class Task7_2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player player1 = new Player(random.nextInt(100)+90);
        Player player2 = new Player(random.nextInt(100)+90);
        Player player3 = new Player(random.nextInt(100)+90);
        Player player4 = new Player(random.nextInt(100)+90);
        Player.info();
        Player player5 = new Player(random.nextInt(100)+90);
        Player player6 = new Player(random.nextInt(100)+90);
        Player.info();
        Player player7 = new Player(random.nextInt(100)+90);
        Player player8 = new Player(random.nextInt(100)+90);
        Player.info();


        player1.run();
        Player.info();

    }
}
