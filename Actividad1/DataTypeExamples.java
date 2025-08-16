public class DataTypeExamples {
    public static class Contacto {
        String nombre, telefono, direccion;

        public Contacto(String nombre, String telefono, String direccion) {
            this.nombre = nombre;
            this.telefono = telefono;
            this.direccion = direccion;
        }

        public String toString() {
            return nombre + " - " + telefono + " - " + direccion;
        }
    }
}