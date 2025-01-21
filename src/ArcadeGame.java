public class ArcadeGame {
    String gameName;
    int numberOfTokens;
    boolean isMultiplayer;

    public ArcadeGame(String paramGameName, int paramNumberOfTokens, boolean paramIsMultiplayer){
        gameName = paramGameName;
        numberOfTokens = paramNumberOfTokens;
        isMultiplayer = paramIsMultiplayer;
    }

    public void printInfo(){
        System.out.println("Game Name: " + gameName + "\nNumber of Tokens: " + numberOfTokens + "\nMultiplayer: " + isMultiplayer);
    }
}
