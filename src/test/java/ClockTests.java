import Task4.Clock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClockTests {
    @Test
    void testTickSeconds() {
        Clock clock1 = new Clock();
        clock1.setHour(4);
        clock1.setMinute(25);
        clock1.setSecond(34);

        clock1.tick();

        Assertions.assertEquals(35, clock1.getSecond());
    }

    @Test
    void testTickMinutes() {
        Clock clock1 = new Clock();
        clock1.setHour(4);
        clock1.setMinute(25);
        clock1.setSecond(59);

        clock1.tick();

        Assertions.assertEquals(0, clock1.getSecond());
        Assertions.assertEquals(26, clock1.getMinute());
        Assertions.assertEquals(4, clock1.getHour());
    }
    @Test
    void testTickHours() {
        Clock clock1 = new Clock();
        clock1.setHour(1);
        clock1.setMinute(59);
        clock1.setSecond(59);

        clock1.tick();

        Assertions.assertEquals(0, clock1.getSecond());
        Assertions.assertEquals(0, clock1.getMinute());
        Assertions.assertEquals(2, clock1.getHour());
    }
    @Test
    void testTickDays() {
    Clock clock1 = new Clock();
        clock1.setHour(23);
        clock1.setMinute(59);
        clock1.setSecond(59);

        clock1.tick();

        Assertions.assertEquals(0, clock1.getSecond());
        Assertions.assertEquals(0, clock1.getMinute());
        Assertions.assertEquals(0, clock1.getHour());
}
    }
