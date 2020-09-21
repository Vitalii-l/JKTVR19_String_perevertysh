/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktvr19_string;

import java.util.Scanner;
import sun.security.util.Length;

/**
 *
 * @author pupil
 */
class App {

    public void run() {
        System.out.println("Перевертыш");
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("В строке символов: " + str.length());
        System.out.println("Перевертыш: ");
        char[] chStr = str.toCharArray();
        char[] pChStr = new char[str.length()];
        for (int i = 0; i < pChStr.length; i++) {
            pChStr[i] = chStr[(pChStr.length-1) - i];            
        }
        String pStr = new String(pChStr);
        System.out.println(pStr);
        
        System.out.println("Второе слово строки: ");
        int firstSpace = str.indexOf(" ");
        int secondSpace = str.indexOf(" ", firstSpace+1);
        if (firstSpace < 0) System.out.println("Нет второго слова");
        else if (secondSpace < 0) 
            System.out.println(str.substring(firstSpace+1));
        else
            System.out.println(str.substring(firstSpace+1,secondSpace));
        
        
        
    }
    
}
