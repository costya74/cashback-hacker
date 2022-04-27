package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceJUnitTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void sholdTestRemainZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 5000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void sholdTestRemainZero1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void sholdTestRemain300() {
        CashbackHackService service = new CashbackHackService();
        int amount = 4700;
        int expected = 300;
        int actual = service.remain(amount);
        assertEquals(expected, actual
        );
    }
    @org.junit.Test
    public void sholdTestRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void sholdTestRemainNegative() {
        CashbackHackService service = new CashbackHackService();
        int amount = -2000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
    @Test
    public void sholdTestRemainNegative1() {
        CashbackHackService service = new CashbackHackService();
        int amount = -1500;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}