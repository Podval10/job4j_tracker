package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.ItemAscByName;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class JobTest {
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 2)
               );
        System.out.println(rsl);
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorByName() {
        List<Job> items = Arrays.asList(new Job("Nikolaevich", 4),
                new Job("Andrey", 2),
                new Job("Vasiliy", 1));
        items.sort(new JobByName());
        List<Job> expected = Arrays.asList(new Job("Andrey", 2),
                new Job("Nikolaevich", 4),
                new Job("Vasiliy", 1));
        assertThat(items).isEqualTo(expected);

    }

    @Test
    public void whenComparatorByPriority() {
        List<Job> items = Arrays.asList(new Job("Nikolaevich", 4),
                new Job("Andrey", 2),
                new Job("Vasiliy", 1));
        items.sort(new JobByPriority());
        List<Job> expected = Arrays.asList(new Job("Vasiliy", 1),
                new Job("Andrey", 2),
                new Job("Nikolaevich", 4));
        assertThat(items).isEqualTo(expected);

    }

    @Test
    public void whenComparatorDescByName() {
        List<Job> items = Arrays.asList(new Job("Nikolaevich", 4),
                new Job("Andrey", 2),
                new Job("Vasiliy", 1));
        items.sort(new JobDescByName());
        List<Job> expected = Arrays.asList(new Job("Vasiliy", 1),
                new Job("Nikolaevich", 4),
                new Job("Andrey", 2));
        assertThat(items).isEqualTo(expected);

    }

    @Test
    public void whenComparatorDescByPriority() {
        List<Job> items = Arrays.asList(new Job("Nikolaevich", 4),
                new Job("Andrey", 2),
                new Job("Vasiliy", 1));
        items.sort(new JobDescByPriority());
        List<Job> expected = Arrays.asList(new Job("Nikolaevich", 4),
                new Job("Andrey", 2),
                new Job("Vasiliy", 1));
        assertThat(items).isEqualTo(expected);

    }
}