import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList lista = null;

        int opcion = 0;
        do {
            try {
                System.out.println("\nMENU PRINCIPAL");
                System.out.println("1. Lista Simple");
                System.out.println("2. Lista Doble");
                System.out.println("3. Lista Circular");
                System.out.println("4. Ejemplos de Lista Simple");
                System.out.println("5. Ejemplos de Lista Doble");
                System.out.println("6. Ejemplos de Lista Circular");
                System.out.println("7. Salir");
                System.out.print("\nSelección: ");

                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        lista = new LinkedList(false, false);
                        System.out.println("Lista Simple creada.");
                        break;
                    case 2:
                        lista = new LinkedList(true, false);
                        System.out.println("Lista Doble creada.");
                        break;
                    case 3:
                        lista = new LinkedList(true, true);
                        System.out.println("Lista Circular creada.");
                        break;
                    case 4:
                                            
                        
                        System.out.println("\nStrings");
                        LinkedList ejemploSimple1 = new LinkedList(false, false);
                        System.out.println("Izquierda a derecha:");
                        ejemploSimple1.insert("A");
                        ejemploSimple1.insert("B");
                        ejemploSimple1.insert("C");
                        ejemploSimple1.insert("D");
                        ejemploSimple1.insert("E");
                        ejemploSimple1.display();
                        
                        LinkedList ejemploSimple1Rev = new LinkedList(false, false);
                        System.out.println("Derecha a izquierda:");
                        ejemploSimple1Rev.insert("E");
                        ejemploSimple1Rev.insert("D");
                        ejemploSimple1Rev.insert("C");
                        ejemploSimple1Rev.insert("B");
                        ejemploSimple1Rev.insert("A");
                        ejemploSimple1Rev.display();

                        
                        System.out.println("\nDecimales");
                        LinkedList ejemploSimple2 = new LinkedList(false, false);
                        System.out.println("Izquierda a derecha:");
                        ejemploSimple2.insert(11.11);
                        ejemploSimple2.insert(22.22);
                        ejemploSimple2.insert(33.33);
                        ejemploSimple2.insert(44.44);
                        ejemploSimple2.insert(55.55);
                        ejemploSimple2.display();
                        
                        LinkedList ejemploSimple2Rev = new LinkedList(false, false);
                        System.out.println("Derecha a izquierda:");
                        ejemploSimple2Rev.insert(55.55);
                        ejemploSimple2Rev.insert(44.44);
                        ejemploSimple2Rev.insert(33.33);
                        ejemploSimple2Rev.insert(22.22);
                        ejemploSimple2Rev.insert(11.11);
                        ejemploSimple2Rev.display();

                        
                        System.out.println("\nEnteros");
                        LinkedList ejemploSimple3 = new LinkedList(false, false);
                        System.out.println("Izquierda a derecha:");
                        ejemploSimple3.insert(10);
                        ejemploSimple3.insert(20);
                        ejemploSimple3.insert(30);
                        ejemploSimple3.insert(40);
                        ejemploSimple3.insert(50);
                        ejemploSimple3.display();
                        
                        LinkedList ejemploSimple3Rev = new LinkedList(false, false);
                        System.out.println("Derecha a izquierda:");
                        ejemploSimple3Rev.insert(50);
                        ejemploSimple3Rev.insert(40);
                        ejemploSimple3Rev.insert(30);
                        ejemploSimple3Rev.insert(20);
                        ejemploSimple3Rev.insert(10);
                        ejemploSimple3Rev.display();
                        break;

                    case 5:
                        
                        
                        
                        System.out.println("\nStrings");
                        LinkedList ejemploDoble1 = new LinkedList(true, false);
                        System.out.println("Izquierda a derecha");
                        ejemploDoble1.insert("A");
                        ejemploDoble1.insert("B");
                        ejemploDoble1.insert("C");
                        ejemploDoble1.insert("D");
                        ejemploDoble1.insert("E");
                        ejemploDoble1.display();
                        
                        LinkedList ejemploDoble1Rev = new LinkedList(true, false);
                        System.out.println("Derecha a izquierda");
                        ejemploDoble1Rev.insert("E");
                        ejemploDoble1Rev.insert("D");
                        ejemploDoble1Rev.insert("C");
                        ejemploDoble1Rev.insert("B");
                        ejemploDoble1Rev.insert("A");
                        ejemploDoble1Rev.display();

                        
                        System.out.println("\nDecimales");
                        LinkedList ejemploDoble2 = new LinkedList(true, false);
                        System.out.println("Izquierda a derecha:");
                        ejemploDoble2.insert(11.11);
                        ejemploDoble2.insert(22.22);
                        ejemploDoble2.insert(33.33);
                        ejemploDoble2.insert(44.44);
                        ejemploDoble2.insert(55.55);
                        ejemploDoble2.display();
                        
                        LinkedList ejemploDoble2Rev = new LinkedList(true, false);
                        System.out.println("Derecha a izquierda:");
                        ejemploDoble2Rev.insert(55.55);
                        ejemploDoble2Rev.insert(44.44);
                        ejemploDoble2Rev.insert(33.33);
                        ejemploDoble2Rev.insert(22.22);
                        ejemploDoble2Rev.insert(11.11);
                        ejemploDoble2Rev.display();

                        
                        System.out.println("\nEnteros:");
                        LinkedList ejemploDoble3 = new LinkedList(true, false);
                        System.out.println("Izquierda a derecha:");
                        ejemploDoble3.insert(10);
                        ejemploDoble3.insert(20);
                        ejemploDoble3.insert(30);
                        ejemploDoble3.insert(40);
                        ejemploDoble3.insert(50);
                        ejemploDoble3.display();
                        
                        LinkedList ejemploDoble3Rev = new LinkedList(true, false);
                        System.out.println("Derecha a izquierda:");
                        ejemploDoble3Rev.insert(50);
                        ejemploDoble3Rev.insert(40);
                        ejemploDoble3Rev.insert(30);
                        ejemploDoble3Rev.insert(20);
                        ejemploDoble3Rev.insert(10);
                        ejemploDoble3Rev.display();
                        break;

                    case 6:
                        
                        
                        
                        System.out.println("\nStrings");
                        LinkedList ejemploCircular1 = new LinkedList(true, true);
                        System.out.println("Izquierda a derecha:");
                        ejemploCircular1.insert("A");
                        ejemploCircular1.insert("B");
                        ejemploCircular1.insert("C");
                        ejemploCircular1.insert("D");
                        ejemploCircular1.insert("E");
                        ejemploCircular1.display();
                        
                        LinkedList ejemploCircular1Rev = new LinkedList(true, true);
                        System.out.println("Derecha a izquierda:");
                        ejemploCircular1Rev.insert("E");
                        ejemploCircular1Rev.insert("D");
                        ejemploCircular1Rev.insert("C");
                        ejemploCircular1Rev.insert("B");
                        ejemploCircular1Rev.insert("A");
                        ejemploCircular1Rev.display();

                        
                        System.out.println("\nDecimales");
                        LinkedList ejemploCircular2 = new LinkedList(true, true);
                        System.out.println("Izquierda a derecha:");
                        ejemploCircular2.insert(11.11);
                        ejemploCircular2.insert(22.22);
                        ejemploCircular2.insert(33.33);
                        ejemploCircular2.insert(44.44);
                        ejemploCircular2.insert(55.55);
                        ejemploCircular2.display();
                        
                        LinkedList ejemploCircular2Rev = new LinkedList(true, true);
                        System.out.println("Derecha a izquierda:");
                        ejemploCircular2Rev.insert(55.55);
                        ejemploCircular2Rev.insert(44.44);
                        ejemploCircular2Rev.insert(33.33);
                        ejemploCircular2Rev.insert(22.22);
                        ejemploCircular2Rev.insert(11.11);
                        ejemploCircular2Rev.display();

                        
                        System.out.println("\nEnteros");
                        LinkedList ejemploCircular3 = new LinkedList(true, true);
                        System.out.println("Izquierda a derecha:");
                        ejemploCircular3.insert(10);
                        ejemploCircular3.insert(20);
                        ejemploCircular3.insert(30);
                        ejemploCircular3.insert(40);
                        ejemploCircular3.insert(50);
                        ejemploCircular3.display();
                        
                        LinkedList ejemploCircular3Rev = new LinkedList(true, true);
                        System.out.println("Derecha a izquierda:");
                        ejemploCircular3Rev.insert(50);
                        ejemploCircular3Rev.insert(40);
                        ejemploCircular3Rev.insert(30);
                        ejemploCircular3Rev.insert(20);
                        ejemploCircular3Rev.insert(10);
                        ejemploCircular3Rev.display();
                        break;

                    case 7:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }

                if (lista != null && opcion >= 1 && opcion <= 3) {
                    int opcionOperaciones;
                    do {
                        System.out.println("\nOPERACIONES CON LA LISTA:");
                        System.out.println("1. Insertar contacto");
                        System.out.println("2. Mostrar lista");
                        System.out.println("3. Eliminar elemento");
                        System.out.println("4. Buscar elemento");
                        System.out.println("5. Volver al menú principal");
                        System.out.print("Selección: ");

                        opcionOperaciones = sc.nextInt();
                        sc.nextLine();

                        switch (opcionOperaciones) {
                            case 1:
                                System.out.print("Nombre del contacto: ");
                                String nombre = sc.nextLine();

                                String tel;
                                while (true) {
                                    System.out.print("Teléfono (solo números): ");
                                    tel = sc.nextLine();
                                    if (tel.matches("\\d+"))
                                        break;
                                    System.out.println("Teléfono inválido, ingrese solo números.");
                                }

                                System.out.print("Dirección: ");
                                String direccion = sc.nextLine();

                                lista.insert(new Contacto(nombre, tel, direccion));
                                System.out.println("Contacto agregado correctamente.");
                                break;

                            case 2:
                                lista.display();
                                break;

                            case 3:
                                System.out.print("Elemento a eliminar: ");
                                String elemEliminar = sc.nextLine();
                                boolean eliminado = lista.delete(elemEliminar);
                                if (eliminado) {
                                    System.out.println("Elemento eliminado.");
                                } else {
                                    System.out.println("Elemento no encontrado.");
                                }
                                break;

                            case 4:
                                System.out.print("Elemento a buscar: ");
                                String elemBuscar = sc.nextLine();
                                boolean encontrado = lista.search(elemBuscar);
                                if (encontrado) {
                                    System.out.println("Elemento encontrado.");
                                } else {
                                    System.out.println("Elemento no encontrado.");
                                }
                                break;

                            case 5:
                                System.out.println("Volviendo al menú principal...");
                                break;

                            default:
                                System.out.println("Opción inválida.");
                        }
                    } while (opcionOperaciones != 5);
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida, ingrese un número.");
                sc.nextLine();
            }
        } while (opcion != 7);

        sc.close();
    }
}