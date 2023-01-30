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
