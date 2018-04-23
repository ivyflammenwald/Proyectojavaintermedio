import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio13 {

    
    public static void main(String[] args) { 

        int dividendo,divisor;
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("\n Ingresa el dividendo, si hay error es 1 por defecto");
            dividendo = sc.nextInt();
        }catch (InputMismatchException ime)  {
            dividendo=1;
        }
        
        try
        {
            sc.nextLine();
            System.out.print("\n Ingresa el divisor, 1 por defecto ");
            divisor = sc.nextInt(); sc.nextLine();
             int r=dividendo/divisor;
        }catch (ArithmeticException ae) {
            System.out.println("\n\tValor invalido"); divisor=1;
        }catch (InputMismatchException ime){
            System.out.println("\n\tValor invalido"); 
            divisor=1;
        }
        
        int reduccion = Math.max(dividendo, divisor);
        while(reduccion!=0)
        {
            if(reduccion==1 && ((dividendo*dividendo)==divisor))
            {
                divisor=divisor/dividendo; 
                dividendo=dividendo/dividendo;
                System.out.println("\n "+dividendo+"/"+divisor);
                reduccion=0;
            }
            else if(((dividendo%reduccion)==0) && ((divisor%reduccion)==0))
            {
                dividendo=dividendo/reduccion; 
                divisor=divisor/reduccion;
                System.out.println("\n "+dividendo+"/"+divisor);
                reduccion=0;
            }
            else reduccion--;
        }
    }
}
