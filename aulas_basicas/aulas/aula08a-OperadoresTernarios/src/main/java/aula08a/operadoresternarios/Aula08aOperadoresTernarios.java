/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aula08a.operadoresternarios;

/**
 *
 * @author future
 */
public class Aula08aOperadoresTernarios {

    public static void main(String[] args) {
        
        // Esse é um jeito de fazer "if, else" de maneira curta. Coloca a condição entre parênteses e os dois possíveis resultados depois separados por dois pontos.
//        int n1, n2, r;
//        n1 = 3;
//        n2 = 8;
//        r = (n1>n2)?0:1;        
//        System.out.println(r);

        //Dá pra colocar as váriáveis lá também:
//        int n1, n2, r;
//        n1 = 3;
//        n2 = 8;
//        r = (n1>n2)?n1:n2;        
//        System.out.println(r);
        
        // Dá pra colocar formulas lá dentro junto:
        int n1, n2, r;
        n1 = 3;
        n2 = 8;
        r = (n1>n2)?n1+n2:n2-n1;        
        System.out.println(r);
    }
}
