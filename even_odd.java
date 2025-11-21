package assignment;

import java.util.Scanner;
//Define a program to find out whether a given number is even or odd.
public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int no = sc.nextInt();
        System.out.print("Enter no is even number :"+eve_odd(no));}
    static boolean eve_odd(int n) {
        return (n % 2 == 0);
    }
}
