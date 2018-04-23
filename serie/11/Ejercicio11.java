public class Ejercicio11{
	public static void main(String[] args) {
		// estop no se puede instanciar porque es abstracto
		//Animal a = new Animal("Perro",2.0f,2);

		Conejo c1 = new Conejo();
		Conejo c2 = new Conejo();

		c2.jugar(c1);
		c1.comer();
		c2.comer("zanahorias");
		Antilope a2 = new Antilope();
		Antilope a1 = new Antilope();
		c2.jugar(a1);
		Cocodrilo coco = new Cocodrilo();
		c2.jugar(coco);
		a2.jugar(coco);
		a2.comer();
		coco.comer(c1);
		coco.jugar(c2);
		Aguila a1 = new Aguila();
		ag.atacar(c2);
		ag.atacar(coco);
	

	} 
}