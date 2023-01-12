package com.homework;

import java.util.ArrayList;
import java.util.List;

public class Method_1 {
    //Viết chương trình tìm tất cả các số chia hết cho 7 nhưng không phải bội số của 5,
    // nằm trong đoạn 10 và 200 (tính cả 10 và 200). Các số thu được sẽ được in thành chuỗi trên một dòng,
    // cách nhau bằng dấu phẩy

    /*
    idea: Khởi tạo một mảng, xét đoạn 10-200, những ký tự chia hết cho 7 nhưng không là bội số của 5 được
    thêm vào mảng, sau đó in các giá trị có trong mảng

    */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); //tạo mảng có tên list
        for(int i = 10; i<=200; i++){ //duyệt vòng for trong đoạn 10 - 200
            if(i%7==0 && i%5!=0) //kiểm tra chia hết cho 7 và không chia hết cho 5
                list.add(i); //giá trị thỏa mãn được thêm vào list
        }
        System.out.print(list.get(0)); //in ra giá trị tại vị trí đầu tiên trong mảng
        for(int i = 1; i< list.size(); i++){ // duyệt vòng for kể từ vị trí thứ 2 của mảng
            System.out.print(","+list.get(i)); //in các giá trị kế tiếp và phân cách bằng dấu phẩy
        }
    }

}
