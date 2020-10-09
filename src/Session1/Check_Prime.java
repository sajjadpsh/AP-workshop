package Session1;

import java.util.Scanner;

public class Check_Prime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
//        int firstNum = Integer.parseInt(args[0]);
//        int secondNum = Integer.parseInt(args[1]);
        int i;
        if (firstNum > secondNum)
            i = firstNum;
        else
            i = firstNum;

        while ((firstNum % i != 0) || (secondNum % i != 0)) {
            i--;
        }
        System.out.println(i);
        if (i != 1)
            System.out.println("aval nistand");
        else
            System.out.println("aval hastand");
    }
}
