package arithmetic.count_repeated_numbers;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;
import java.util.SortedMap;
import java.util.TreeMap;

public class CountRepeatedNumbers {
//    public static void main(String[] args) throws IOException {
    public static void main(String str) throws IOException {
        System.setIn(new ByteArrayInputStream(str.getBytes()));
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        ArrayList<Integer> collected = new ArrayList<Integer>();

        int count = sc.nextInt();
        while(count > 0) {
            collected.add(sc.nextInt());
            count--;
        }

        SortedMap<Integer, Integer> groupCollected = new TreeMap<>();
        collected.forEach(id -> groupCollected.compute(id, (k, v) -> (v == null ? 1 : groupCollected.get(k) + 1)));

        groupCollected.forEach((k, v) -> System.out.printf("%d aparece %d vez(es)\n", k, v));

        sc.close();
    }
}
