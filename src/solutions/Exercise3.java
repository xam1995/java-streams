package solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise3 {
    public static void main(String[] args) {
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

        Map<Integer, Long> wordLengthCount = commonWords.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
        //String::length is equal to s -> s.length() in this case

        wordLengthCount.forEach((length, count) -> System.out.println(length + ": " + count));
    }
}
