package Buoi2;

import java.util.Scanner;

public class DemGiay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        String shoes;
        int[] shoesLeft = new int[100];
        int[] shoesRight = new int[100];
        n = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i<n; i++){
            shoes = scanner.nextLine();
            int size = Integer.parseInt(shoes.substring(1, shoes.length()));
            if(shoes.charAt(0) == 'L'){
                shoesLeft[size]++;
            }
            else{
                shoesRight[size]++;
            }
        }
        int count = 0;
        for(int i =0; i < 100; i++){
           count += Math.min(shoesLeft[i], shoesRight[i]);
        }
        System.out.println(count);

    }
}
