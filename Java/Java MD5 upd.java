import java.io.*;
import java.util.*;
import java.security.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
        byte[] inByte = str.getBytes();
        MessageDigest md;
        try{
        md = MessageDigest.getInstance("MD5");
        byte[] outByte = md.digest(inByte);
        for(byte b : outByte)
            System.out.printf("%02x",b);        
        } catch (Exception e){
            System.out.println("Exception: " + e);
        }
    }
}
