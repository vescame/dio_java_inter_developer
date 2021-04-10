package arithmetic.dividers;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dividers {
//    public static void main(String[] args) throws IOException {
    public static void main(String test) throws IOException {
        System.setIn(new ByteArrayInputStream(test.getBytes()));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // the expected number is a divisor of A
        int A = Integer.parseInt(st.nextToken());
        // the expected number is not a divisor of B
        int B = Integer.parseInt(st.nextToken());
        // the expected number is a multiple of C
        int C = Integer.parseInt(st.nextToken());
        // the expected number is not a multiple of D
        int D = Integer.parseInt(st.nextToken());
        br.close();

        int smallestCandidate = -1;

        // divisor and multiple are mirrored operations
        // so when you want BOTH, then the remainder must be 0
        if(C % A == 0) {
            double sqrt = Math.sqrt(C);
//            da no mesmo usar como double ou int
//            double sqrt = (int) Math.sqrt(C);
            for (int i = 1; i <= 109; ++i) {
                if ((i % A == 0) && (i % B != 0) && (D % i != 0)) {
                    smallestCandidate = i;
                    break;
                }
                if ((sqrt % A == 0) && (sqrt % B != 0) && (D % sqrt != 0)) {
                    smallestCandidate = i;
                }
            }
        }
        System.out.println(smallestCandidate);
    }
}

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int A = Integer.parseInt(st.nextToken());
//        int B = Integer.parseInt(st.nextToken());
//        int C = Integer.parseInt(st.nextToken());
//        int D = Integer.parseInt(st.nextToken());
//        br.close();
//
//        int smallestCandidate = -1;
//
//        if(C % A == 0) {
//            int sqrt = (int) Math.sqrt(C);
//            for (int i = 1; i <= sqrt; ++i) {
//                if ((i % A == 0) && (i % B != 0) && (D % i != 0)) {
//                    smallestCandidate = i;
//                    break;
//                }
//                if (((C / i) % A == 0) && ((C / i) % B != 0) && (D % (C / i) != 0)) {
//                    smallestCandidate = C / i;
//                }
//            }
//        }
//        System.out.println(smallestCandidate);
//    }
