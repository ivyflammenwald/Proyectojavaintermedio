

public class Persona {

       String nombre, masc , tel;
       Mascota m;

    Persona(String n,String t,String masc){
        this.nombre = n;
        this.tel = t;
        Mascota m = new Mascota(masc);
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return tel;
    }

    public String getMascota() {
        nombre=m.getNombre();
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(String numero) {
        this.tel = numero;
    }

}
