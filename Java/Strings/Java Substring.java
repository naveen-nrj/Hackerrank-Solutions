import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        int start = in.nextInt();
        int end = in.nextInt(); 
        for(int k=start;k<end;k++)
        {System.out.print(S.charAt(k));}
    }
}

