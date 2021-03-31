package find_longest_substring;

import java.io.*;

public class LongestSubstr {

//    public static void main(String[] args) throws IOException {
    public static void main(String str) throws IOException {
        System.setIn(new ByteArrayInputStream(str.getBytes()));
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String line, compLine, min, max;
        while ((line = in.readLine()) != null) {
            compLine = in.readLine();
            if (line.length() > compLine.length() ) {
                max = line;
                min = compLine;
            } else {
                max = compLine;
                min = line;
            }
            int minLength = min.length();
            int maxS = minLength;
            boolean f = true;
            while (maxS > 0 && f) {
                int diff = minLength - maxS;
                for (int i = 0; i <= diff; i++) {
                    if (max.contains(min.substring(i, i + maxS))) {
                        f = false;
                        maxS++;
                        break;
                    }
                }
                maxS--;
            }
            System.out.println(maxS);
        }
        out.close();
    }
}
