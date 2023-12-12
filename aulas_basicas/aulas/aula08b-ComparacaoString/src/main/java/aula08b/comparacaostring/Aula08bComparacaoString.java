/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aula08b.comparacaostring;

/**
 *
 * @author future
 */
public class Aula08bComparacaoString {

    public static void main(String[] args) {
        
        String nome1 = "Fulano";
        String nome2 = "Fulano";
        String nome3 = new String("Fulano");
        String res1, res2, res3;
        
        res1 = (nome1==nome2)?"É igual.":"É diferente.";
        res2 = (nome1==nome3)?"É igual.":"É diferente.";
                
        System.out.println(res1);
        System.out.println(res2);   
        // A segunda opção é diferente porque String são objetos no Java, e do jeito que eles estão
        // declarados eles estão instanciados diferentes. O que é igual é o CONTEUDO.
        // O jeito de vertificar o conteúdo é assim:
        res3 = (nome1.equals(nome3))?"É igual":"É diferente";
        System.out.println(res3);        
    }
}
