package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import ru.job4j.hashmap.Label;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {
    @Test
    public void whenMoneyEqualsPrice() {
        List<Item> items = Arrays.asList(new Item(4, "Nikolaevich"),
                new Item(2, "Andrey"),
                new Item(1, "Vasiliy"));
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(new Item(2, "Andrey"),
                new Item(4, "Nikolaevich"),
                new Item(1, "Vasiliy"));
        assertThat(items).isEqualTo(expected);

    }

    @Test
    public void whenMoneyEqualsPrice2() {
        List<Item> items = Arrays.asList(new Item(4, "Nikolaevich"),
                new Item(2, "Andrey"),
                new Item(1, "Vasiliy"));

        items.sort(new ItemDescByName());

        List<Item> expected = Arrays.asList(new Item(1, "Vasiliy"),
                new Item(4, "Nikolaevich"),
                new Item(2, "Andrey"));
        assertThat(items).isEqualTo(expected);
    }
}