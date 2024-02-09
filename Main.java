public class Main {
    public static void main(String[] args) {
        Ebook ebook = new Ebook("El señor del hoyo", 19.99,"J.R.R" , "PDF");
        System.out.println("Ebook " + ebook.nombre);
        System.out.println("Ebook " + ebook.precio);
        System.out.println("Ebook " + ebook.autor);
        System.out.println("Ebook " + ebook.formato);

    }
}
