//https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true

import java.io.*;
import java.util.*;

public class JavaEndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while(sc.hasNext()){
            String text = sc.nextLine();
            System.out.printf("%d %s%n", count, text.toString());
            count++;
        }
    }
}

