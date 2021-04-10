package practice.awkward_interview;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AwkwardInterview {
//    public static void main(String[] args) throws IOException {
    public static void main(String str) throws IOException {
        System.setIn(new ByteArrayInputStream(str.getBytes()));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String word, line;
        while ((line = br.readLine()) != null) {
            st = new StringTokenizer(line);
            word = st.nextToken();
            boolean matched = false;
            final int wLen = word.length();
            for (int i = 0; i < wLen; ++i) {
                final String wordBeg = word.substring(0, i);
                final String wordEnding = word.substring(i);
                if(wordBeg.endsWith(wordEnding)) {
                    System.out.println(word.substring(0, i));
                    matched = true;
                }

            }
            if (!matched) {
                System.out.println(word);
            }
        }
        br.close();
    }
}
