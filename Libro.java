public class Libro extends Producto {

    String  autor;

    public Libro(String nombre, Double precio, String autor) {
        super(nombre, precio);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }    
}
