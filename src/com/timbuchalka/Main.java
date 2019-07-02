package com.timbuchalka;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);

        int numberOfInterations = 1;
        int sum = 0;
        int average = 0;

        while(true){
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                sum += number;
                average = sum/numberOfInterations;
            }else{
                break;
            }
            numberOfInterations++;
        }

        System.out.println("SUM = " + sum + " AVG = " + average);

        scanner.close();

    }
}
