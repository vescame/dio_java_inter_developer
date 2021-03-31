package shorten_blog_posts;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TextAbrev {
//    public static void main(String[] args) throws IOException {
    public static void main(String str) throws IOException {
        System.setIn(new ByteArrayInputStream(str.getBytes()));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        StringTokenizer st;
        while (!(line = br.readLine()).equals(".")) {
            st = new StringTokenizer(line);
            if (st.hasMoreTokens()) {
                List<String> words;
                if ((words = collectWords(st)) != null) {
                    Map<String, String> tokenizedAlphabet = getAlphabet();

                    chooseBetterWords(words, tokenizedAlphabet);

                    print(tokenizedAlphabet, line);
                } else {
                    break;
                }
            }
        }
    }

    static List<String> collectWords(StringTokenizer st) {
        List<String> words = new LinkedList<>();
        while (st.hasMoreTokens()) {
            String next = st.nextToken();
            if ((next.isEmpty()) || (next.equals("."))) {
                return null;
            } else {
                words.add(next);
            }
        }

        return words;
    }

    private static void print(Map<String, String> tokenizedAlphabet, String line) {
        List<String> sortedWords = tokenizedAlphabet.keySet()
                .stream()
                .sorted()
                .filter(w -> tokenizedAlphabet.get(w) != null)
                .map(tokenizedAlphabet::get)
                .collect(Collectors.toList());

        for (String w : sortedWords) {
            line = line.replaceAll("\\b" + w + "\\b", " " + w.charAt(0) + ".");
        }

        System.out.println(line.trim());
        System.out.println(sortedWords.stream().distinct().count());
        sortedWords.stream()
                .sorted(Comparator.comparing(w -> w.charAt(0)))
                .distinct()
                .forEach(w -> System.out.println(w.charAt(0) + ". = " + w));
    }

    static void chooseBetterWords(List<String> words, Map<String, String> alphbt) {
        Map<String, Integer> groupWords = new TreeMap<>();

        words.stream()
                .sorted()
                .forEach(w -> {
                    Integer cWordCount = groupWords.get(w);
                    groupWords.put(w, cWordCount == null ? 1 : cWordCount + 1);
                });

        words.stream()
                .filter(w -> w.length() > 2)
                .map(String::toLowerCase)
                .forEach(nWord -> {
                    final String fChar = String.valueOf(nWord.charAt(0));
                    final String cWord = alphbt.get(fChar);
                    if (cWord == null) {
                        alphbt.put(fChar, nWord);
                    } else {
                        int nWordLenPrev = groupWords.get(nWord) * (nWord.length() - 2);
                        int cWordLenPrev = groupWords.get(cWord) * (cWord.length() - 2);
                        if (nWordLenPrev > cWordLenPrev) {
                            alphbt.put(fChar, nWord);
                        } else {
                            alphbt.put(fChar, cWord);
                        }
                    }
                });
    }

    static Map<String, String> getAlphabet() {
        Map<String, String> alphabet = new TreeMap<>();
        IntStream.rangeClosed('a', 'z').forEach(c -> alphabet.put(String.valueOf((char) c), null));
        return alphabet;
    }
}
