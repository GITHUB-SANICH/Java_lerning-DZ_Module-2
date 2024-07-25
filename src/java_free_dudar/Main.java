package java_free_dudar;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты
        Player bot = new Player(); // Есть конструкор без параметров
        Player alex = new Player(VARIANTS.SCISSORS, "Alex"); // А есть конструктор с параметрами

        // Получаем результат
        System.out.println(bot.whoWins(bot, alex));
    }
}