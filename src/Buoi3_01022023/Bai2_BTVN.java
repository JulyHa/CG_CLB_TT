package Buoi3_01022023;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai2_BTVN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, num;

        System.out.print("Nhập số phần tử của mảng: ");
        number = input.nextInt();

        Map<Integer, Integer> maps = new HashMap<>();
        // key : giá trị của ptu
        // value: số lần xuất hiện
        for(int i=0; i<number; i++){
            num = input.nextInt();

            if(maps.containsKey(num)){
                maps.put(num, maps.get(num)+1);
            }
            else {
                maps.put(num, 1);
            }
        }
        for(Integer i : maps.keySet()){
          for(int j = 0; j< maps.get(i); j++){
              System.out.println(i + " ");
          }
        }
    }
}
