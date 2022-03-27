package com.company;

import java.util.DoubleSummaryStatistics;

public class MainNomer2 {

    public static void main(String[] args) {
	// Задание номер 2

        int num;
        int count = 0;

//        while(count < 20){
//            count++;
//            num = (int) Math.round(Math.random() * 200);
//            if (num < 100) {
//                count
//            }else{
//                System.out.println(num);
//            }
//
//        }
        while(count < 10){
            num = (int) Math.round(Math.random() * 200);
            if(num >= 100){
                System.out.println(num);
                count++;
            }
        }
    }
}
