package solutions;

import solutions.shoppingcarts.ShoppingCart;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise8 {
    public static List<ShoppingCart> purchases = List.of(
            new ShoppingCart(2, 15.99, "C123", "Monday", List.of("Lipstick", "Mascara")),
            new ShoppingCart(1, 59.99, "C345", "Tuesday", List.of("Face Cream")),
            new ShoppingCart(3, 10.50, "C789", "Friday", List.of("Shampoo", "Conditioner", "Hair Spray")),
            new ShoppingCart(4, 29.99, "C456", "Wednesday", List.of("Body Wash", "Loofah", "Deodorant", "Bath Bomb")),
            new ShoppingCart(1, 12.99, "C987", "Monday", List.of("Mouthwash")),
            new ShoppingCart(2, 49.99, "C654", "Saturday", List.of("Perfume", "Body Lotion")),
            new ShoppingCart(3, 29.99, "C321", "Sunday", List.of("Facial Cleanser", "Toner", "Moisturizer")),
            new ShoppingCart(2, 17.50, "C890", "Monday", List.of("Hair Gel", "Hair Oil")),
            new ShoppingCart(1, 6.99, "C567", "Tuesday", List.of("Sunscreen")),
            new ShoppingCart(4, 69.99, "C234", "Wednesday", List.of("Razor", "Shaving Cream", "Aftershave", "Razor Blades")),
            new ShoppingCart(2, 19.99, "C876", "Thursday", List.of("Hand Soap", "Bath Bomb")),
            new ShoppingCart(1, 39.99, "C543", "Friday", List.of("Hair Dryer")),
            new ShoppingCart(3, 13.99, "C210", "Saturday", List.of("Foot Cream", "Foot Scrub", "Nail File")),
            new ShoppingCart(2, 29.99, "C999", "Sunday", List.of("Makeup Remover", "Facial Oil")),
            new ShoppingCart(1, 7.99, "C111", "Monday", List.of("Hand Cream")),
            new ShoppingCart(4, 15.50, "C222", "Tuesday", List.of("Mouth guard", "Toothbrush", "Tongue Scraper", "Toothpaste")),
            new ShoppingCart(3, 45.99, "C333", "Wednesday", List.of("Blush", "Bronzer", "Highlighter")),
            new ShoppingCart(3, 19.99, "C444", "Thursday", List.of("Hairbrush", "Comb", "Hair Clips")),
            new ShoppingCart(1, 8.99, "C555", "Friday", List.of("Facial Mist")),
            new ShoppingCart(2, 22.50, "C666", "Saturday", List.of("Face Mask", "Hand Cream")),
            new ShoppingCart(1, 7.99, "C777", "Sunday", List.of("Eyelash Curler")),
            new ShoppingCart(4, 5.99, "C888", "Monday", List.of("Nail Polish Remover", "Loofah", "Deodorant", "Bath Bomb"))
    );

    public static void main(String[] args) {
        // Step 1: Calculate the average amount spent per purchase
        double avgAmountSpent = purchases.stream()
                .mapToDouble(ShoppingCart::getPrice)
                .average()
                .orElse(0);
        System.out.println("Average amount spent per purchase: $" + avgAmountSpent);

        // Step 2: Calculate the average number of items purchased per order
        double avgNumItems = purchases.stream()
                .mapToInt(ShoppingCart::getNumberOfItems)
                .average()
                .orElse(0);
        System.out.println("Average number of items purchased per order: " + avgNumItems);

        // Step 3: Find the days of the week on which the store receives the most and least orders
        Map<String, Long> ordersByDay = purchases.stream()
                .collect(Collectors.groupingBy(
                        ShoppingCart::getWeekday,
                        Collectors.counting()
                ));

        // Print 'Map' to console
        ordersByDay.forEach((day, number) -> System.out.println(day + ": " + number));
    }
}
