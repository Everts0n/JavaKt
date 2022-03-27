package com.company;

import java.util.Scanner;

public class MainNomer6 {
    public static void main(String[] args){
        //Задание номер 6

        System.out.println("Enter the name of month (January-December)");
        System.out.print(": ");
        String month;
        Scanner scn = new Scanner(System.in);
        month = scn.nextLine();

        switch (month){
            case "January":
            case "january":
                System.out.println("1 month");
                break;
            case "February":
            case "february":
                System.out.println("2 month");
                break;
            case "March":
            case "march":
                System.out.println("3 month");
                break;
            case "April":
            case "april":
                System.out.println("4 month");
                break;
            case "May":
            case "may":
                System.out.println("5 month");
                break;
            case "June":
            case "june":
                System.out.println("6 month");
                break;
            case "July":
            case "july":
                System.out.println("7 month");
                break;
            case "August":
            case "august":
                System.out.println("8 month");
                break;
            case "September":
            case "september":
                System.out.println("9 month");
                break;
            case "October":
            case "october":
                System.out.println("10 month");
                break;
            case "November":
            case "november":
                System.out.println("11 month");
                break;
            case "December":
            case "december":
                System.out.println("12 month");
                break;
            default:
                System.out.println("unknown month");
        }

    }
}
