//https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        

        // Write your code here.
        Locale usaLocale = Locale.US;
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(usaLocale);
        String us = currencyFormat.format(payment);
        
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat currencyFormat2 = NumberFormat.getCurrencyInstance(indiaLocale);
        String india = currencyFormat2.format(payment);
        
        Locale chinaLocale = Locale.CHINA;
        NumberFormat currencyFormat3 = NumberFormat.getCurrencyInstance(chinaLocale);
        String china = currencyFormat3.format(payment);
        
        Locale franceLocale = Locale.FRANCE;
        NumberFormat curreFormat4 = NumberFormat.getCurrencyInstance(franceLocale);
        String france = curreFormat4.format(payment);
        
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
    