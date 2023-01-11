public class chia_het_2 {
    /*
     * Viết chương trình tìm tất cả các số chia hết cho 7 nhưng không phải bội số của 5,
     * nằm trong đoạn 10 và 200 (tính cả 10 và 200). Các số thu được sẽ được in thành chuỗi trên một dòng,
     * cách nhau bằng dấu phẩy
     */

    public static void main(String[] args) {
        checkNum();
    }

    public static void checkNum(){
        for(int i = 10; i<=200; i++){
            if(i%7==0 && i%5!=0){
                System.out.print(i+",");
            }
        }
    }
}
