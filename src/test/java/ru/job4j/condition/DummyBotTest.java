package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class DummyBotTest {
    @Test
    public void whenGreetBot() {
        String in = "Привет, Бот.";
        String result = DummyBot.answer(in);
        String expected = "Привет, умник.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenByeBot() {
        String in = "Пока.";
        String result = DummyBot.answer(in);
        String expected = "До скорой встречи.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenUnknownBot() {
        String in = "Сколько будет 2 + 2?";
        String result = DummyBot.answer(in);
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        Assert.assertEquals(expected, result);
    }
}
//Вам необходимо разработать программу "Глупый бот".
//
//Бот должен принимать строку и возвращать ответ.
//
//Бот наш глупый. Он знает только три фразы.
//
//Если пришла фраза "Привет, Бот.", бот отвечает: "Привет, умник."
//
//Если пришла фраза "Пока.", бот отвечает: "До скорой встречи."
//
//Если пришла любая другая фраза,  бот отвечает: "Это ставит меня в тупик. Задайте другой вопрос."
//
//Помните, что строки можно сравнивать только через методы equals. Нельзя использовать ==.
//
//Давайте составим каркас класса.