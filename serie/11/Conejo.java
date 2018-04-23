public class Conejo extends Herbivoro{
	
	public Conejo(String nombre, float peso, String fuerza, String plantaFavorita){
		super("conejo", 2, 5,  "zanahorias");
	}
	
	public Conejo(String nombre, float peso, String fuerza, String plantaFavorita){
		super(nombre, peso, fuerza,  plantaFavorita);
	}

	public void roer(){
		System.out.println("El conejo roe la madera.");
	}

	public void mostrarInfo(){
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Peso: "+this.peso);
		System.out.println("Fuerza: "+this.fuerza);
		System.out.println("Planta Favorita: "+this.plantaFavorita);
	}

}