/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aula07.testetipos;

/**
 *
 * @author future
 */
public class Aula07TesteTipos {

    public static void main(String[] args) {
        // Declarando variáveis:
        int idade = 30;
        String valor2 = "30";
        String valor3 = "30.5";
        
//        Tentando converter elas:
//        String valor = idade;
//        String valor = (String) idade;
//        String valor = (int) idade;

//        int idade2 = valor2;
//        int idade2 = (String) valor2;
//        Nenhuma das acima funciona.

       
        // É assim que faz:
        String valor = Integer.toString(idade);
        int idade2 = Integer.parseInt(valor2);
        float idade3 = Float.parseFloat(valor3);
        //Testando:
        System.out.println(valor);
        System.out.println(idade2);
        System.out.println(idade3);
        System.out.printf("%.3f", idade3);
                
        
        
    }
}
