package Task5;

public class Car implements Drivable {
    String model;
    int year;
    String brand;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void drive(int distance) {

    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
