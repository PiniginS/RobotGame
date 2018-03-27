import java.util.Random;

public class Robot {
    private int quest_number;

    public Robot (int max_number) {
        Random random = new Random();
        quest_number = random.nextInt(max_number);
    }

    public String checkNumber (int ask_number) {
        if (ask_number<quest_number) return "Больше";
        else if (ask_number>quest_number) return "Меньше";
        else return "Првильно!";
    }
}
