package com.homework;

import java.util.ArrayList;
import java.util.List;

public class Method_4 {
    public static void main(String[] args) {
        System.out.println(display());
    }
    public static List<Integer> checkingNum(){
        List<Integer> list = new ArrayList<>();
        for(int i = 10; i<=200; i++){
            if(i%7==0 && i%5!=0){
                list.add(i);
            }
        }
        return list;
    }
    public static String display(){
        String str = checkingNum().toString();
        String s ="";
        for(int i = 1; i<str.length()-1;i++){
            s = s.concat(String.valueOf(str.charAt(i)));
        }
    return s;
    }
}
