public class Ebook extends Libro {
    String formato;

    public Ebook(String nombre, Double precio, String autor, String formato) {
        super(nombre, precio, autor);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }
}
