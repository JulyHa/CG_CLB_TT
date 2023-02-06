package ChuaBTVN_Buoi1;

//Bài 3: Sắp xếp lại mảng không dùng hàm có sẵn, không sắp xếp mảng
// (chỉ xử lý cho bài có các phần tử là dương)

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, num;
        // Đếm số lần xuất hiện của x trong mảng
        // In từng đó lần số lần xuất hiện của x
        // VD: 1 5 2 6 8 2 1 1
        // => 1: 3
        // 2: 2
        // 5:1
//        6:1
//                8:1
//        => 1 1 1 2 2 5 6 8

        System.out.print("Nhập số phần tử của mảng: ");
        number = input.nextInt();

        int[] arr = new int[999999];
        int max = 0;
        for(int i=0; i<number; i++){
            num = input.nextInt();
            arr[num]++;
            if(num > max){
                max = num;
            }
        }
        for(int i=0; i<=max; i++){
            for(int j=0; j<arr[i]; j++){
                System.out.print(i + " ");
            }
        }
    }
}
