package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void sholdTestRemainZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 5000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
    @Test
    public void sholdTestRemainZero1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void sholdTestRemain300() {
        CashbackHackService service = new CashbackHackService();
        int amount = 4700;
        int expected = 300;
        int actual = service.remain(amount);
        assertEquals(expected, actual
        );
    }
    @Test
    public void sholdTestRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
    @Test
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