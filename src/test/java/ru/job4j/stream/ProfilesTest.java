package ru.job4j.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {
    @Test
    public void whenGetAddresses() {
        List<Address> addresses = Arrays.asList(
                new Address("Krasnodar", "Lenina street", 31, 28),
                new Address("Moscow", "Butyrskaya street", 5, 43),
                new Address("Samara", "Revolyutsii street", 24, 78),
                new Address("Novosibirsk", "Trudovaya street", 19, 34),
                new Address("Chabarovsk", "Rabochaya street", 9, 63)
        );
        List<Profile> list = Arrays.asList(
                new Profile(addresses.get(0)),
                new Profile(addresses.get(1)),
                new Profile(addresses.get(2)),
                new Profile(addresses.get(3)),
                new Profile(addresses.get(4))
        );
        assertThat(
                Profiles.collect(list),
                is(addresses)
        );
    }
}