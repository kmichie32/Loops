package com.kevinmichie;

import java.util.Scanner;

public class Solution {

    public void mathPower2(int a, int b, int n) {
        int valueholder = 0;
        int powerHolder = 1;

        for (int i = 0; i < n; i++) {
            if (a == 0) {
                valueholder = valueholder + a + (powerHolder * b);
                System.out.print(valueholder + " ");
                powerHolder *= 2;
            } else {
                if(i ==0){
                    valueholder =  a + (powerHolder * b);
                    System.out.print(valueholder + " ");
                    powerHolder *= 2;
                } else{
                    valueholder += (powerHolder *b);
                    System.out.print(valueholder + " ");
                    powerHolder *=2;
                }

            }
        }
    }

    public static void main(String[] args) {
	    Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int numberOfTests = scanner.nextInt();
        int[] arr = new int[numberOfTests*3];

        for(int i = 0; i < arr.length; i++){
            arr[i]= scanner.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            int a = arr[i];
            int b = arr[i+1];
            int n = arr[i+2];

           solution.mathPower2(a,b,n);
            System.out.println();
            i+=2;
        }
    }
}
