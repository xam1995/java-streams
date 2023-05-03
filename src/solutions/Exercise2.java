package solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void main(String[] args) {
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

        List<String> result = companyNames.stream()
                .sorted()
                .distinct()
                .limit(10)
                .toList();

        System.out.println(result);
    }
}
