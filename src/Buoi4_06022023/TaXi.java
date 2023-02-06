package Buoi4_06022023;

import java.util.*;
import static java.lang.Math.min;
public class TaXi {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int team4 = 0, a; // số lần xuất hiện của team 4 người
        int team3 = 0; // số lần xuất hiện của team 3 người
        int team2 = 0;// số lần xuất hiện của team 2 người
        int team1 = 0;// số lần xuất hiện của team 1 người
        for(int i=0; i<n; i++){
            a = s.nextInt();
            if (a == 1) team1 ++;
            else if (a == 2) team2 ++;
            else if (a == 3) team3 ++;
            else team4++;
        }
        int res =0; // kết quả số xe taxi cần thuê
        res = team4; // số lần xuất hiện của team 4 người = số xe ít nhất cần có.
        res += team3;
        team1 = team1-min(team1, team3); // số lần xuất hiện còn lại của team1 sau khi đã ghép với team 3,
        res += team2/2;
        team2 = team2 % 2; //số lần xuất hiện còn lại của team2
        if(team2 > 0){ // team = 1 ; team1 = 2 3 4 => 0 1 2
            res += 1;
            if(team1 > 1) team1 -= 2;
            else if(team1 > 0)team1 --;
        }
        res += (team1%4 == 0) ? (team1/4) : (team1/4+1); // 4 team1 ghép được 1 xe=> team1/4 sẽ ra số xe
        System.out.println(res);
    }
}
