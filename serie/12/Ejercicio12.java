import java.util.Scanner;

public class Ejercicio12{

     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Double a=0.0;
        Double b=0.0;
        Double c =0.0;
        System.out.println("Ingrese los coeficientes de su polinomio para calcular las raices");
      
        try{
             a=sc.nextDouble();
             b=sc.nextDouble();
             c=sc.nextDouble();
        }catch(NumberFormatException nfe) {                
            System.out.println("Ingrese un numero valido");
        }
        

        Polinomio p = new Polinomio(a,b,c);    
        try {
            p.raiz();
            
        }catch(ComplexRException exc) {
            System.out.println(exc.getMessage());
        }
    }

}
