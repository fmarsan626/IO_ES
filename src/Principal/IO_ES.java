/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.Scanner;

/**
 * @version 1.0
 * @author Francisco Marcos Sanchez
 */
public class IO_ES {
    IO_ES(){
        
    }
    /*
    *Metodo para leer un numero entero
    */
    public static int leerInteger(){
       boolean flag;
       int a=0;
       do{
         try{
            Scanner tcl=new Scanner(System.in);
            System.out.print("Introduce un numero entero: ");
            a=Integer.parseInt(tcl.nextLine());
            flag=true;
            
         }catch(NumberFormatException g){
            System.out.println("Tipo de dato no valido");
            System.out.print("Vuelva a intentarlo:");
            flag=false;
            }
        }
        while(flag==false);
        return a;
    }
    /*
    *Metodo para leer un numero entero con un mensaje proporcionado
    */
    public static int leerInteger(String mensaje){
       boolean flag;
       int a=0;
       do{
         try{
            Scanner tcl=new Scanner(System.in);
            System.out.print(mensaje+" ");
            a=Integer.parseInt(tcl.nextLine());
            flag=true;
            
         }catch(NumberFormatException g){
            System.out.println("Tipo de dato no valido");
            System.out.print("Vuelva a intentarlo:");
            flag=false;
            }
        }
        while(flag==false);
       return a;
    }
    /*
    *Metodo para leer un entero con mensaje proporcionado y valor minimo
    */
    public static int leerInteger(String mensaje, int min){
       boolean flag;
       int a=0;
       do{
         try{
            Scanner tcl=new Scanner(System.in);
            System.out.print(mensaje+" ");
            a=Integer.parseInt(tcl.nextLine());
            if(a>=min){
                flag=true;
            }else{
                System.out.println("El número no es mayor o igual que "+min+": ");
                flag=false;
            }
            
         }catch(NumberFormatException g){
            System.out.println("Tipo de dato no valido");
            System.out.print("Vuelva a intentarlo:");
            flag=false;
            }
        }
        while(flag==false);
        return a;
    }
    /*
    *Metodo para leer un etero con mensaje proporcionado y valor minimo y maximo
    */
    public static int leerInteger(String mensaje, int min, int max){
       boolean flag;
       int a=0;
       do{
         try{
            Scanner tcl=new Scanner(System.in);
            System.out.print(mensaje+" ");
            a=Integer.parseInt(tcl.nextLine());
            if(a>=min&&a<=max){
                flag=true;
            }else{
                System.out.println("El número no es mayor o igual que "+min+"ni menor o igual que "+max+".");
                flag=false;
            }
            
         }catch(NumberFormatException g){
            System.out.println("Tipo de dato no valido");
            System.out.print("Vuelva a intentarlo:");
            flag=false;
            }
        }
        while(flag==false);
        return a;
    } 
    /*
    *Metodo para leer un long
    */
    public static long  leerIntegerLargo(){
       boolean flag;
       long c=0;
       do{
         try{
            Scanner tcl=new Scanner(System.in);
            System.out.print("Introduce un numero entero largo: ");
            c=Long.parseLong(tcl.nextLine());
            flag=true;
         }catch(NumberFormatException h){
            System.out.println("Tipo de dato no valido");
            flag=false;
            }
        }
       while(flag==false);
       return c;
    }
    /*
    *Metodo para leer un long con mensaje proporcionado
    */
    public static long  leerIntegerLargo(String mensaje){
       boolean flag;
       long c=0;
       do{
         try{
            Scanner tcl=new Scanner(System.in);
            System.out.print(mensaje+" ");
            c=Long.parseLong(tcl.nextLine());
            flag=true;
         }catch(NumberFormatException h){
            System.out.println("Tipo de dato no valido");
            flag=false;
            }
        }
       while(flag==false);
       return c;
    }
    /*
    *Metodo para leer un float
    */
    public static float leerReal(){
       boolean flag;
       float b=0;
       do{
          try{
            Scanner tcl=new Scanner(System.in);
            System.out.print("Introduce un numero real: ");
            b=Float.parseFloat(tcl.nextLine());
            flag=true;
          }catch(NumberFormatException h){
            System.out.println("Tipo de dato no valido");
            flag=false;
       
          }
        }
       while(flag==false);
       return b;
    }
    /*
    *Metodo para leer un float con mensaje proporcionado 
    */
    public static float leerReal(String mensaje){
       boolean flag;
       float b=0;
       do{
          try{
            Scanner tcl=new Scanner(System.in);
            System.out.print(mensaje+" ");
            b=Float.parseFloat(tcl.nextLine());
            flag=true;
          }catch(NumberFormatException h){
            System.out.println("Tipo de dato no valido");
            flag=false;
       
          }
        }
       while(flag==false);
       return b;
    }
    /*
    *Metodo para leer un float con mensaje proporcionado y valor minimo 
    */
    public static float leerReal(String mensaje, int min){
       boolean flag;
       float b=0;
       do{
          try{
            Scanner tcl=new Scanner(System.in);
            System.out.print(mensaje+" ");
            b=Float.parseFloat(tcl.nextLine());
            if(b>=min){
                flag=true;
            }else{
                System.out.println("El numero no es mayor o igual que "+min);
                flag=false;
            }
            
          }catch(NumberFormatException h){
            System.out.println("Tipo de dato no valido");
            flag=false;
       
          }
        }
       while(flag==false);
       return b;
    }
    /*
    *Metodo para leer un double
    */
    public static double  leerRealLargo(){
       boolean flag;
       double d=0;
       do{
         try{
          Scanner tcl=new Scanner(System.in);
          System.out.print("Introduce un numero real largo: ");
          d=Double.parseDouble(tcl.nextLine());
          flag=true;
         }catch(NumberFormatException h){
          System.out.println("Tipo de dato no valido");
          flag=false;
         }
        }
       while(flag==false);
       return d;
    }
    /*
    *Metodo para leer un double con mensaje proporcionado 
    */
    public static double  leerRealLargo(String mensaje){
       boolean flag;
       double d=0;
       do{
         try{
          Scanner tcl=new Scanner(System.in);
          System.out.print(mensaje+" ");
          d=Double.parseDouble(tcl.nextLine());
          flag=true;
         }catch(NumberFormatException h){
          System.out.println("Tipo de dato no valido");
          flag=false;
         }
        }
       while(flag==false);
       return d;
    }
    /*
    *Metodo para leer un String
    */
    public static String  leerCadena(){
       String e="";
      
          
           Scanner tcl=new Scanner(System.in);
           System.out.print("Introduce una cadena: ");
           e=tcl.nextLine();
       return e;
    }
    /*
    *Metodo para leer un String con mensaje proporcionado
    */
    public static String  leerCadena(String mensaje){
       boolean flag;
       String e="";
       do{
          
           Scanner tcl=new Scanner(System.in);
           System.out.print(mensaje+" ");
           e=tcl.nextLine();
           flag=true;
          
          }
       while(flag==false);
       return e;
    }
    /*
    *Metodo para leer un String con mensaje proporcionado y valor exacto
    */
    public static String  leerCadena(String mensaje, int longitud){
       boolean flag=false;
       String e="";
       do{
           Scanner tcl=new Scanner(System.in);
           System.out.print(mensaje+" ");
           e=tcl.nextLine();
           if (e.length()==longitud){
               flag=true;
           }else{
               System.out.println("La cadena no es del tamaño adecuado");
               
           }
        }
       while(flag==false);
       return e;
    }
    /*
    *Metodo para leer un char
    */
    public static char leerCaracter(){
       boolean flag=false;
       char e = 0;
       String f;
       do{
          try{
           Scanner tcl=new Scanner(System.in);
           System.out.print("Introduce un caracter: ");
           f=tcl.nextLine();
           if(f.length()==1){
               e= f.charAt(0);
               flag=true;
           }else{
               System.out.println("Solo puede inroducir un caracter");
           }
          }catch(Exception h){
              System.out.println("Tipo de dato no valido");
              System.out.print("Vuelva a intentarlo: ");
           
       
            }
        }
       while(flag==false);
       return e;
    }
    /*
    *Metodo para leer un char con mensaje proporcionado
    */
    public static char  leerCaracter(String mensaje){
       boolean flag=false;
       char e = 0;
       String f;
       do{
          try{
           Scanner tcl=new Scanner(System.in);
           System.out.print(mensaje+" ");
           f=tcl.nextLine();
           if(f.length()==1){
               e= f.charAt(0);
               flag=true;
           }else{
               System.out.println("Solo puede inroducir un caracter");
           }
           
          }catch(Exception h){
              System.out.println("Tipo de dato no valido");
              System.out.print("Vuelva a intentarlo: ");
           
       
            }
        }
       while(flag==false);
       return e;
    }
    /*
    *Metodo para leer un boolean
    */
    public static boolean leerBoolean(){
       boolean flag=false;
       boolean e=false;
       String f;
       
       do{
           Scanner tcl=new Scanner(System.in);
           System.out.print("Introduce Si o No: ");
           f=tcl.nextLine().toUpperCase();
              switch (f) {
                  case "NO":
                      flag=true;
                      break;
                  case "SI":
                      e=true;
                      flag=true;
                      break;
                  case "N":
                      flag=true;
                      break;
                  case "S":
                      e=true;
                      flag=true;
                      break;
                  default:
                      System.out.println("Opción no válida");
                      break;
              }
        }
       while(flag==false);
       return e;
    }
    /*
    *Metodo para leer un boolean con mensaje proporcionado
    */
    public static boolean leerBoolean(String mensaje){
       boolean flag=false;
       boolean e=false;
       String f;
       
       do{
           Scanner tcl=new Scanner(System.in);
           System.out.print(mensaje+" ");
           f=tcl.nextLine().toUpperCase();
              switch (f) {
                  case "NO":
                      flag=true;
                      break;
                  case "SI":
                      e=true;
                      flag=true;
                      break;
                  case "N":
                      flag=true;
                      break;
                  case "S":
                      e=true;
                      flag=true;
                      break;
                  default:
                      System.out.println("Opción no válida");
                      break;
              }
        }
       while(flag==false);
       return e;
    }
    public static void escribir(String mensaje){
     System.out.print(mensaje);
    }
    public static void escribirLN(String mensaje){
     System.out.println(mensaje);
    }
}
