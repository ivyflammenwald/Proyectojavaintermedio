public class Ejercicio17 {

     public static void main(String[] args) {
       
            System.out.println("torres de hanoi");
            System.out.print("Ingresa el numero de discos de las torres: ");
            Scanner sc = new Scanner(System.in);
            int discos = sc.nextInt();
            
        
        Construirtorres(discos, 'A', 'B', 'C');
    }
 
    public static void Construirtorres(int topN, char from,
    char inter, char to) {
        if (topN == 1){
            System.out.println("Disk 1 from " + from + " to " + to);
        }else {
            Construirtorres(topN - 1, from, to, inter);
            System.out.println("Disco " + topN + " desde " + from + " hacia " + to);
            Construirtorres(topN - 1, inter, from, to);
        }
    }
}