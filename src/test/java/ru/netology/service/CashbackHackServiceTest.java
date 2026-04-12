package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {

    @Test
    public void shouldLessBoundary() {


        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldEqualsBoundary() {


        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldMoreBoundary() {


        CashbackHackService service = new CashbackHackService();
        int amount = 1500;

        int actual = service.remain(1500);
        int expected = 500;

        assertEquals(expected, actual);
    }
}
