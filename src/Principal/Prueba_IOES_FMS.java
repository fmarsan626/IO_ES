/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Francisco Marcos Sanchez
 */
public class Prueba_IOES_FMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Leer Entero");
         int a=IO_ES.leerInteger();
            System.out.println(a);
         int b=IO_ES.leerInteger("Leer entero con este mensaje");
            System.out.println(b);
         int c=IO_ES.leerInteger("Leer entero con minimo, minimo 3", 3);
            System.out.println(c);
         int d=IO_ES.leerInteger("Leer entero con min y max (entre 3 y 9)", 3, 9);
            System.out.println(d);
        System.out.println("Leer long");
         long e=IO_ES.leerIntegerLargo();
            System.out.println(e);
         long f=IO_ES.leerIntegerLargo("Leer long con mensaje");
            System.out.println(f);
        System.out.println("Leer float");
         float g=IO_ES.leerReal();
            System.out.println(g);
         float h=IO_ES.leerReal("Leer float con mensaje");
            System.out.println(h);
         float i=IO_ES.leerReal("Leer float con minimo, minimo 3", 3);
            System.out.println(i);
        System.out.println("Leer double");
         double j=IO_ES.leerRealLargo();
            System.out.println(j);
         double k=IO_ES.leerRealLargo("Leer double con mensaje");
            System.out.println(k);
        System.out.println("Leer cadena");
         String l=IO_ES.leerCadena();
            System.out.println(l);
         String m=IO_ES.leerCadena("Leer cadena con mensaje");
            System.out.println(m);
         String n=IO_ES.leerCadena("Leer cadena con longitud exacta (5)", 5);
            System.out.println(n);
        System.out.println("Leer caracter");
         char o=IO_ES.leerCaracter();
            System.out.println(o);
         char p=IO_ES.leerCaracter("Leer caracter con mensaje");
            System.out.println(p);
        System.out.println("Leer bolean (SI/NO S/N) mayusculas o minusculas");
         boolean q=IO_ES.leerBoolean();
            System.out.println(q);
         boolean r=IO_ES.leerBoolean("Leer boolean con mensaje");
            System.out.println(r);
        IO_ES.escribir("Escribir");
        IO_ES.escribirLN("Escribir con LN");
        
        
        
        
        
        
    }
   
    
}
