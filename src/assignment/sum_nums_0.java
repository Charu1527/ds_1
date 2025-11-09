package assignment;

import java.util.Scanner;

public class sum_nums_0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while(true) {
            int n = in.nextInt();
            if (n == 0) {
                break;
            } else {
                sum += n;
            }
        }System.out.println(sum);
    }
}
