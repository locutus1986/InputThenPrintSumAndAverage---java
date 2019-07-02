package com.timbuchalka;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);

        int numberOfInterations = 0;
        int sum = 0;
        long average = 0;

        while(true){
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                sum += number;

            }else{
                break;
            }
            numberOfInterations++;
        }
        average = Math.round((double)sum/ (double)numberOfInterations);
        System.out.println("SUM = " + sum + " AVG = " + average);

        scanner.close();

    }
}
