abstract public class Herbivoro implements Animal{

	protected String nombre;
	protected float peso;
	protected int fuerza;
	protected String plantaFavorita;

	public Herbivoro(String nombre, float peso, 
		int fuerza, String plantaFavorita){
		this.nombre =nombre;
		this.fuerza=fuerza
		this.peso=peso;
		this.plantaFavorita = plantaFavorita;
	}

		public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public String getNombre() {
            return this.nombre;
        }
        
        public void setComidaFavorita(String comidaFavorita){
            this.plantaFavorita= comidaFavorita;
        }

        public String getComidaFavorita() {
            return this.plantaFavorita;
        }

        public String getPeso() {
            return this.peso;
        }

        public void setPeso(String n){
            this.peso = n;
        }

        public String getFuerza() {
            return this.fuerza;
        }

	public void comer(){
		System.out.println("El "+this.nombre+" se comio plantas tranquilamente");		
	}

	public void comer(String planta){
		System.out.println("El "+this.nombre+
			"se comio la "+planta);
		if(this.plantaFavorita.equals(planta))
			System.out.println("Y se hizo una ensalada");
	}

	public void jugar(Animal a){
		if(a instanceof Carnivoro)
			System.out.println("El "+this.getNombre()+" salio corriendo");
		else
			System.out.println("Los animales"+this.getNombre()+a.getNombre()+"jugaron juntos");
	}
}