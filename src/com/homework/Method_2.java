package com.homework;

import java.util.ArrayList;
import java.util.List;

public class Method_2 {
    /*
     * Viết chương trình tìm tất cả các số chia hết cho 7 nhưng không phải bội số của 5,
     * nằm trong đoạn 10 và 200 (tính cả 10 và 200). Các số thu được sẽ được in thành chuỗi trên một dòng,
     * cách nhau bằng dấu phẩy
     */

    public static void main(String[] args) {
        System.out.println(display());
    }

    public static List<Integer> checkNum(){
        List<Integer> list = new ArrayList<>();
        for(int i = 10; i<=200; i++){
            if(i%7==0 && i%5!=0){
                list.add(i);
            }
        }
        return list;
    }
    public static String display(){
        String str = new String(checkNum().toString());
        String str2= str.replace("["," ");
        String str3 = str2.replace("]"," ");
        return str3;
    }

}