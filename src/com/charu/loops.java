package com.charu;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
//        print numbers from 1 to 5
//        for(int num=1;num<=5;num++){
//            System.out.println(num);
//        }
//         print no from 1 to n
        Scanner input = new Scanner(System.in);
        System.out.print("enter the value of n :" );
        int n=input.nextInt();
        for(int num=1;num<=n;num++){
            System.out.print( num + " ");
        }
        }
}
