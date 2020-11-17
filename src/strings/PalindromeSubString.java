package strings;

import java.util.Scanner;

public class PalindromeSubString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String s = scanner.next();
        solution(s);
    }

    private static void solution(String s) {
      for(int i=0;i<=s.length()-1;i++){
          for(int j=i+1;j<=s.length();j++){
             String ss = s.substring( i,j );
              if(isPalindrome(ss) == true) {
                  System.out.println(ss);
              }
          }
      }

    }

    private static boolean isPalindrome(String s) {
        int i=0; //start point
        int j = s.length()-1; //end point
        while(i <= j){
            char ch1 = s.charAt( i );
            char ch2 = s.charAt( j );
            if(ch1!=ch2){
                return false;
            } else{
                i++;
                j--;
            }
        }
        return true;
    }


}

/**
Input
abcc
Output
a
b
c
cc
c
 */