package Session1;

import java.util.Scanner;

public class Multiplication_table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
//        int size = Integer.parseInt(args[0]);
        for (int i = 1; i <= size; i++) {
            System.out.print("\n");
            for (int j = 1; j <= size; j++) {
                System.out.print(i*j+" ");
            }
        }
    }
}
