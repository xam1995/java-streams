## Java Streams API Exercises ✨
#### (courtesy of ChatGPT | difficulty in ascending order)

### Exercise 1: Filtering and Mapping 🎯

Write a program that reads a list of integers from the user and uses streams to filter out the even numbers and square the remaining odd numbers. Display the resulting list.

```java
   List<Integer> numbers = new ArrayList<>(List.of(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49, 50
        ));
```
<details>
  <summary>Hint 💡</summary>
You need to filter(), map() and then collect().
</details>

### Exercise 2: Sorting and Limiting 📚

```java
      List<String> companyNames = new ArrayList<>(List.of(
                "Walmart", "Amazon", "Exxon Mobil", "Berkshire Hathaway", "Apple",
                "UnitedHealth Group", "McKesson", "CVS Health", "AmerisourceBergen", "AT&T",
                "Ford Motor", "General Motors", "General Electric", "Verizon Communications", "Cardinal Health",
                "Costco Wholesale", "Kroger", "Chevron", "Fannie Mae", "Walgreens Boots Alliance",
                "JPMorgan Chase", "Boeing", "Microsoft", "Bank of America", "Home Depot",
                "Wells Fargo", "Citigroup", "Phillips 66", "Anthem", "IBM",
                "AT&T", "Johnson & Johnson", "State Farm Insurance", "Comcast", "Marathon Petroleum",
                "Procter & Gamble", "Archer Daniels Midland", "Target", "MetLife", "Freddie Mac",
                "United Technologies", "PepsiCo", "Pfizer", "Coca-Cola", "Sysco",
                "Centene", "Disney", "Lowe's", "Intel", "Energy Transfer",
                "Prudential Financial", "Albertsons", "Caterpillar", "Delta Air Lines", "3M"
        ));
```

Use streams to sort the Fortune 500 company names in alphabetical order. Then, limit the output to the first ten strings and print them.

<details>
  <summary>Hint 💡</summary>
You need to sort(), limit() and collect().
</details>

### Exercise 3: Grouping and Counting 🔢

Given a list of about 160 common words in the English language, use streams to group the words by their lengths and count the number of words in each group. Display the lengths and their corresponding word counts.

```java
  List<String> commonWords = new ArrayList<>(List.of(
                "the", "be", "to", "of", "and",
                "a", "in", "that", "have", "I",
                "it", "for", "not", "on", "with",
                "he", "as", "you", "do", "at",
                "this", "but", "his", "by", "from",
                "they", "we", "say", "or", "an",
                "will", "my", "one", "all", "would",
                "there", "what", "so", "up", "out",
                "if", "about", "who", "get", "which",
                "go", "me", "when", "make", "can",
                "like", "time", "no", "just", "him",
                "know", "take", "person", "into", "year",
                "your", "good", "some", "could", "them",
                "see", "other", "than", "then", "now",
                "look", "only", "come", "its", "over",
                "think", "also", "back", "after", "use",
                "two", "how", "our", "work", "first",
                "well", "way", "even", "new", "want",
                "because", "any", "these", "give", "day",
                "most", "us", "is", "was", "were",
                "been", "being", "am", "are", "has",
                "have", "had", "do", "does", "did",
                "will", "would", "shall", "should", "may",
                "might", "must", "can", "could", "ought",
                "a", "an", "the", "and", "but",
                "or", "as", "if", "when", "than",
                "because", "while", "where", "after", "so",
                "though", "since", "until", "whether", "before",
                "although", "nor", "like", "once", "unless",
                "except", "what", "who", "which", "that",
                "wherever", "whenever", "why", "now", "then",
                "here", "there", "when", "where", "why",
                "how", "however"
        ));
```

<details>
  <summary>Hint 💡</summary>
Your result needs to be stored in a Map &lt;Integer, Long&gt;. You’ll need to collect with Collectors.groupBy(), use the method length() of String and then Collectors.counting().
</details>

### Exercise 4: Summarizing Statistics 📊

Write a program that reads a list of 142 fictitious Java developer salaries in Europe (€) from the user and uses streams to calculate the sum, average, minimum, and maximum values of the list. Display these statistics.

```java
List<Integer> salaries = List.of(
                50000, 55000, 60000, 62000, 65000, 70000, 75000, 80000, 85000, 90000,
                275000, 280000, 285000, 290000, 295000, 300000, 305000, 310000, 315000,
                680000, 685000, 690000, 695000, 700000, 705000, 710000, 715000, 720000,
                95000, 100000, 105000, 110000, 115000, 120000, 125000, 130000, 135000,
                455000, 460000, 465000, 470000, 475000, 480000, 485000, 490000, 495000,
                185000, 190000, 195000, 200000, 205000, 210000, 215000, 220000, 225000,
                230000, 235000, 240000, 245000, 250000, 255000, 260000, 265000, 270000,
                320000, 325000, 330000, 335000, 340000, 345000, 350000, 355000, 360000,
                365000, 370000, 375000, 380000, 385000, 390000, 395000, 400000, 405000,
                410000, 415000, 420000, 425000, 430000, 435000, 440000, 445000, 450000,
                635000, 640000, 645000, 650000, 655000, 660000, 665000, 670000, 675000,
                500000, 505000, 510000, 515000, 520000, 525000, 530000, 535000, 540000,
                545000, 550000, 555000, 560000, 565000, 570000, 575000, 580000, 585000,
                140000, 145000, 150000, 155000, 160000, 165000, 170000, 175000, 180000,
                590000, 595000, 600000, 605000, 610000, 615000, 620000, 625000, 630000,
                725000, 730000, 735000, 740000, 745000, 750000
        );
```

<details>
  <summary>Hint 💡</summary>
Your result is of the type IntSummaryStatistics. You’ll need to mapToInt your primitive ints first and then summaryStatistics.
</details>

### Exercise 5: Chaining Operations ⛓️

Imagine you are hosting a glamorous 1920s-themed party with a guest list of 74 fashionable individuals. Using the power of modern Java streams, you want to create a refined list of guests who are 'young and vibrant.' To achieve this, follow these steps:

1. Filter out the guests who are younger than 30, as we're only interested in the 'young and vibrant' crowd.
2. Transform the names of the selected guests to uppercase, adding an extra touch of elegance and sophistication.
3. Embrace the spirit of the Jazz Age by sorting the names in reverse order, creating an air of mystery and intrigue.
4. Finally, showcase the refined list of names, along with their corresponding favorite color, allowing you to admire their vibrant personalities.

Let the transformation begin, and let the roaring 1920s charm shine through!

```java 
public class Guest {
    private String name;
    private int age;
    private String favoriteColor;

    public Guest(String name, int age, String favoriteColor) {
        this.name = name;
        this.age = age;
        this.favoriteColor = favoriteColor;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }
}
```

```java
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
```

