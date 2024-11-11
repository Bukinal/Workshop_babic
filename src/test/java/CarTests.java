import Task4.Clock;
import Task5.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTests {
    @Test
    void testCars() {
        Car car1 = new Car();

        car1.setBrand("Volvo");
        car1.setYear(2020);
        car1.setModel("C32jk");

        System.out.println(car1.getYear());
        System.out.println(car1.getModel());
        System.out.println(car1.getBrand());
    }

    }
