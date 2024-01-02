/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula15b.testefuncao02;

/**
 *
 * @author future
 */
public class Operacoes {
    
    public static String contador(int i, int f) {
        String s = "";
        for (int c = i; c <= f; c++) {
            s += c + " "; //mesma coisa que: s = s + c + " ";
        }
        return s;
    }
    
}
