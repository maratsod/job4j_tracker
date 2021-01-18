package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> nameIs = (Person person) -> person.getName().contains(key);
        Predicate<Person> surnameIs = (Person person) -> person.getSurname().contains(key) ;
        Predicate<Person> phoneIs = (Person person) -> person.getPhone().contains(key);
        Predicate<Person> addressIs = (Person person) -> person.getAddress().contains(key);
        Predicate<Person> combine =  nameIs.or(surnameIs).or(phoneIs).or(addressIs);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}