package solutions;

import java.util.IntSummaryStatistics;
import java.util.List;

public class Exercise4 {
    public static void main(String[] args) {
        List<Integer> salaries = List.of(
                50000, 55000, 60000, 62000, 65000, 70000, 75000, 80000, 85000, 90000,
                590000, 595000, 600000, 605000, 610000, 615000, 620000, 625000, 630000,
                95000, 100000, 105000, 110000, 115000, 120000, 125000, 130000, 135000,
                185000, 190000, 195000, 200000, 205000, 210000, 215000, 220000, 225000,
                500000, 505000, 510000, 515000, 520000, 525000, 530000, 535000, 540000,
                275000, 280000, 285000, 290000, 295000, 300000, 305000, 310000, 315000,
                680000, 685000, 690000, 695000, 700000, 705000, 710000, 715000, 720000,
                140000, 145000, 150000, 155000, 160000, 165000, 170000, 175000, 180000,
                455000, 460000, 465000, 470000, 475000, 480000, 485000, 490000, 495000,
                365000, 370000, 375000, 380000, 385000, 390000, 395000, 400000, 405000,
                230000, 235000, 240000, 245000, 250000, 255000, 260000, 265000, 270000,
                320000, 325000, 330000, 335000, 340000, 345000, 350000, 355000, 360000,
                635000, 640000, 645000, 650000, 655000, 660000, 665000, 670000, 675000,
                545000, 550000, 555000, 560000, 565000, 570000, 575000, 580000, 585000,
                410000, 415000, 420000, 425000, 430000, 435000, 440000, 445000, 450000,
                725000, 730000, 735000, 740000, 745000, 750000
        );

        IntSummaryStatistics stats = salaries.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.println("Sum: " + stats.getSum());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Minimum: " + stats.getMin());
        System.out.println("Maximum: " + stats.getMax());
    }
}
