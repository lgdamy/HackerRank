import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
   public static void main(String[] args){
      String regex = "<(?<tag>.+?)>(?<parse>[^<|>]+)</\\k<tag>>";
       
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
          boolean interno = false;
          String line = in.nextLine();
          Pattern pt = Pattern.compile(regex);
          Matcher mt = pt.matcher(line);
          while(mt.find()) {
              System.out.println(mt.group("parse"));
              interno = true;
          }
          if(!interno) {
              System.out.println("None");
          }
         testCases--;
      }
   }
}