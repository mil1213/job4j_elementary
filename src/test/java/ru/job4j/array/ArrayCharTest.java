package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean rsl = ArrayChar.startWith(word, pref);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 't', 'l'};
        boolean rsl = ArrayChar.startWith(word, pref);
        Assert.assertFalse(rsl);
    }
}