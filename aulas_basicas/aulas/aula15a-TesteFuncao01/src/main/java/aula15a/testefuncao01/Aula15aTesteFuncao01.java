/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aula15a.testefuncao01;

/**
 *
 * @author future
 */
public class Aula15aTesteFuncao01 {

    // Assim é um PROCEDIMENTO, não função. Procedimento não retorna valor.
    // Procedimento começa com o tipo "void".
    // O "static" tá aí porque estamos usando o trem dentro do main lá em baixo, e ele é static.
    static void somaPROC(int a, int b) {
        int s = a + b;
        System.out.println("A soma com procedimento é " + s + ".");
    }
    
    // Assim é uma FUNÇÃO, não um procedimento. Procedimento não retorna valor.
    // Procedimento começa com um tipo, no caso aqui o "int":
    // O "static" tá aí porque estamos usando o trem dentro do main lá em baixo, e ele é static.
    static int somaFunc(int a, int b) {
        int s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
//        System.out.println("Hello World!");

        System.out.println("Começou o programa.");
        
        somaPROC (3,2);
        
        int sm = somaFunc(5,2);
        System.out.println("A soma com função é " + sm + ".");
    }
}
