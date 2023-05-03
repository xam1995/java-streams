package solutions;

import solutions.guests.Guest;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise5 {
    public static void main(String[] args) {
        List<Guest> guestList = new ArrayList<>(List.of(
                new Guest("Gatsby", 30, "Gold"),
                new Guest("Flapper", 25, "Pearl"),
                new Guest("Daisy", 28, "Champagne"),
                new Guest("Charlie", 32, "Velvet"),
                new Guest("Al Capone", 35, "Sapphire"),
                new Guest("Josephine", 27, "Silver"),
                new Guest("Mickey", 29, "Ruby"),
                new Guest("Harlem", 33, "Emerald"),
                new Guest("Zelda", 26, "Amethyst"),
                new Guest("Duke", 31, "Crimson"),
                new Guest("Lola", 29, "Jade"),
                new Guest("Buster", 34, "Topaz"),
                new Guest("Pearl", 28, "Coral"),
                new Guest("Vincent", 32, "Indigo"),
                new Guest("Millie", 30, "Rose"),
                new Guest("Floyd", 35, "Lavender"),
                new Guest("Cecil", 27, "Lilac"),
                new Guest("Maude", 29, "Mint"),
                new Guest("Otto", 31, "Marigold"),
                new Guest("Flora", 28, "Tangerine"),
                new Guest("Lionel", 33, "Burgundy"),
                new Guest("Olive", 30, "Copper"),
                new Guest("Horace", 32, "Periwinkle"),
                new Guest("Violet", 26, "Cobalt"),
                new Guest("Evelyn", 29, "Turquoise"),
                new Guest("Walter", 34, "Magenta"),
                new Guest("Lillian", 31, "Cyan"),
                new Guest("Harrison", 27, "Plum"),
                new Guest("Nora", 28, "Coral"),
                new Guest("Victor", 33, "Lime"),
                new Guest("Edith", 30, "Teal"),
                new Guest("Arthur", 35, "Olive"),
                new Guest("Hazel", 26, "Slate"),
                new Guest("Maxwell", 32, "Azure"),
                new Guest("Esther", 29, "Blush"),
                new Guest("Milton", 34, "Mauve"),
                new Guest("Agnes", 31, "Peach"),
                new Guest("Stanley", 27, "Saffron"),
                new Guest("Clara", 28, "Platinum"),
                new Guest("Franklin", 33, "Sage"),
                new Guest("Pearl", 30, "Rose"),
                new Guest("Harvey", 35, "Thistle"),
                new Guest("Eleanor", 26, "Honeydew"),
                new Guest("Frederick", 32, "Denim"),
                new Guest("Beatrice", 29, "Lemon"),
                new Guest("Herman", 34, "Taffy"),
                new Guest("Mabel", 31, "Lilac"),
                new Guest("Winston", 27, "Mint"),
                new Guest("Gloria", 28, "Carnation"),
                new Guest("Norman", 33, "Amber"),
                new Guest("Eloise", 30, "Lavender"),
                new Guest("Calvin", 35, "Sapphire"),
                new Guest("Adeline", 26, "Periwinkle"),
                new Guest("Percy", 32, "Slate"),
                new Guest("Esther", 29, "Blush"),
                new Guest("Milton", 34, "Mauve"),
                new Guest("Agnes", 31, "Peach"),
                new Guest("Stanley", 27, "Saffron"),
                new Guest("Clara", 28, "Platinum"),
                new Guest("Franklin", 33, "Sage"),
                new Guest("Pearl", 30, "Rose"),
                new Guest("Harvey", 35, "Thistle"),
                new Guest("Eleanor", 26, "Honeydew"),
                new Guest("Frederick", 32, "Denim"),
                new Guest("Oliver", 29, "Crimson"),
                new Guest("Matilda", 34, "Gold"),
                new Guest("George", 31, "Amethyst"),
                new Guest("Adelaide", 27, "Sapphire"),
                new Guest("Simon", 28, "Emerald"),
                new Guest("Beatrice", 33, "Ruby"),
                new Guest("Felix", 30, "Indigo"),
                new Guest("Sophia", 35, "Silver"),
                new Guest("Henry", 26, "Copper"),
                new Guest("Isabella", 32, "Pearl")
        ));

        // Filter, transform, and sort the names
        List<String> refinedList = guestList.stream()
                .filter(guest -> guest.getAge() < 30)
                .map(Guest::getName)
                .distinct()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .toList();

        // Create a map of names and their corresponding favorite colors
        Map<String, String> nameColorMap = guestList.stream()
                .filter(guest -> guest.getAge() < 30)
                .collect(Collectors.toMap(
                        g -> g.getName().toUpperCase(),
                        Guest::getFavoriteColor,
                        (color1, color2) -> color1 // In case of duplicate names, choose one color
                ));

        // Display the refined list of names and their favorite colors
        System.out.println("Refined List of Guests:");
        for (String name : refinedList) {
            String favoriteColor = nameColorMap.get(name);
            System.out.println(name + " - Favorite Color: " + favoriteColor);
        }

    }
}