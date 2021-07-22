package ru.job4j.data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ItemData {
    private LocalDateTime created = LocalDateTime.now();

    public LocalDateTime getCreated() {
        return created;
    }
}
