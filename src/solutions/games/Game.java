package solutions.games;

public class Game {
    private final String name;
    private final double price;
    private final String genre;

    public Game(String name, double price, String genre) {
        this.name = name;
        this.price = price;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return name;
    }
}
