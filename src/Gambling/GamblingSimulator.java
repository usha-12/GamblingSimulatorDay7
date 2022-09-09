package Gambling;

public class GamblingSimulator {
    public int funds =0;
    public int bet = 0;
    public int wins = 0;
    public int cumulativeFunds = 0;
    public static void main(String[] args) {
        System.out.println("Welcome to the gambling Simulator ");
        System.out.println("This problem simulates a Gambler who starts with a stake and bets every game to win or loose some stake. Being a Calculative Gambler exits if the Stake reaches a high or a low limit");
        GamblingSimulator gambler = new GamblingSimulator();
        gambler.gameInitialise();
        gambler.makeBet();

    }
    public void gameInitialise(){
        System.out.println("Initialising game.....");
        funds=100;
        bet=1;
        System.out.println("Funds: "+funds);
    }

    /*As a Gambler, would start with a stake of $100 every day and bet $1 every game.*/

    public void makeBet(){
        double result = Math.random();
        boolean betResult = false;
        if (result>0.5){
            funds=funds+bet;
            wins++;
            betResult =true;
        }
        else {
            funds=funds-bet;
        }
        displayResults(betResult);
    }
    public void displayResults(boolean result){
        System.out.println();
        if (result)
            System.out.println("WON");
        else
            System.out.println("LOST");
        System.out.println("Funds :" +funds);
    }
    /*As a Gambler make $1 bet so either win or loose $1*/
    public void gamble(){
        int minimumFund = funds - (funds/2);
        int maximumFund = funds + (funds/2);
        while (funds<maximumFund && funds >minimumFund){
            makeBet();
        }
        System.out.println("Player resigns for the day:");
    }
    /*As a Calculative Gambler if won or lost 50% of the stake,would resign for the
day*/

    public void dailyGamble(){
        for (int day = 1; day <= 20; day++){
            funds = 100;
            gamble();
        }
        this.displayTwentyDaysResult();
    }
    public void displayTwentyDaysResult(){
        System.out.println("Funds stats after 20 days of gambling:");
        if (cumulativeFunds>(100*20))
            System.out.println("Total Fund Won :" +(cumulativeFunds-(100*20)));
        else
            System.out.println("Total Funds Lost : " +((100*20)-cumulativeFunds));
        System.out.println("Total Funds :"+cumulativeFunds);
    }
    /*After 20 days of playing every day would like to know the total amount won or lost.*/

}
