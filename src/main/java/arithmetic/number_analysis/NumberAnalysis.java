package arithmetic.number_analysis;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Scanner;

public class NumberAnalysis {
//    public static void main(String[] args) throws IOException {
    public static void main(String str) throws IOException {
        System.setIn(new ByteArrayInputStream(str.getBytes()));
        Scanner leitor = new Scanner(System.in);

        //declare suas variaveis corretamente
        int even = 0;
        int odd = 0;
        int negative = 0;
        int positive = 0;
        int currentInput = 0;

        //continue a solução
        for (int i = 0; i < 5; ++i) {
            currentInput = leitor.nextInt();
            if (currentInput % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            if (currentInput > 0) {
                positive++;
            } else if (currentInput < 0) {
                negative++;
            }
        }
        //insira suas variaveis corretamente
        System.out.println(even + " valor(es) par(es)");
        System.out.println(odd + " valor(es) impar(es)");
        System.out.println(positive + " valor(es) positivo(s)");
        System.out.println(negative + " valor(es) negativo(s)");
    }
}
