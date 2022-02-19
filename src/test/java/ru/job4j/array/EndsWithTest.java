package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class EndsWithTest {
    @Test
    public void whenFinishWithPostixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'l', 'o'};
        boolean rsl = EndsWith.endsWith(word, post);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenNotFinishWithPostixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'l', 'O'};
        boolean rsl = EndsWith.endsWith(word, post);
        Assert.assertFalse(rsl);
    }
}