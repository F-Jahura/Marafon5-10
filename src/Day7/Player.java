package Day7;

public class Player {
    public int stamina;
    public final static int MAX_STAMINA = 100;
    public final static int MIN_STAMINA = 0;
    public static int countPlayers = 0;

    public Player(int stamina) {

        this.stamina = stamina;
        if (countPlayers < 6){
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run(){
        System.out.println();
        System.out.println("The player is running.");
        stamina = MAX_STAMINA;
        while (true) {
            stamina = stamina - 1;
            if (stamina == 0) {
                countPlayers = countPlayers -1;
                System.out.println("The player left field. He needs some rests.");
                break;
            }
        }
    }

    public static void info(){
        if (countPlayers < 6){
            System.out.println("The team is not full. In the field has free space.");
        } else
            System.out.println("The team is full. No more free spaces.");

    }
}
