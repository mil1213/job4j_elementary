package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class DummyBotTest {
   @Test
    public void whenGreetBot() {
      String in = "Привет, Бот.";
      String exp = "Привет, умник.";
      String rsl = DummyBot.answer(in);
      Assert.assertEquals(exp, rsl);
   }

   @Test
   public void whenDyeBot() {
      String in = "Пока.";
      String exp = "До скорой встречи.";
      String rsl = DummyBot.answer(in);
      Assert.assertEquals(exp, rsl);
   }

   @Test
   public void whenUnknownBot() {
      String in = "Который час?";
      String exp = "Это ставит меня в тупик. Задайте другой вопрос.";
      String rsl = DummyBot.answer(in);
      Assert.assertEquals(exp, rsl);
   }
}