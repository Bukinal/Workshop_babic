package homework1.task1;

public class Book implements Displayable {
    private String name;
    private String author;
    private int year;

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public void display() {
        System.out.println(this.name + " " + this.author + " " + this.year);
    }
}
