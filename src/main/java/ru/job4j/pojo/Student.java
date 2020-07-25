package ru.job4j.pojo;

public class Student {
    private String name;
    private String surname;
    private String patronymic;
    private String group;
    private String entered;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEntered() {
        return entered;
    }

    public void setEntered(String entered) {
        this.entered = entered;
    }

    public String toString() {

        return name + " " + surname + " " + patronymic;
    }

}
