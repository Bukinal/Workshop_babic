package homework1.task2;

public class Student implements Printable {
    String name;
    int id;
    int grade;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public int getGrade() {
        return this.grade;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public void print() {
        System.out.println(this.name + "\t" + this.grade + "\t" + this.id);
    }
}

