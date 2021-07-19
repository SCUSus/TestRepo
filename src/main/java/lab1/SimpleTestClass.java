/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Susanne
 */
public class SimpleTestClass {
    public static int countChar(String str, char c) {
        int counter = 0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == c)
                counter++;
        }
        return counter;
    }
}
