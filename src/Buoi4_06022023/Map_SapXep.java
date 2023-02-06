package Buoi4_06022023;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_SapXep {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Map<Integer, Integer> map = new HashMap<>();  // key là gtri - value là số lần xuất hiện của gtri đó

        for(int i =0; i<n; i++){
            int x = s.nextInt();
            if(!map.containsKey(x)){ // kiểm tra xem key có gtri x đã có trong map chưa
                map.put(x, 1); // chưa có thì put cặp (x, 1) vào map với ý nghĩa x xuất hiện 1 lần
            }else {
                map.put(x, map.get(x) + 1);  // nếu đã có thì put(x, map.get(x) + 1) với ý nghĩa số lần xuất hiện của x tăng lên 1 đơn vị

            }
        }
        for(int x : map.keySet()){ // keySet => Trả về 1 set chứa gtri của key
           for(int i = 0; i<map.get(x); i++){
               System.out.print(x); // in ra số số lần xuất hiện của x.
           }
        }
    }
}
