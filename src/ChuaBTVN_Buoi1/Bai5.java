package ChuaBTVN_Buoi1;

//Bài 5: Cho n chiếc giày, in ra tổng số đôi có thể ghép được biết 2 chiếc giày ghép thành 1 đôi phải thỏa mãn:
//        - Hai chiếc giày phải cùng cỡ
//        - Hai chiếc giày phải khác bên
//        Ví dụ: R12 và L12 là 1 đôi
//        Đầu vào:
//        - Dòng đầu tiên là số chiếc giày n
//        - n dòng tiếp là mỗi chiếc giày có định dạng (R-x hoặc L-x).
//        Trong đó R là bên phải, L là bên trái, x là cỡ
//        Đầu ra:
//        - Một dòng duy nhất là số đôi có thể ghép


import java.util.Scanner;

public class Bai5 {
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
