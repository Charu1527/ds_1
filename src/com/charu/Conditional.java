package com.charu;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the salary:");
        double salary = input.nextDouble();
        if(salary>20000){
            salary+=2000;
        }else if(salary>10000 && salary<20000){
            salary+=1000;
        }else{ salary+=500;}
        System.out.println("salary with additional commission:"+salary);
    }
}
