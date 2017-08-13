import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        int negativos=0;
        for(int tam=1;tam<=n;tam++){
            for(int i=0;i<n-tam+1;i++) {
                int soma = 0;
                for(int j = i; j<i+tam; j++) {
                    soma+=a[j];
                }
                negativos+=soma<0?1:0;
            }
        }
        System.out.println(negativos);
    }
}