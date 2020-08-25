import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat u = NumberFormat.getCurrencyInstance(Locale.US); 
        String us = u.format(payment);
        NumberFormat c = NumberFormat.getCurrencyInstance(new Locale("zh", "CN")); 
        String china = c.format(payment);
        NumberFormat f = NumberFormat.getCurrencyInstance(new Locale("fr", "FR")); 
        String france = f.format(payment);
        NumberFormat i = NumberFormat.getCurrencyInstance(new Locale("en", "IN")); 
        String india = i.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}