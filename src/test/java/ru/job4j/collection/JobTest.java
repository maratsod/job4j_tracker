package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameAndPrority1() {
        Comparator<Job> cmpNamePriority = new JobIncreaseByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Stone tone", 4),
                new Job("Stone tone", 3)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameAndPrority2() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobIncreaseByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Rock pork", 2),
                new Job("Stone tone", 4)
        );
        assertThat(rsl, greaterThan(0));
    }
}