package Gambling;

public class GamblingSimulator {
    public int funds =0;
    public int bet = 0;
    public static void main(String[] args) {
        System.out.println("Welcome to the gambling Simulator ");
        System.out.println("This problem simulates a Gambler who starts with a stake and bets every game to win or loose some stake. Being a Calculative Gambler exits if the Stake reaches a high or a low limit");
        GamblingSimulator gambler = new GamblingSimulator();
        gambler.gameInitialise();

    }
    public void gameInitialise(){
        System.out.println("Initialising game.....");
        funds=100;
        bet=1;
        System.out.println("Funds: "+funds);
    }
    /*As a Gambler, would start with a stake of $100 every day and bet $1 every game.*/
}
