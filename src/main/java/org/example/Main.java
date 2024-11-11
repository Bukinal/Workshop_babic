package org.example;

public class Main {
    public static void main(String[] args) {

//    Book book1 = new Book();
//
//    book1.setName("Why");
//    book1.setAuthor("John");
//    book1.setYear(1990);
//
// book1.display();
        Student student1 = new Student();
        Student student2 = new Student();

        student1.age = 23;
        student2.age = 24;
        student1.name = "Artem";
        student2.name = "Bob";

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student2.name);
        System.out.println(student2.age);

//        student1.age = 0;
//        System.out.println(student1.age);
//        student1.age = student2.age;
//        System.out.println(student1.age);
//        student1.age = student1.age + 1;
//        System.out.println(student1.age);
//        student1.age += 1;
//        System.out.println(student1.age);
//        student1.age = student1.age * 2;
//        System.out.println(student1.age);


    }
}

class Student {
    public int age;
    public String name;

    public void plusOne() {
        this.age += 1;

    }

    public void plusHundred() {
        this.age += 100;

    }
}