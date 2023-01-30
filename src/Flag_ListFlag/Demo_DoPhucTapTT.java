package Flag_ListFlag;

import java.util.ArrayList;
import java.util.List;

public class Demo_DoPhucTapTT {
    public void VD1(int n, int x){
        int s = 1, p = 1;
        for (int i=1;i<=n;i++) {
            p = p * x / i;
            s = s + p;
        }
    }
    public void VD2(int n){
        for (int i= 1;i<=n;i++) {
            for (int j = 1; j <= n; j++) {
                // câu lệnh
            }
        }
    }
    public void VD3(int n, int m){
        for (int i= 1;i<=n;i++) {
            //lệnh1
        }
        for (int j= 1;j<=m;j++) {
            //lệnh 2
        }
    }
    public void VD4(int n, int m){
        for (int i= 1;i<=n;i++) {
            for (int u= 1;u<=m;u++) {
                //lệnh
            }
            for (int v= 1;v<=n;v++) {
                //lệnh
            }
        }
    }
    public void bubble_sort(List<Integer> arr){
        int n = arr.size();
        for(int i=0; i<n-1; i++) // {1}
        {
            for(int j = 0; j < n-i-1; i++)// {2}
            {
                if(arr.get(j) > arr.get(j+1)) // {3}
                {
                    int temp = arr.get(j); // {4}
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
    }
}
