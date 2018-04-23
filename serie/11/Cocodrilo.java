public class Cocodrilo extends Mamifero{
	final private String animalfavorito;

	public Cocodrilo(){
		super("Cocodrilo", 200.5, 500, "antilope");
	}
	public Cocodrilo(String nombre, float peso, String fuerza, String animalfavorito){
		super(nombre, peso, fuerza,  animalfavorito);
	}

	public void mostrarInfo(){
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Peso: "+this.peso);
		System.out.println("presa favorita: "+this.animalfavorito);
		System.out.println("fuerza: "+this.fuerza);
	}
	
	
	public void jugar(Animal a ){
		System.out.println("Los cocodrilos no juegan, son asesinos por naturaleza");
		super.atacar(a);		
	}

	public void comer(){
		super.comer();	
	}
}