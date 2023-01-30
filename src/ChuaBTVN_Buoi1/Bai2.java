package ChuaBTVN_Buoi1;

//Bài 2: Cho 1 dãy chưa sắp xếp. Sắp xếp lại mảng và hiển thị vị trí ban đầu của mỗi phần tử.
//        VD: 3 6 2 7
//        => 2 0 1 3


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai2 {

    private static void swap(List<Integer> arr, int i, int j){
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        List<Integer> arrayValue = new ArrayList<>();
        List<Integer> arrayIndex = new ArrayList<>();

        System.out.print("Nhập số phần tử của mảng: ");
        number = input.nextInt();
        for(int i=0; i<number; i++){
            arrayValue.add(input.nextInt());
            arrayIndex.add(i);
        }

        // sắp xếp
        for(int i=0; i<number-1; i++){
            for(int j=i+1; j<number; j++){
                if(arrayValue.get(i) > arrayValue.get(j)){
                    swap(arrayValue, i, j); // đổi chỗ 2 phần tử
                    swap(arrayIndex, i, j); // đồng thời đổi vị trí tương ứng
                }
            }
        }
        System.out.print("Mảng sau khi sắp xếp: ");
        for(Integer value : arrayValue){
            System.out.print(value + " ");
        }
        System.out.print("\nVị trí sau khi sắp xếp: ");
        for(Integer index : arrayIndex){
            System.out.print(index + " ");
        }
    }
}
