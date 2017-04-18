import java.math.BigInteger;
import java.util.Scanner;

public class WB_6_1_Factorial {
    public static void main(String[] args) {
        System.out.println("== Вычисление факториала ==");
        System.out.print("Введите число N: ");
        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
            System.out.println("Надо ввести целое число. " +
                    "Повторите ввод");
            in.next();
        }
        int N = in.nextInt();
        // 1*2*3*4...*N = N!
        // 0! = 1
        BigInteger res = BigInteger.valueOf(1);
        for (int i = 1; i <= N; i++) {
            res = res.multiply(
                    BigInteger.valueOf(i));
        }
        System.out.println(N + "! = " + res);
    }
}
