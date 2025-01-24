
//https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class JavaLoops {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Problema de tabuada... ");
        System.out.print("Digite um numero: ");
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if(N >1){
            for(int n = 1; n<11; n++){
                System.out.println(N + " x " + n + " = " + n * N);
            }
        }

        bufferedReader.close();
    }
}
