package practice.good_or_bad_groups;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class WordGroup {
//    public static void main(String[] args) throws IOException {
    public static void main(String str) throws IOException {
        System.setIn(new ByteArrayInputStream(str.getBytes()));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> words = new ArrayList<>();
        int groupCount = Integer.parseInt(br.readLine());
        String line;
        while (!(line = br.readLine()).equals("0")) {
            if (groupCount == 0) {
                groupCount = Integer.parseInt(line);
            } else {
                words.add(line);
                --groupCount;
                if (groupCount == 0) {
                    print(isGroupGood(words));
                    words.clear();
                }
            }
        }

    }

    static boolean isGroupGood(List<String> group) {
        group = group.stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < group.size() - 1; i++) {
            if (group.get(i + 1).startsWith(group.get(i))) {
                return false;
            }
        }
        return true;
    }

    static void print(boolean isGood) {
        if (isGood) {
            System.out.println("Conjunto Bom");
        } else {
            System.out.println("Conjunto Ruim");
        }
    }
}
