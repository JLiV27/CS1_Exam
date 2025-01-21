public class Arcade {

    String name;
    boolean isOpen;
    int yearFounded;

    public static void main(String[] args) {
        Arcade pixelParadise = new Arcade();

    }

    public Arcade(){
        System.out.println("Hello World! Good luck on your exams!");

        name = "Pixel Paradise";
        isOpen = true;
        yearFounded = 1985;

        System.out.println("Welcome to " + name + "! It is " + isOpen + " that we are open." +
                " We were founded in " + yearFounded + ".");

        yearFounded = 2008;

        System.out.println("Welcome to " + name + "! It is " + isOpen + " that we are open." +
                " We were founded in " + yearFounded + ".");

        spinForTokens();
        System.out.println("----------");
        gameOfTheDay("Tic Tac Toe");
        System.out.println("----------");
        displayScores();
        System.out.println("\n----------");
        ticketMultiplier();

        ArcadeGame classicGame = new ArcadeGame("Pinball", 2,false);
        classicGame.printInfo();

        System.out.println();

        ArcadeGame myFavGame = new ArcadeGame("Pac Man", 4, false);
        myFavGame.printInfo();
    }

    public void spinForTokens(){
        int randomInt = (int)(Math.random()*51 + 1);

        System.out.println("You spun the wheel and won " + randomInt + " tokens!");
    }

    public void gameOfTheDay(String gameName){
        System.out.println("Today's game of the day is " + gameName + ".");
    }

    public void displayScores(){
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("**********");

        for (int i = 200; i <= 1100; i = i + 300) {
            System.out.println(i);
        }

        System.out.println("**********");

        for (int i = 6; i >= 0; i--) {
            System.out.print(i + ",");
        }
    }

    public void ticketMultiplier(){
        double randomNum = Math.random();
        if(randomNum < 0.25){
            System.out.println("You've won 10 extra tickets.");
        }
        else if(randomNum < 0.5){
            System.out.println("You've won 50 extra tickets.");
        }
        else if(randomNum < 0.75){
            System.out.println("You've doubled your tickets.");
        }
        else{
            System.out.println("You've tripled your tickets.");
        }
    }
}
