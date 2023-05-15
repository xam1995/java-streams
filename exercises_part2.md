## Java Streams API Exercises #2 ✨

#### (courtesy of ChatGPT | difficulty in ascending order)

### Exercise 6: Santa's Secret Helper 🎅🎁 | ⭐

There are over 2 billion children in the world right now. Each one of them wants at least one present from Santa by the
end of the year.
It's May, which means it's the busiest time of the year at Santa's workshop and one of the elves (Elvin Elvinsson) is
working on getting the new labeling machine up and running. 🖨

The machine accepts only two data streams, first numbers as doubles, then followed by a stream of country names in
uppercase letters.
This makes it a bit tricky to work with, but Elvin managed to overcome most of the challenges. Keep in mind, Santa's
workshop is printing billions of labels every year and can't waste any extra space. 🏷

However, Elvin has limited programming experience and learned most of the things he knows from a basic Elvemy course
online. The label machine works for now - but in the long run - his style of coding will make the entire code base
unmaintainable and difficult to read for anyone trying to update it in the future.
Note how many different variable names Elvin has used (countryName, country, newCtryNme etc.)! We could save him (and
ourselves) a lot of trouble by replacing some of the lambda expressions in the code with much simpler method references.

We got to work fast, otherwise Dutch and Kiwi kids won't get any gifts this year as their countries aren't added to the
list yet.
You should be able to replace 7 expressions in total in the given code snippet below. (Try yourself first, only use
IntelliJ's auto-suggest function, when you get stuck for longer than 5 minutes.)

Make sure the output doesn't change and become Santa's secret helper this year. 🎄✨<br>
Use the table below to get an idea of how to rewrite lambdas into their corresponding method references.

| Lambda Expressions               | Equivalent Method References |
|----------------------------------|------------------------------|
| (s) -> Integer.parselnt(s)       | Integer:parselnt             |
| (String s) -> s.toLowerCase()    | String::toLowerCase          |
| (int i) -> System.out.println(i) | System.out:println           |
| (Student s) -> s.getName()       | Student::getName             |
| () -> s.getName()                | s::getName                   |
| () -> new Student()              | Student::new                 |

**Code snippet:**

```java
public static List<String> countries=List.of(
        "Albania","Algeria","Andorra","Angola","Argentina","Armenia","Australia",
        "Austria","Azerbaijan","Bahamas","Bahrain","Bangladesh","Barbados","Belarus","Belgium",
        "Belize","Benin","Bhutan","Bolivia","Botswana","Brazil","Brunei","Bulgaria","Burundi",
        "Cabo Verde","Cambodia","Cameroon","Canada","Chad","Chile","China","Colombia","Comoros",
        "Costa Rica","Croatia","Cuba","Cyprus","Denmark","Djibouti","Ecuador","Egypt","Eritrea",
        "Estonia","Eswatini","Ethiopia","Fiji","Finland","France","Gabon","Gambia","Georgia","Germany",
        "Ghana","Greece","Grenada","Guatemala","Guinea","Guyana","Haiti","Honduras","Hungary","Iceland",
        "India","Indonesia","Iran","Iraq","Ireland","Israel","Italy","Jamaica","Japan","Jordan","Kazakhstan",
        "Kenya","Kiribati","Kosovo","Kuwait","Kyrgyzstan","Laos","Latvia","Lebanon","Lesotho","Liberia","Libya",
        "Lithuania","Luxembourg","Madagascar","Malawi","Malaysia","Maldives","Mali","Malta","Mauritania",
        "Mauritius","Mexico","Micronesia","Moldova","Monaco","Mongolia","Montenegro","Morocco","Mozambique",
        "Namibia","Nauru","Nepal","Nicaragua","Niger","Nigeria","Norway","Oman","Pakistan","Palau","Palestine",
        "Panama","Paraguay","Peru","Poland","Portugal","Qatar","Romania","Russia","Rwanda"
        );

public static void main(String[]args){
        // Creates a 'Map' of country name lengths with a corresponding list of countries
        Map<Integer, List<String>>wordLengthMap=countries.stream()
        .collect(Collectors.groupingBy(country->
        country.length(),
        ()->new HashMap<>(),
        Collectors.toList()));

        // Prints 'Map' to the console for debugging purposes only, comment out line below when you're done
        wordLengthMap.forEach((num,countries)->System.out.println(num+":"+countries));

        // Generates first output stream with number of characters of each country name converted to double, as the labelling machine requires mm values
        countries.stream()
        .map(ctr->ctr.length())
        .mapToDouble(num->Double.valueOf(num))
        .forEach(ctrLgthAsDbl->System.out.println(ctrLgthAsDbl));

        // Generates second output stream with country names as list in all uppercase letters
        countries.stream()
        .map(countryName->countryName.toUpperCase())
        .filter(country->country.length()< 10)
        .forEach(newCtryNme->System.out.println(newCtryNme));

        }
```

### Exercise 7: Hollywood Contacts 📞🎬 | ⭐️

It's award season and you need to pull some strings to attend the cooler parties. You have stumbled upon a database of
contacts from famous actors of the 1980s.
Luckily, none of them have ever changed their phone numbers, however, there is a slight problem... The database is
unsorted.

You've been told that the third name on the list should be able to get you invited to any party in 'the Hills', but who
is it?
As Java superstar, you've been tasked with sorting the list of contacts alphabetically by last name, hoping to fulfill
your lifelong dream of getting an autograph from Sylvester Stallone.
You've heard that using the streams API can make this task much easier and efficient, so you decide to work with it.

So let's get you to that party ASAP 🥂🤞🏻
Don't forget to bring your best outfit.
Here's what you need to do:

- [ ] Step 1: Override your the toString()-method in your class `Contact`, so you can see your contacts on the console.
- [ ] Step 2: Find out who is the third contact in your database sorted by last name.
- [ ] Step 3: Hmmm, maybe that person isn't the easiest to get to. Try sorting them by first name instead. Who's the 3rd
  on the list now?

```java
List<Contact> contacts=List.of(
        new Contact("Tom","Cruise","555-1234"),
        new Contact("Melanie","Griffith","555-5678"),
        new Contact("Michael","J. Fox","555-2468"),
        new Contact("Sigourney","Weaver","555-3690"),
        new Contact("Harrison","Ford","555-7089"),
        new Contact("Meryl","Streep","555-1357"),
        new Contact("Robin","Williams","555-9753"),
        new Contact("Sean","Connery","555-2668"),
        new Contact("Kathleen","Turner","555-0246"),
        new Contact("Kevin","Bacon","555-8642"),
        new Contact("Eddie","Murphy","555-2868"),
        new Contact("Diane","Keaton","555-7890"),
        new Contact("Ally","Sheedy","555-9999"),
        new Contact("Rob","Lowe","555-1111"),
        new Contact("Andrew","McCarthy","555-2222"),
        new Contact("Sylvester","Stallone","555-3456"),
        new Contact("Arnold","Schwarzenegger","555-7090")
        );
```

```java
public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
```

<details>
  <summary>Hint 💡</summary>
You need sorted() and Comparator.comparing(someExpressionThatGetsYouAName).
</details>

### Exercise 8: Buyer's Behavior 🛍💸 | ⭐⭐️

As the small beauty store website you're working for is lacking a data analyst, your boss tasks you with analyzing the
purchasing behavior of the store's customers. Using the provided list of `ShoppingCart` objects, you will need to
extract
some important insights to help plan ahead for the coming months. You really need this job, so hang in there a little
bit more and just get it done!

- [ ] Step 1: Calculate the average amount spent per purchase to help the store set a minimum order amount for free
  shipping.
- [ ] Step 2: Calculate the average number of items purchased per order to determine whether you can send your orders
  out in smaller envelopes (1 item only) or if you need the medium-sized boxes (2 items and more).
- [ ] Step 3: Group orders by day of the week, then print them to the console. Which day sees the most (where we need to
  plan for more staff) and which the least orders (where we need to run an ad campaign to increase sales)?

With this analysis, you'll be able to provide valuable insights to help the beauty store make data-driven decisions and
optimize their operations to meet the needs of their customers. Also, it keeps you from being unemployed and your boss
will be grateful in the future, allowing you to take off some extra days, no questions asked. 📈😌

```java
List<ShoppingCart> purchases=List.of(
        new ShoppingCart(2,15.99,"C123","Monday",List.of("Lipstick","Mascara")),
        new ShoppingCart(1,59.99,"C345","Tuesday",List.of("Face Cream")),
        new ShoppingCart(3,10.50,"C789","Friday",List.of("Shampoo","Conditioner","Hair Spray")),
        new ShoppingCart(4,29.99,"C456","Wednesday",List.of("Body Wash","Loofah","Deodorant","Bath Bomb")),
        new ShoppingCart(1,12.99,"C987","Monday",List.of("Mouthwash")),
        new ShoppingCart(2,49.99,"C654","Saturday",List.of("Perfume","Body Lotion")),
        new ShoppingCart(3,29.99,"C321","Sunday",List.of("Facial Cleanser","Toner","Moisturizer")),
        new ShoppingCart(2,17.50,"C890","Monday",List.of("Hair Gel","Hair Oil")),
        new ShoppingCart(1,6.99,"C567","Tuesday",List.of("Sunscreen")),
        new ShoppingCart(4,69.99,"C234","Wednesday",List.of("Razor","Shaving Cream","Aftershave","Razor Blades")),
        new ShoppingCart(2,19.99,"C876","Thursday",List.of("Hand Soap","Bath Bomb")),
        new ShoppingCart(1,39.99,"C543","Friday",List.of("Hair Dryer")),
        new ShoppingCart(3,13.99,"C210","Saturday",List.of("Foot Cream","Foot Scrub","Nail File")),
        new ShoppingCart(2,29.99,"C999","Sunday",List.of("Makeup Remover","Facial Oil")),
        new ShoppingCart(1,7.99,"C111","Monday",List.of("Hand Cream")),
        new ShoppingCart(4,15.50,"C222","Tuesday",List.of("Mouth guard","Toothbrush","Tongue Scraper","Toothpaste")),
        new ShoppingCart(3,45.99,"C333","Wednesday",List.of("Blush","Bronzer","Highlighter")),
        new ShoppingCart(3,19.99,"C444","Thursday",List.of("Hairbrush","Comb","Hair Clips")),
        new ShoppingCart(1,8.99,"C555","Friday",List.of("Facial Mist")),
        new ShoppingCart(2,22.50,"C666","Saturday",List.of("Face Mask","Hand Cream")),
        new ShoppingCart(1,7.99,"C777","Sunday",List.of("Eyelash Curler")),
        new ShoppingCart(4,5.99,"C888","Monday",List.of("Nail Polish Remover","Loofah","Deodorant","Bath Bomb"))
        );
```

```java
public class ShoppingCart {
    private int numberOfItems;
    private double price;
    private String customerId;
    private String weekday;
    private List<String> products;

    public ShoppingCart(int numberOfItems, double price, String customerId, String weekday, List<String> products) {
        this.numberOfItems = numberOfItems;
        this.price = price;
        this.customerId = customerId;
        this.weekday = weekday;
        this.products = products;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public double getPrice() {
        return price;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getWeekday() {
        return weekday;
    }

    public List<String> getProducts() {
        return products;
    }
}
```

<details>
  <summary>Hint 💡</summary>
Use the map method to extract the relevant fields for each calculation (e.g. price and number of items for averages, weekday for finding purchase patterns), then use the appropriate terminal operations (e.g. average, max, min) to compute the results.
</details>

### Exercise 9: The Video Game Store 👾🕹

You're 17 (again) and landed your first job at a video game store, mostly thanks to your mom knowing somebody who works
there. But let's
focus on the important things in life for now - money. 🤑

A box full of brand new video games arrived this morning. Your manager asks you to group all new video games first by
genre, and then by price. He gives you a lengthy lecture on his 'proven sales strategy', while you just stand there with
your arms crossed and act like you listen.

Alright, it's our first day, we can't upset him just yet. You decide to just do what he told you to, even though the box
turns out to be extremely heavy and all games have been thrown in there by a tornado, it seems! This is going to take
hours, you can't help but
think.

However, you noticed the stores database runs on a Java interface. You're curious if you could print out a list
already sorted by these given criteria. This would make it so much easier down the line. You could simply check off each
game off the list once you're done arranging them nicely
on the shelves. Remember - we want to make money - not get fired on the first day - the new iPhone is coming out
soon and our money is basically already spent on that. 🤷

The printed output should be a nested `Map` where the keys of the outer map are genre names and the values are maps
whose keys are prices of the games and values are lists of game names of that genre.

```java
// Example output:
// Jump and Run
// -5.99€[Subway Surfer, Temple Run]
// -3.99€[Flappy Bird]
// Sandbox
// -19.99€[Minecraft]
```

The database spits out the following list of games that newly arrived:

```java
List<Game> newArrivals=Arrays.asList(
        new Game("Europa Universolis VIII",39.99,"Strategy"),
        new Game("Farming Simulation 2024",12.99,"Simulation"),
        new Game("Climate Simulator",19.99,"Simulation"),
        new Game("Crusader Kongs V",39.99,"Strategy"),
        new Game("The Watcher V",49.99,"RPG"),
        new Game("The Soms 7",49.99,"Simulation"),
        new Game("God of Rawr: Ragnarök",49.99,"Action"),
        new Game("Hogworts Legacy",69.99,"RPG"),
        new Game("Village Romance",12.99,"Simulation"),
        new Game("Whalehome",49.99,"RPG"),
        new Game("Imperator Clone",29.99,"Strategy"),
        new Game("Grand Deft Auto",69.99,"RPG"),
        new Game("Geo-Political Simulation",49.99,"Simulation")
        );
```

<details>
  <summary>Hint 💡</summary>
Remember to make your own class 'Game' with getters and don't forget to override the toString()-method.
</details>

### Exercise 10: The Mystery of Xenos 🚀🌎 | ⭐️⭐️⭐️

In the year 2150, humanity has reached beyond the stars and established colonies on planets beyond our solar system.
One such colony _is_ - or better - _was_ located on the planet Xenos, dedicated to researching the unique flora and
fauna of
the planet.

### 🕵️‍♂️ The Investigation 📜

As a detective tasked with uncovering the fate of the Xenos colony,
you must scour through their system's log to piece together what happened to the colony after it was suddenly abandoned.
It's safer to do this remotely, rather than on site for reasons you can find yourself in the log-snippet below. Be
thankful that you know how to do this in Java and don't have to
travel to a potentially hazardous planet on the other side of the galaxy.

### ⏱ Time of the Future 🔍

In the future, most people have their own NeuraLink implant inserted into their brain right after the cloning process is
complete.
This also meant that first every country and later every colony in the Milky Way switched to the much easier
UNIX-timestamp format.
However, it's a bit tricky trying to make sense of it without the implant as you can probably see for yourself.

### 👣 Steps 🪜

- [ ] Step 1: Find a way to make the convertUnixTimestamp method work. There must have been a problem with the download
  stream as the original pattern was replaced by '???'.
- [ ] Step 2: Access the dates inside the squared brackets and think about which datatype you need to convert them to in
  the end (look at the parameter of your conversion method).
- [ ] Step 3: Report to your superior. He/she wants to know how long it took until the research colony was abandoned and
  how
  many days it was from the start to the first outbreak. Goal is it to establish safety protocols for the future
  preventing similar mistakes. You could print the number of days in front of the log entries or replace the content of
  the
  squared brackets to attach to your report. Don't forget that the streams API uses multi-threading, so you can just go
  with regular `Integer`s
  but the new "unbreakable" Integers instead.

Here is some code to get you started.
Use the convertUnixTimestamp() method to convert the UNIX-timestamps in the log to readable dates and times (mostly for
your own debugging):

```java
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public static String convertUnixTimestamp(long unixTimestamp){
        Instant instant=Instant.ofEpochSecond(unixTimestamp);
        ZoneId zoneId=ZoneId.systemDefault();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("???"); // TODO: Find out how to write a pattern for dates and times here, e.g. from largest (year) to smallest unit (second).
        return formatter.format(instant.atZone(zoneId));
        }


        long unixTimestamp=1641164400;
        String formattedDateTime=convertUnixTimestamp(unixTimestamp);
        System.out.println(formattedDateTime);
```

```java 
List<String> logHistory=List.of(
        "[5711765400] INFO - Research Module: Expedition team arrived at outpost and began setting up equipment.",
        "[5711869800] INFO - Observatory Module: System initialized.",
        "[5712030000] INFO - Observatory Module: Initial observations made of atmospheric conditions.",
        "[5712390000] INFO - Research Module: First samples of snow and ice collected for analysis.",
        "[5712670800] INFO - Research Module: Preliminary data analysis reveals promising results.",
        "[5713065000] INFO - Observatory Module: Further observations made of celestial objects and atmospheric phenomena.",
        "[5713273800] INFO - Research Module: Breakthrough discovery made in analysis of ice samples.",
        "[5713331400] INFO - Research Module: Samples of ice and snow collected and stored.",
        "[5713432200] WARNING - Weather Module: Severe weather conditions detected. Reinforcing camp.",
        "[5713662600] WARNING - Wildlife Module: Unusual activity observed in local wildlife.",
        "[5713684200] ERROR - Weather Module: Blizzard conditions. Hunkered down in shelter.",
        "[5713889400] ERROR - Communications Module: Communication with outside world lost.",
        "[5714902800] ERROR - Medical Module: Researchers showing signs of an unknown disease.",
        "[5715073800] CRITICAL - Supplies Module: Food and supplies running low. Expedition leader recommends evacuation.",
        "[5715151200] CRITICAL - Communications Module: All attempts at communication with outside world have failed. Evacuation plan initiated.",
        "[5715223200] CRITICAL - Medical Module: Disease symptoms worsening. Outbreak suspected.",
        "[5715417600] EMERGENCY - Medical Module: Disease confirmed as highly contagious. Isolation procedures initiated.",
        "[5715597600] EMERGENCY - Medical Module: Multiple fatalities due to disease. All personnel advised to wear protective gear.",
        "[5715842400] EMERGENCY - Medical Module: Situation critical. Remaining personnel exhibiting symptoms. No cure or treatment available.",
        "[5715959400] EMERGENCY - Security Module: Outpost abandoned.",
        "[5715964800] EMERGENCY - Medical Module: Final log entry. Outpost abandoned. Mayday signal broadcasted. End of transmission."
        );
```

<details>
  <summary>Hint 💡</summary>
You could technically do this all in one large stream, but it is recommended to break down the problem into smaller problems.
You’re going to end up with 3 lists:
<ul>
<li>List&lt;Long&gt; timestamps</li>
<li>List&lt;String&gt datesAndTimes</li>
<li>List&lt;Long&gt timeDifferences</li>
</ul>

<br>

<ul>
<li>Step 2: Use the map()-method in combination with the substring() method to extract the UNIX-timestamp from within the squared brackets.</li>
<li>Step 2: Use map() with Long.parseLong() and the completed convertUnixTimestamp(unixTimestamp)-method from above to print the dates and times to the console to get an overview of the general timeline.</li>
<li>Step 3: Make sure to convert to Duration-objects first by mapping accordingly.</li>
<li>Step 3: You can calculate durations with the Duration.between(time1, time2) method. However, make sure you're working with the Instant.ofEpochSecond() method.</li>
<li>Step 3: Use AtomicInteger to align log history with current timeDifference-entry.</li>
</ul>

</details>