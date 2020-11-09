package ru.netology.statistics;

public class StatsService {
    public int calculateSum(int[] salesByMonth) {
        int sum = 0;
        for (int monthSale : salesByMonth) {
            sum += monthSale;
        }
        return sum;
    }

    public float averageSum(int[] salesByMonth) {
        return (float) calculateSum(salesByMonth) / salesByMonth.length;
    }

    public int calculateMax(int[] salesByMonth) {
        int max = salesByMonth[0];
        int numberMonth = 0;
        int count = 1;
        for (int monthSale : salesByMonth) {
            if (monthSale >= max) {
                max = monthSale;
                numberMonth = count;
            }
            count++;
        }
        return numberMonth;
    }

    public int calculateMin(int[] salesByMonth) {
        int min = salesByMonth[0];
        int numberMonth = 0;
        int count = 1;
        for (int monthSale : salesByMonth) {
            if (monthSale <= min) {
                min = monthSale;
                numberMonth = count;
            }
            count++;
        }
        return numberMonth;
    }

    public int calculateSalesUnderAverage(int[] salesByMonth) {
        int count = 0;
        float average = averageSum(salesByMonth);
        for (int monthSale : salesByMonth) {
            if (monthSale < average) count++;
        }
        return count;
    }

    public int calculateSalesOverAverage(int[] salesByMonth) {
        int count = 0;
        float average = averageSum(salesByMonth);
        for (int monthSale : salesByMonth) {
            if (monthSale > average) count++;
        }
        return count;
    }
}

