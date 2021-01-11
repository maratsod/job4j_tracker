package ru.job4j.collection;

import ru.job4j.tracker.Item;

import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(User other) {
        int rsl = this.name.compareTo(other.getName());
        if (rsl == 0) {
            rsl = Integer.compare(this.age, other.age);
        }
        return rsl;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
