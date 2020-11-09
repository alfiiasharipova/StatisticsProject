package ru.netology.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSum() {
        int expected = 180;
        StatsService service = new StatsService();
        int actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void averageSum() {
        float expected = 15;
        StatsService service = new StatsService();
        float actual = service.averageSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateMax() {
        int expected = 8;
        StatsService service = new StatsService();
        float actual = service.calculateMax(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateMin() {
        int expected = 9;
        StatsService service = new StatsService();
        float actual = service.calculateMin(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateSalesUnderAverage() {
        int expected = 5;
        StatsService service = new StatsService();
        float actual = service.calculateSalesUnderAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateSalesOverAverage() {
        int expected = 5;
        StatsService service = new StatsService();
        float actual = service.calculateSalesOverAverage(sales);
        assertEquals(expected, actual);
    }
}