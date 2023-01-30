package ChuaBTVN_Buoi1;

// Bài tập trên codeforces:
// https://codeforces.com/problemset/problem/1703/B

import java.util.Scanner;

public class Bai6 {
    private static int scoring(String s, int num){
        int score = 0;
        int[] count = new int[26];

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                count[s.charAt(i)-65]++;
            }
        }
        for(int i = 0; i < 26; i++){
            if(count[i] > 0){
               score += count[i] + 1;
            }
        }
        return score;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        for(int i=0; i<test; i++){
            int num = input.nextInt();
            String s = input.next();
            System.out.println(scoring(s, num));
        }

    }
}
