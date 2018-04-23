import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        String personanombre, mascotanombre, telefono;
        int opcion=0;
        boolean continuar=true;

        ArrayList<Persona> directorio = new ArrayList<Persona>(); 
        Scanner sc= new Scanner(System.in);
        
        while(continuar){
        System.out.println("Elije una opcion de la agenda");
            System.out.println("1)Agregar Contacto");
            System.out.println("2)Buscar Contacto");
            System.out.println("3)Eliminar Contacto");
            System.out.println("");
        

        try{
     
         opcion=sc.nextInt();
         sc.nextLine();
        
        switch(opcion){
            case 1:
                  
                System.out.println("Ingresa nombre del nuevo contacto");
                personanombre=sc.nextLine();
                System.out.println("Ingresa el telefono");
                telefono=sc.nextLine();
                System.out.println("Ingresa el nombre de su mascota");
                mascotanombre=sc.nextLine();
                Persona p = new Persona(personanombre,mascotanombre,telefono);
                directorio.add(p);
            break;

            case 2:
                System.out.println("Ingrese el nombre de la persona que desea buscar");
                personanombre=sc.nextLine();
               
                    for (int  i = 0; i < directorio.size(); i++) {
                        if(personanombre.equals(directorio.get(i).getNombre())){
                            System.out.println("Datos de contacto");
                            System.out.println(directorio.get(i).getNombre());
                            System.out.println(directorio.get(i).getNumero());
                            System.out.println(directorio.get(i).getMascota());
                        }
                       
                     }
                      break;
            case 3:
                System.out.println("Que contacto eliminar?");
                personanombre=sc.nextLine();
                    for (int  i = 0; i < directorio.size(); i++) {
                        if(personanombre.equals(directorio.get(i).getNombre())){
                        directorio.remove(i);   
                        }
                }
                      break;
            default:
                System.out.println("Salir");
                continuar=false;
                      break;

            }
        }catch(Exception e){
           System.out.println("Ingrese un numero");
           continue;
        }

        
        }        
    
}
}