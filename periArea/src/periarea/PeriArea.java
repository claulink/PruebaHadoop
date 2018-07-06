
package periarea;

import java.util.Scanner;

public class PeriArea {

   
    public static void main(String[] args) {
       Scanner dato = new Scanner(System.in);
       System.out.println("\t \t Tipo de trángulo");
       System.out.println("1. Equilatero");
       System.out.println("2. Isoseles");
       System.out.println("3. Escaleno");
       System.out.println("4. Salir");
       System.out.println("\n Opción: ");
       byte opcion = Byte.parseByte(dato.nextLine());
       double perimetro=0, area=0;
      // double base, altura;
       if (opcion >= 4 || opcion <=0){
           System.out.println("Adiós....");
           
       }
       else{
           if (opcion ==1 ){
               System.out.println("Dame el valor del lado: ");
               double lado = Double.parseDouble(dato.nextLine());
               perimetro = lado * 3;
               area = Math.sqrt(3) / 4 * lado * lado;
               /*
               base = lado /2;
               altura = Math.sqrt(Math.pow(base,2) + Math.pow(lado,2));
               area = base * altura  /2;
               System.out.println("Altura: " + altura);
               */
               
           }
           else{
               if(opcion == 2){
                  System.out.println("Dame el valor de los dos lados iguales: ");
                  double lado1 = Double.parseDouble(dato.nextLine());  
                  System.out.println("Dame el valor del lado diferente: ");
                  double lado2 = Double.parseDouble(dato.nextLine());
                  perimetro = lado1 * 2 + lado2;
                  area = lado2 * Math.sqrt(Math.pow(lado1,2) - (Math.pow(lado2,2) /4)) /2;
                          
                  /*
                  base = lado2 /2;
                  altura = Math.sqrt(Math.pow(base, 2) + Math.pow(lado1, 2));
                  area = base * altura /2;
                  */
                  
               
               }
               else{
                   System.out.println("Dame el valor del lado 1: ");
                   double lado1 = Double.parseDouble(dato.nextLine());
                   System.out.println("Dame el valor del lado 2: ");
                   double lado2 = Double.parseDouble(dato.nextLine());
                   System.out.println("Dame el valor del lado 3: ");
                   double lado3 = Double.parseDouble(dato.nextLine());
                   perimetro = lado1 + lado2 + lado3;
                   double semiperimetro = perimetro /2;
                   //area = lado1 * lado2 /2;
                   area = Math.sqrt( semiperimetro * (semiperimetro - lado1 ) * (semiperimetro -lado2) * (semiperimetro - lado3));
               }
               
               
           }
        System.out.println("\n Perímetro: " + perimetro);
        System.out.println("Área: " + area);
       
       }
        
        
        
    }
    
}
