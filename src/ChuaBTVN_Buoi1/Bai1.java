package ChuaBTVN_Buoi1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Nhập vào 1 số nguyên n là số lượng phần tử trong dãy.
// Tiếp theo lần lượt là các phần tử của 1 dãy.
// Xuất mảng ra màn hình. Nếu phần tử đấy xuất hiện từ lần thứ 2 trở đi thì hiển thị "Đã có trong mảng".

public class Bai1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        boolean flag = false;
        List<Integer> arrayList = new ArrayList<>();

        System.out.print("Nhập số phần tử của mảng: ");
        number = input.nextInt();

        for(int i = 0; i < number; i++){
            int num = input.nextInt();
            for(int j = 0; j < i; j++){
                if(num == arrayList.get(j)){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                arrayList.add(num);
            }
            else{
                System.out.println("Đã tồn tại");
                flag = false;
            }

        }
        System.out.print("Các phần tử trong dãy: ");
        for (Integer integer : arrayList) {
            System.out.print(integer + " ");
        }
    }
}
