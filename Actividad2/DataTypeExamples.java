public class DataTypeExamples {
    public static class Contacto {
        public String nombre;
        public String telefono;
        public String direccion;

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