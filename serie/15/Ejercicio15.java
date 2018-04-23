import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio15 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList <Character> mens = new ArrayList<Character>();

        if(args[0].equals("0")){
            
            System.out.print("\n Ingresa la cadena a cifrar: "); 
            String palabra = sc.nextLine();
            
            for(int indice=0; indice<palabra.length(); indice++){
                mens.add(palabra.charAt(indice));
            }
            
            System.out.println("\n Analizando "+mens+" ...");
            
            for(int indice=0; indice<mens.size(); indice++)
            {
                char aux = (char) ((int) mens.get(indice)+3);
                mens.set(indice,aux);
            }
            System.out.println("\n Palabra cifrada: "+mens);

        }else{
            args[0].equals("1");
            System.out.print("\n Ingresa la palabra a Descifrar: "); 
            String palabra = sc.next();

            for(int indice=0; indice<palabra.length(); indice++){ 
                mens.add(palabra.charAt(indice));
            }

            System.out.println("\n Analizando "+mens+" ...");
           
            for(int indice=0; indice<mens.size(); indice++)
            {
                char aux = (char) ((int) mens.get(indice)-3);
                mens.set(indice,aux);
            }
            System.out.println("\n Palabra descifrada: "+mens);

        }   
    }

}