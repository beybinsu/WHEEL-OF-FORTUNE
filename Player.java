import java.util.ArrayList;

public class Player {
    private String playerName;
    private int playerTurns = 10;
    private int totalAnsweredQuestions;
    private int totalEasyQuest = 0;
    private int totalMedQuest = 0;
    private int totalHardQuest = 0;
    private int totalBraveQuest = 0;
    private int totalPlayedTurns = 0;
    private int playerPoints = 0;
    private int rolledDice;
    /*
    0 = easy
    1 = medium
    2 = hard
    3 = brave
     */

    public int getRolledDice() {
        return rolledDice;
    }

    public void setRolledDice(int rolledDice) {
        this.rolledDice = rolledDice;
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    public int getTotalBraveQuest() {
        return totalBraveQuest;
    }

    public int getTotalAnsweredQuestions() {
        return totalAnsweredQuestions;
    }

    public int getTotalEasyQuest() {
        return totalEasyQuest;
    }

    public int getTotalHardQuest() {
        return totalHardQuest;
    }

    public int getTotalMedQuest() {
        return totalMedQuest;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerTurns() {
        return playerTurns;
    }

    public int getTotalPlayedTurns() {
        return totalPlayedTurns;
    }

    public void setPlayerPass(int playerPass) {
        this.playerTurns = playerPass;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerTurns(int playerTurns) {
        this.playerTurns = playerTurns;
    }

    public void setTotalAnsweredQuestions(int totalAnsweredQuestions) {
        this.totalAnsweredQuestions = totalAnsweredQuestions;
    }

    public void setTotalEasyQuest(int totalEasyQuest) {
        this.totalEasyQuest = totalEasyQuest;
    }

    public void setTotalHardQuest(int totalHardQuest) {
        this.totalHardQuest = totalHardQuest;
    }

    public void setTotalMedQuest(int totalMedQuest) {
        this.totalMedQuest = totalMedQuest;
    }

    public void setTotalPlayedTurns(int totalPlayedTurns) {
        this.totalPlayedTurns = totalPlayedTurns;
    }

    public void setTotalBraveQuest(int totalBraveQuest) {
        this.totalBraveQuest = totalBraveQuest;
    }

    public void turnRemoval(){
        playerTurns--;
    }

    public void addPointPlayer(int index){
        playerPoints = playerPoints + index;
    }

    public void addQuestionCounter(int index){
        /*
    0 = easy
    1 = medium
    2 = hard
    3 = brave
     */
        switch (index){
            case 0:
                totalEasyQuest++;
                break;
            case 1:
                totalMedQuest++;
                break;
            case 2:
                totalHardQuest++;
                break;
            case 3:
                totalBraveQuest++;
                break;
        }


    }

    @Override
    public String toString() {
        return playerName+"'s statistics: \n"+
                "Points = "+playerPoints+"\n"+
                "Answered Easy Questions = "+totalEasyQuest+"\n"+
                "Answered Medium Questions = "+totalMedQuest+"\n"+
                "Answered Hard Questions = "+totalHardQuest+"\n"+
                "Answered Brave Questions = "+totalBraveQuest;
    }

    //easy answered -> -1 turns
    //medium answered -> -1+1 = 0 turns
    //hard answered -> -1+2 = 1 turns
    //brave answered -> -1+2 = 1 turns
    //If a question is answered wrong or passed without an answer, the player will lose points depending on the level of the question

    //easy = 5 points
    //medium = 10 points
    //hard = 20 points
    //brave = 15 points
    //TOTAL POINTS 700
    //EASY TOTAL 100
    //MEDIUM TOTAL 150
    //HARD TOTAL 300
    //BRAVE TOTAL 150
    //brave is advantageous to medium because you can get a free turn

}

