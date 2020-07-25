package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivan");
        student.setSurname("Ivanov");
        student.setPatronymic("Ivanovich");
        student.setGroup("12345");
        student.setEntered("01.09.2020");

        System.out.println(student + ", group number is " + student.getGroup() + ", the date of entrance is " + student.getEntered());
    }
}
