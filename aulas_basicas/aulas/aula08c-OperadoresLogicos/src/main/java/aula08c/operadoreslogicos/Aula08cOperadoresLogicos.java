/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aula08c.operadoreslogicos;

/**
 *
 * @author future
 */
public class Aula08cOperadoresLogicos {

    public static void main(String[] args) {
        
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r1, r2, r3, r4, r5;
        
        r1 = (x<y && y<z)?true:false;
        System.out.println(r1);
        
        r2 = (x<y && y==z)?true:false;
        System.out.println(r2);
        
        r3 = (x<y || y==z)?true:false;
        System.out.println(r3);
        
        r4 = (x<y ^ y==z)?true:false;
        System.out.println(r4);
        
        r5 = (x<y ^ y<z)?true:false;
        System.out.println(r5);
        
    }
}
