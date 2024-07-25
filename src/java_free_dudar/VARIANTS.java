package java_free_dudar;


import java.util.Random;

public enum VARIANTS {
    ROCK,
    PAPER,
    SCISSORS;

    public static VARIANTS returnRandomVar(){
        int size = VARIANTS.values().length;
        Random random = new Random();
        int randomIndex = random.nextInt(size);
        return VARIANTS.values()[randomIndex];
    }
}



