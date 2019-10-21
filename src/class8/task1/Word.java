package class8.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Word {

    private List<String> words;

    public Word() {
        try {
            words = Files.readAllLines(Paths.get("D:\\project\\java\\Programming-system\\src\\class8\\task1\\words.txt"));
            for (int i = 0; i < words.size(); i++) {
                words.set(i, words.get(i).toLowerCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String wordWithMostOccurrencesOf(char c) {
        if (words.isEmpty()) {
            return "";
        }

        Map<String, Integer> occurrences = new HashMap<>();
        for (String word: words) {
            if (!occurrences.containsKey(word)){
                occurrences.put(word, 1);
            } else {
                System.out.println(occurrences.get(word));
                occurrences.put(word, occurrences.get(word)+1);
            }
        }

        int max = 0;
        String wordWithMostOccurrences = "";
        for (String key: occurrences.keySet()) {
            if (max < occurrences.get(key)) {
                wordWithMostOccurrences = key;
                max = occurrences.get(key);
            }
        }
        System.out.println(occurrences);
        return wordWithMostOccurrences;
    }

    public String longestWordStartingWith(char c) {
        if (words.isEmpty()) {
            return "";
        }

        String word = "";
        for (String testWord: words) {
            if (word.length() < testWord.length() && testWord.startsWith("c")) {
                word = testWord;
            }
        }
        return word;
    }

    public static void main(String[] args) {
        Word word = new Word();
        System.out.println(word.longestWordStartingWith('a'));
        System.out.println(word.wordWithMostOccurrencesOf('a'));
    }
}
