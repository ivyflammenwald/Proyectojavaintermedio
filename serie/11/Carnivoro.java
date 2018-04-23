
abstract public class Carnivoro extends Animal{

	protected String nombre;
	protected float peso;
	protected int fuerza;
	protected String animalFavorito;

	public Carnivoro(String nombre, float peso, 
		int fuerza, String animalFavorito){

		this.nombre =nombre;
		this.fuerza=fuerza;
		this.peso=peso;
		this.animalFavorito = animalFavorito;
	}

		public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public String getNombre() {
            return this.nombre;
        }
        
        public void setComidaFavorita(String comidaFavorita){
            this.comidaFavorita= comidaFavorita;
        }

        public String getComidaFavorita() {
            return this.comidaFavorita;
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
		System.out.println("El "+this.nombre+" comio de un cadaver ");		
	}


	public void jugar(Animal a){
		if(this instanceof a)
			System.out.println("Los "+a.getNombre()+"s jugaron juntos");
	}

	private void comer(Animal a){
		System.out.println("El "+this.nombre+
			"se comio al "+a.nombre);
		if (a.nombre.equals(this.animalFavorito)) {
			System.out.println("Era su presa favorita");
		}
	}

	public void atacar(Animal a){
		if(this.fuerza >= a.getFuerza()){
			System.out.println(" El "+this.nombre+
				" ataco "+a.getNombre());
			this.comer(a);
		else{
			System.out.println("fue una mala idea que "+this.nombre+
				" atacara a "+a.getNombre());
			a.comer(this);
		}
		
	}
}