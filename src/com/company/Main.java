package com.company;

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Input the String: ");
        String str = Sc.nextLine();
        String str2 = str.toLowerCase();
        char arr[] = str2.toCharArray();
        String resultSting = "";
        int count = 0;
        for(int i = 0; i < arr.length-1; i++)
        {
            if(arr[i] == '\0'){
                continue;
            }
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    arr[j] = '\0';
                }
            }
            if(count > 0){
                resultSting = resultSting + arr[i];
            }
            count = 0;
        }

        System.out.println(resultSting);
    }
}
