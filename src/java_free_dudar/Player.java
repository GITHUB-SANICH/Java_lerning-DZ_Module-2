package java_free_dudar;

public class Player {
    private VARIANTS choice;
    private String name = "Bob";
    public Player(){
        this.choice = VARIANTS.returnRandomVar();
    }
    public Player(VARIANTS choice, String playerName){
        this.choice = choice;
        this.name = playerName;
    }
    public String whoWins(Player player1, Player player2){
        VARIANTS choice1 = player1.choice;
        VARIANTS choice2 = player2.choice;
        if (choice1 == choice2) return "Ничья";

        switch (choice1){
            case ROCK -> {
                return (choice2 == VARIANTS.SCISSORS) ? "Победил: " + player1.name : "Победил: " + player2.name;
            }
            case PAPER -> {
                return  (choice2 == VARIANTS.ROCK) ? "Победил: " + player1.name : "Победил: " + player2.name;
            }
            case SCISSORS -> {
                return (choice2 == VARIANTS.PAPER) ? "Победил: " + player1.name : "Победил: " + player2.name;
            }
            default -> throw new IllegalStateException("Unexpected value: " + choice1);
        }
    }
}
