//https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true

import java.io.*;
import java.util.*;

public class JavaStringsIntroduction {
public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum = A.length() + B.length(); // verificar o length da sring
        String lex = "";
        if(A.compareTo(B)>0){lex = "Yes";}else{lex = "No";} // Compara alfabeticamente se A é maior que B
        // Pega o primeiro indece até o segundo, e tranforma em maiuscula
        // Concatena com o restante da string apartir do indece 1(Ou 2 caracter)
        String capA = A.substring(0,1).toUpperCase() + A.substring(1); 
        String capB = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(sum);
        System.out.println(lex);
        System.out.println(capA +" "+ capB);
    }
    
}