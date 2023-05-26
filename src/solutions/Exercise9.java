package solutions;

import solutions.games.Game;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise9 {
    public static List<Game> newArrivals = Arrays.asList(
            new Game("Europa Universolis VIII", 39.99, "Strategy"),
            new Game("Farming Simulation 2024", 12.99, "Simulation"),
            new Game("Climate Simulator", 19.99, "Simulation"),
            new Game("Crusader Kongs V", 39.99, "Strategy"),
            new Game("The Watcher V", 49.99, "RPG"),
            new Game("The Soms 7", 49.99, "Simulation"),
            new Game("God of Rawr: Ragnarök", 49.99, "Action"),
            new Game("Hogworts Legacy", 69.99, "RPG"),
            new Game("Village Romance", 12.99, "Simulation"),
            new Game("Whalehome", 49.99, "RPG"),
            new Game("Imperator Clone", 29.99, "Strategy"),
            new Game("Grand Deft Auto", 69.99, "RPG"),
            new Game("Geo-Political Simulation", 49.99, "Simulation")
    );

    public static void main(String[] args) {
        // Create nested 'Map' first grouped by genre, then by price
        Map<String, Map<Double, List<Game>>> sortedForShelves = newArrivals.stream()
                .collect(Collectors.groupingBy(Game::getGenre,
                        Collectors.groupingBy(Game::getPrice)));

        /* Print to console:
         Simulation
        	-49.99€[The Soms 7, Geo-Political Simulation]
        	-19.99€[Climate Simulator]
        	-12.99€[Farming Simulation 2024, Village Romance] */
        sortedForShelves.forEach((genre, priceGroups) -> {
            System.out.println(genre);
            priceGroups.forEach((price, listOfNames) -> System.out.println("\t-" + price + "€" + listOfNames));
        });
    }

}
