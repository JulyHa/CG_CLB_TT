package Buoi4_06022023;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;



public class Map_DemSoPTu {
    public static String countChar(String str) {
        HashMap<Character, Integer> counter = new HashMap<>();
        for (char character : str.toCharArray()) {
            if (counter.get(character) == null) counter.put(character, 0);
            counter.put(character, counter.get(character) + 1);
        }
        String result = "";
        Set<Character> characters = counter.keySet();
        for (char character : characters) {
            result += character + " xuất hiện " + counter.get(character) + "\n";
        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println(countChar("Xin chao cac ban") );

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập chuỗi đê");
//        String s = scanner.nextLine();
//        String[] arr = s.split("");
//        Map<String,Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            if(!map.containsKey(arr[i])) {
//                map.put(arr[i],1);
//            } else {
//                map.put(arr[i], map.get(arr[i])+1);
//            }
//        }
////        Set<String> set = map.keySet();
////        String[] xxx = set.toArray(new String[0]);
////        for (int i = 0; i < map.size(); i++) {
////            System.out.println(xxx[i]+" xuan hien "+ map.get(xxx[i]) + " lan");
////        }
//
//        for(String key : map.keySet()){
//            System.out.println(key + " xuất hiện " + map.get(key));
//        }
    }
}
