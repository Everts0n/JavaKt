package com.company;

import java.util.Arrays;

public class MainNomer3 {
    public static void main(String[] args) {
        //Задание номер 3
        int result = 0;
        int[] massive = new int[]{188, 181, 156, 162, 173, 152, 169, 193, 185, 183};

        for(int i = 0;i < massive.length; i++){
            result = result+massive[i];
        }
        result = result/massive.length;
        System.out.print(result);

//        System.out.print(Arrays.toString(result));
//        System.out.print(result);
    }
}
