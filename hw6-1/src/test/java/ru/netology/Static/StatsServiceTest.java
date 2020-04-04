package ru.netology.Static;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldFindSumSalesExample1() {
        StatsService stats = new StatsService();
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18);
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = stats.findSumSales(month);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldfindAverageSalesExample1() {
        StatsService stats = new StatsService();
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = stats.findAverageSales(month);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldfindMonthMaxSalesExample1() {
        StatsService stats = new StatsService();
        int expected = 8;
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = stats.findMonthMaxSales(month);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldfindMonthMinSalesExample1() {
        StatsService stats = new StatsService();
        int expected = 9;
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = stats.findMonthMinSales(month);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldfindMonthSalesUnderAverageExample1() {
        StatsService stats = new StatsService();
        int expected = 5;
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = stats.findMonthSalesUnderAverage(month);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldfindMonthSalesOverAverageExample1() {
        StatsService stats = new StatsService();
        int expected = 5;
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = stats.findMonthSalesOverAverage(month);
        assertEquals(expected, actual);
    }
}