package ChuaBTVN_Buoi1;

//Bài 4: Thống kê số lần xuất hiện của mỗi phần tử trong 1 chuỗi nhập vào

import java.util.Arrays;

public class Bai4 {
    public static void main(String[] args) {
        String s = "raising the bar!!!!";
        int[] count = new int[256];

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                count[s.charAt(i)]++;
            }
        }
        for(int i = 0; i < 256; i++){
            if(count[i] > 0){
                System.out.println((char) i + " xuất hiện " + count[i] + " lần!");
            }
        }
    }
}
