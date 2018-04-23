public class Antilope extends Mamifero{


	public Antilope(){
		this.nombre ="antilope";
		this.fuerza=200;
		this.peso=120;
		this.plantaFavorita ="pasto" ;
	}

	public Antilope(String nombre, float peso, 
		int fuerza, String plantaFavorita){
		super(nombre,peso,fuerza,plantaFavorita);
	}
	
	

	public void mostrarInfo(){
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Peso: "+this.peso);
		System.out.println("Fuerza: "+this.fuerza);
		System.out.println("Planta Favorita: "+this.plantaFavorita);
	}
	
}