package HW1;

import javax.jnlp.ClipboardService;
import java.util.ArrayList;
import java.util.List;

public class Method_3 {
    public static void main(String[] args) {
        display();
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
    public static void display(){
        String str = checkNum().toString();
        System.out.println(str.substring(1,str.length()-1));
    }
}
