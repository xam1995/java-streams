package solutions;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise6 {
    public static List<String> countries = List.of(
            "Albania", "Algeria", "Andorra", "Angola", "Argentina", "Armenia", "Australia",
            "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium",
            "Belize", "Benin", "Bhutan", "Bolivia", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burundi",
            "Cabo Verde", "Cambodia", "Cameroon", "Canada", "Chad", "Chile", "China", "Colombia", "Comoros",
            "Costa Rica", "Croatia", "Cuba", "Cyprus", "Denmark", "Djibouti", "Ecuador", "Egypt", "Eritrea",
            "Estonia", "Eswatini", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany",
            "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland",
            "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan",
            "Kenya", "Kiribati", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya",
            "Lithuania", "Luxembourg", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Mauritania",
            "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique",
            "Namibia", "Nauru", "Nepal", "Nicaragua", "Niger", "Nigeria", "Norway", "Oman", "Pakistan", "Palau", "Palestine",
            "Panama", "Paraguay", "Peru", "Poland", "Portugal", "Qatar", "Romania", "Russia", "Rwanda"
    );

    public static void main(String[] args) {
        // Creates a 'Map' of country name lengths with a corresponding list of countries
        Map<Integer, List<String>> wordLengthMap = countries.stream()
                .collect(Collectors.groupingBy(String::length, // same as: country -> country.length()
                        HashMap::new, // same as: () -> new HashMap<>()
                        Collectors.toList()));

        // Prints 'Map' to the console for debugging purposes only, comment out line below when you're done
        wordLengthMap.forEach((num, countries) -> System.out.println(num + ":" + countries));

        // Generates first output stream with number of characters of each country name converted to double, as the labelling machine requires mm values
        countries.stream()
                .map(String::length) // same as: ctr -> ctr.length()
                .mapToDouble(Double::valueOf)// same as: num -> Double.valueOf(num)
                .forEach(System.out::println); // same as: ctrLgthAsDbl -> System.out.println(ctrLgthAsDbl)

        // Generates second output stream with country names as list in all uppercase letters
        countries.stream()
                .map(String::toUpperCase) // same as: countryName -> countryName.toUpperCase()
                .filter(country -> country.length() < 10)
                .forEach(System.out::println); // same as: newCtryNme -> System.out.println(newCtryNme)

    }
}
