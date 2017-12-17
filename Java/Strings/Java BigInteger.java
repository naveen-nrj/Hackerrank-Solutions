import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger a = new BigInteger(s.next());
		BigInteger b = new BigInteger(s.next());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
