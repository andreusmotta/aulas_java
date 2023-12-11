/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aula07.operadoresaritmetricos;

/**
 *
 * @author future
 */
public class Aula07OperadoresAritmetricos {

    public static void main(String[] args) {

//        int n1 = 3;
//        int n2 = 5;
//        float m = (n1 + n2)/2;
//        float m1 = n1 + n2/2;
//        
//        System.out.println("A média é igual a " + m);
//        System.out.println("A média é igual a " + m1);
        
//        int numero = 5;
//        numero++;
//        System.out.println(numero);
        
//        int numero = 5;
//        numero--;
//        System.out.println(numero);
        
        // Assim ele não soma o "++" porque é um pós incremento, ele fará as operações aritméticas antes.
//        int numero = 5;
//        int valor = 5 + numero++;        
//        System.out.println(valor);
        
        // Assim ele soma o "++" porque é um pré incremento, ele fará o incremento na variável e depois as operações aritméticas.
//        int numero = 5;
//        int valor = 5 + ++numero;        
//        System.out.println(valor);

        // Usando os operadores += -= *= /= você consegue incrementar um valor específico para cada operação.
//        int x = 4;
//        int y = 4;
//        int w = 4;
//        int z = 4;
//        x += 2; // x = x + 2;
//        y -= 2; // y = y - 2;
//        w *= 2; // w = w * 2;
//        z /= 2; // z = z / 2;
//        System.out.println("A adição é " + x);
//        System.out.println("A subtração é " + y);
//        System.out.println("A multiplicação é " + w);
//        System.out.println("A divisão é " + z);
        
        // Arredontamentos usando a classe Math. Floor é pra baixo, Ceil é pra cima e Round é o tradicional aritmético:
//        float v = 8.9f;
//        int arredondamentoFloor = (int) Math.floor(v);
//        int arredondamentoCeil = (int) Math.ceil(v);
//        int arredondamentoRound = (int) Math.round(v);
//        System.out.println(arredondamentoFloor);
//        System.out.println(arredondamentoCeil);
//        System.out.println(arredondamentoRound);
        
        // O random da classe Math gera um número entre 0 e 1:
//        double aleatorio = Math.random();
//        System.out.println(aleatorio);
        
        // Esse é o método de gerar um número aleatório de um início e fim específico. No exemplo de 15 até 50:
        double aleatorio = Math.random();
        int n = (int) (15 + aleatorio * (50-15));
        System.out.println(n);
        
    }
}
