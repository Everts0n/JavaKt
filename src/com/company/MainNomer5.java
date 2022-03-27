package com.company;

public class MainNomer5 {
    public static void main(String[] args){
        //Задание номер 5

        int[] massive = new int[]{188, 181, 156, 162, 173, 152, 169, 193, 185, 183};
        int max = 0;
        int id = 0;

        for(int i = 0; i < massive.length; i++){
            if(massive[i] > max){
                max = massive[i];
                id = i;
            }
        }
        System.out.println("Max value is: " + max);
        System.out.print("Index of max value is: " + id);



//        max = massive[0];
//        for(int i = 0; i < massive.length; i++){
//            if(max<massive[i]){
//                max = massive[i];
//            }
//        }
    }
}
