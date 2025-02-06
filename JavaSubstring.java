
// https://www.hackerrank.com/challenges/java-substring/problem?isFullScreen=true

import java.util.Scanner;
public class JavaSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        //S deve ser maior que 0 menor que 101 e foi utilizado um Regex pra verificar as matchs(Alfabeticas)
        if(S.length() >= 1 && S.length() <= 100 && S.matches("[a-zA-Z]+")){
            //Start deve ser maior que -1 tem que ser menor que o end e o end não pode ser maior que o tamanho da string
            if(start>= 0 && start < end && end <= S.length()){
                //printa o retorno final da string
                System.out.println(S.substring(start, end));
            }
        }
    }
}