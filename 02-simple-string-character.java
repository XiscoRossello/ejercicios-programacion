//Creamos un programa que leerá la string y en base al codigo Unicode clasificará los caracteres en Mayusculas, Minusculas, Numeros y Caracteres Especiales

import java.util.Scanner;

public class SimpleString {
    public static void main(String[] args) {
        int Mayus = 0;
        int Minus = 0;
        int Num = 0;
        int Special = 0;
       
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter string");
    
    String str = myObj.nextLine();  // Read user input
    for (int i = 0; i < str.length(); i++) {
        if (str.codePointAt(i) >=65 && str.codePointAt(i)<=90) {
            Mayus++;
        }
        else if (str.codePointAt(i) >=97 && str.codePointAt(i)<=122) {
            Minus++;
        } 
        else if (str.codePointAt(i) >=48 && str.codePointAt(i)<=57) {
            Num++;
        } 
        else{
            Special++;
        } 
    }
    System.out.println("Solution for: " + str + " is " + Mayus + Minus + Num + Special);  // Output user input
}
}
