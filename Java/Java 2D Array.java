import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int maiorSoma = Integer.MIN_VALUE;
        for (int i = 0; i<4; i++) {
            for ( int j = 0; j<4; j++) {
                int sominha = 0;
                for (int k = i; k < i+3; k++) {
                    for (int l = j; l < j+3; l++) {
                        if(!(l==j+1&&k!=i+1)) {
                            sominha+=arr[l][k];
                        }
                    }
                }
                maiorSoma = sominha>maiorSoma?sominha:maiorSoma;
            }
        }
        System.out.println(maiorSoma);
    }
}
