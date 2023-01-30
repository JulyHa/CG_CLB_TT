package Buoi2;

import java.util.ArrayList;
import java.util.Scanner;

public class SapXep {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> value = new ArrayList<>();
        ArrayList<Integer> index = new ArrayList<>();

        int n = s.nextInt();
        for(int i =0; i<n; i++){
            value.add(s.nextInt());
            index.add(i);
        }

        for(int i=0 ;i<n-1; i++){
            for(int j = i+1; j < n; j++ ){
                if(value.get(i) > value.get(j)){
                    int temp = value.get(i);
                    value.set(i, value.get(j));
                    value.set(j, temp);

                    temp = index.get(i);
                    index.set(i, index.get(j));
                    index.set(j, temp);
                }
            }
        }

        for(int i = 0; i<n; i++){
            System.out.println(index.get(i));
        }

    }
}
