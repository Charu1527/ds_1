package com.charu;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A= input.nextInt();
        int B= input.nextInt();
        int C= input.nextInt();

//        int max=A;
//        if(max<B){
//            max=B;
//        }
//        if(max<C){
//            max=C;
//        }
//        System.out.println(max);
        int max=0;
        if(A>B){
            max=A;
        }else{ max=B;}
        if(C>max){
            max=C;
        }
        System.out.println(max);
    }
}
