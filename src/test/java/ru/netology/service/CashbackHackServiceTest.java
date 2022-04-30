package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateRemainIfAmount0() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateRemainIfAmount700() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 700;
        int expected = 300;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateRemainIfAmount1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);//expected [0] but found [1000]
    }

    @Test
    public void shouldCalculateRemainIfAmount1100() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1100;
        int expected = 900;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }
}