public class Persona {
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para mostrar información de la persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public static void main(String[] args) {
        // Crear objetos de tipo Persona
        Persona persona1 = new Persona("Alice", 25);
        Persona persona2 = new Persona("Bob", 30);

        // Mostrar información de las personas
        persona1.mostrarInformacion();
        System.out.println();  // Línea en blanco
        persona2.mostrarInformacion();
    }
}