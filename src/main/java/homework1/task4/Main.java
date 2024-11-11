package homework1.task4;

public class Main {
    public static void main(String[] args) {

        Clock clock1 = new Clock();
        clock1.setHour(4);
        clock1.setMinute(25);
        clock1.setSecond(59);

        clock1.tick();
        clock1.readTime();
    }
}
