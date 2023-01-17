package org.training.exercise;

import java.util.Scanner;

public class FindingNumber {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int n = s.nextInt();
        int[] a = new int[n];
        inputArray(a,n);
        checkingNumber(a);
    }
    public static void inputArray(int a[], int n){
        for(int index = 0; index< a.length; index++){
            a[index] = s.nextInt();
        }
    }
    public static void checkingNumber(int a[]){
        for(int i = 0; i<a.length; i++){
            if(a[i]%10==0 || a[i]%10==3){
                System.out.print(a[i]+" ");
            }
        }
    }
//    public static void sortingNumber(int a[]){
//        int tem = a[0];
//        for (int i =0; i<a.length -1; i++){
//            for(int j = i+1; j<a.length; j++){
//                if(a[i]>a[j]){
//                    tem = a[i];
//                    a[i] = a[j];
//                    a[j] = tem;
//                }
//            }
//        }
//        for(int i =0; i <a.length; i++){
//            System.out.println(a[i]+ " ");
//        }
//    }
//    public static void display(){
//
//    }
}
