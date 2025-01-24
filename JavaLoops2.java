//https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true

import java.util.*;
import java.io.*;

class JavaLoops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite quantas PG terá na consulta: ");
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            System.out.print("Primeiro termo: ");
            int a =  in.nextInt();
            System.out.print("Termo que seŕa exponencial: ");
            int b = in.nextInt();
            System.out.print("Quantidade de elementos: ");
            int n = in.nextInt();
            if(a >= 0 && a <= 500  && b >= 0 && b <= 500 &&
            n > 0 && n < 16){
                int currentValue = a + b;
                System.out.print(currentValue);
                for (int j = 1; j < n; j++) {
                    currentValue = currentValue + ((int)Math.pow(2, j)) * b;
                    System.out.print(" " + currentValue);
                }
            System.out.println();
            }
        }
        in.close();
    }
}
