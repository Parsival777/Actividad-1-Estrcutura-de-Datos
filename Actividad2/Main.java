import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList lista = null;
        Pila pila = null;
        Cola cola = null;

        int opcion = 0;
        do {
            try {
                System.out.println("\n=== MENU PRINCIPAL ===");
                System.out.println("1. Lista Simple");
                System.out.println("2. Lista Doble");
                System.out.println("3. Lista Circular");
                System.out.println("4. Pila");
                System.out.println("5. Cola");
                System.out.println("6. Ejemplos de Listas");
                System.out.println("7. Salir");
                System.out.print("\nSeleccion: ");

                
                while (!sc.hasNextInt()) {
                    System.out.println("Error: Debe ingresar un número entero entre 1 y 7.");
                    System.out.print("Por favor, ingrese una opción válida: ");
                    sc.next(); 
                }
                
                opcion = sc.nextInt();
                sc.nextLine(); 

                
                if (opcion < 1 || opcion > 7) {
                    System.out.println("Error: Opción fuera de rango. Debe ser entre 1 y 7.");
                    continue; 
                }

                switch (opcion) {
                    case 1:
                        lista = new LinkedList(false, false);
                        pila = null;
                        cola = null;
                        System.out.println("Lista Simple creada exitosamente.");
                        break;
                    case 2:
                        lista = new LinkedList(true, false);
                        pila = null;
                        cola = null;
                        System.out.println("Lista Doble creada exitosamente.");
                        break;
                    case 3:
                        lista = new LinkedList(true, true);
                        pila = null;
                        cola = null;
                        System.out.println("Lista Circular creada exitosamente.");
                        break;
                    case 4:
                        pila = new Pila();
                        lista = null;
                        cola = null;
                        System.out.println("Pila creada exitosamente.");
                        break;
                    case 5:
                        cola = new Cola();
                        lista = null;
                        pila = null;
                        System.out.println("Cola creada exitosamente.");
                        break;
                    case 6:
                        mostrarMenuEjemplosListas(sc);
                        break;
                    case 7:
                        System.out.println("Saliendo del programa...");
                        break;
                }

                if ((lista != null || pila != null || cola != null) && opcion >= 1 && opcion <= 5) {
                    manejarOperacionesEstructura(sc, lista, pila, cola);
                }
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
                sc.nextLine(); 
            }
        } while (opcion != 7);

        sc.close();
    }

    private static int validarOpcionMenu(Scanner sc, int min, int max) {
        while (true) {
            try {
                
                while (!sc.hasNextInt()) {
                    System.out.println("Error: Debe ingresar un número entero.");
                    System.out.print("Por favor ingrese una opción válida: ");
                    sc.next(); 
                }
                
                int opcion = sc.nextInt();
                sc.nextLine(); 
                
                if (opcion >= min && opcion <= max) {
                    return opcion;
                } else {
                    System.out.println("Error: Opción fuera de rango. Debe ser entre " + min + " y " + max + ".");
                    System.out.print("Por favor ingrese una opción válida: ");
                }
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
                sc.nextLine(); 
            }
        }
    }

    private static void mostrarMenuEjemplosListas(Scanner sc) {
        int opcionEjemplos;
        do {
            try {
                System.out.println("\n=== MENU DE EJEMPLOS DE LISTAS ===");
                System.out.println("1. Strings");
                System.out.println("2. Decimales");
                System.out.println("3. Enteros");
                System.out.println("4. Todos los ejemplos");
                System.out.println("5. Volver al menu principal");
                System.out.print("Seleccion: ");

                opcionEjemplos = validarOpcionMenu(sc, 1, 5);

                switch (opcionEjemplos) {
                    case 1:
                        mostrarEjemplosStrings();
                        break;
                    case 2:
                        mostrarEjemplosDecimales();
                        break;
                    case 3:
                        mostrarEjemplosEnteros();
                        break;
                    case 4:
                        mostrarTodosLosEjemplos();
                        break;
                    case 5:
                        System.out.println("Volviendo al menu principal...");
                        break;
                }

            } catch (Exception e) {
                System.out.println("Error inesperado en menu de ejemplos: " + e.getMessage());
                sc.nextLine();
                opcionEjemplos = 5;
            }
        } while (opcionEjemplos != 5);
    }

    private static void mostrarEjemplosStrings() {
        System.out.println("\n=== EJEMPLOS DE STRINGS ===");
        
        
        System.out.println("\nStrings - Lista Simple:");
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

        
        System.out.println("\nStrings - Lista Doble:");
        LinkedList ejemploDoble1 = new LinkedList(true, false);
        System.out.println("Izquierda a derecha:");
        ejemploDoble1.insert("A");
        ejemploDoble1.insert("B");
        ejemploDoble1.insert("C");
        ejemploDoble1.insert("D");
        ejemploDoble1.insert("E");
        ejemploDoble1.display();

        LinkedList ejemploDoble1Rev = new LinkedList(true, false);
        System.out.println("Derecha a izquierda:");
        ejemploDoble1Rev.insert("E");
        ejemploDoble1Rev.insert("D");
        ejemploDoble1Rev.insert("C");
        ejemploDoble1Rev.insert("B");
        ejemploDoble1Rev.insert("A");
        ejemploDoble1Rev.display();

        
        System.out.println("\nStrings - Lista Circular:");
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
    }

    private static void mostrarEjemplosDecimales() {
        System.out.println("\n=== EJEMPLOS DE DECIMALES ===");
        
        
        System.out.println("\nDecimales - Lista Simple:");
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

        
        System.out.println("\nDecimales - Lista Doble:");
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

        
        System.out.println("\nDecimales - Lista Circular:");
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
    }

    private static void mostrarEjemplosEnteros() {
        System.out.println("\n=== EJEMPLOS DE ENTEROS ===");
        
        
        System.out.println("\nEnteros - Lista Simple:");
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

        
        System.out.println("\nEnteros - Lista Doble:");
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

        
        System.out.println("\nEnteros - Lista Circular:");
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
    }

    private static void mostrarTodosLosEjemplos() {
        mostrarEjemplosStrings();
        mostrarEjemplosDecimales();
        mostrarEjemplosEnteros();
        System.out.println("\nTodos los ejemplos de listas mostrados exitosamente.");
    }

    private static void manejarOperacionesEstructura(Scanner sc, LinkedList lista, Pila pila, Cola cola) {
        int opcionOperaciones;
        do {
            try {
                System.out.println("\n=== OPERACIONES ===");

                if (lista != null) {
                    System.out.println("OPERACIONES CON LISTA:");
                    System.out.println("1. Insertar contacto");
                    System.out.println("2. Mostrar lista");
                    System.out.println("3. Eliminar elemento");
                    System.out.println("4. Buscar elemento");
                } else if (pila != null) {
                    System.out.println("OPERACIONES CON PILA:");
                    System.out.println("1. Push (Agregar)");
                    System.out.println("2. Pop (Remover)");
                    System.out.println("3. Peek (Ver tope)");
                    System.out.println("4. Mostrar pila");
                    System.out.println("5. Tamano de la pila");
                } else if (cola != null) {
                    System.out.println("OPERACIONES CON COLA:");
                    System.out.println("1. Enqueue (Agregar)");
                    System.out.println("2. Dequeue (Remover)");
                    System.out.println("3. Peek (Ver frente)");
                    System.out.println("4. Mostrar cola");
                    System.out.println("5. Tamano de la cola");
                }

                System.out.println("6. Volver al menu principal");
                System.out.print("Seleccion: ");

                opcionOperaciones = validarOpcionMenu(sc, 1, 6);

                if (lista != null) {
                    manejarOperacionesLista(sc, lista, opcionOperaciones);
                } else if (pila != null) {
                    manejarOperacionesPila(sc, pila, opcionOperaciones);
                } else if (cola != null) {
                    manejarOperacionesCola(sc, cola, opcionOperaciones);
                }

            } catch (Exception e) {
                System.out.println("Error inesperado en operaciones: " + e.getMessage());
                sc.nextLine();
                opcionOperaciones = 6;
            }
        } while (opcionOperaciones != 6);
    }

    private static void manejarOperacionesLista(Scanner sc, LinkedList lista, int opcion) {
        try {
            switch (opcion) {
                case 1:
                    String nombre = "";
                    while (nombre.trim().isEmpty()) {
                        System.out.print("Nombre del contacto: ");
                        nombre = sc.nextLine();
                        if (nombre.trim().isEmpty()) {
                            System.out.println("Error: El nombre no puede estar vacío.");
                        }
                    }

                    String tel = "";
                    while (true) {
                        System.out.print("Teléfono (solo números): ");
                        tel = sc.nextLine();
                        if (tel.matches("\\d+")) {
                            break;
                        }
                        System.out.println("Error: Teléfono inválido. Debe contener solo números.");
                    }

                    String direccion = "";
                    while (direccion.trim().isEmpty()) {
                        System.out.print("Dirección: ");
                        direccion = sc.nextLine();
                        if (direccion.trim().isEmpty()) {
                            System.out.println("Error: La dirección no puede estar vacía.");
                        }
                    }

                    
                    try {
                        Class<?> contactoClass = Class.forName("DataTypeExamples$Contacto");
                        Object contacto = contactoClass.getDeclaredConstructor(String.class, String.class, String.class)
                                .newInstance(nombre, tel, direccion);
                        lista.insert(contacto);
                        System.out.println("Contacto agregado exitosamente.");
                    } catch (Exception e) {
                        System.out.println("Error: No se pudo crear el contacto. " + e.getMessage());
                        
                        DataTypeExamples.Contacto contacto = new DataTypeExamples.Contacto(nombre, tel, direccion);
                        lista.insert(contacto);
                        System.out.println("Contacto agregado usando método alternativo.");
                    }
                    break;

                case 2:
                    if (lista.head == null) {
                        System.out.println("La lista está vacía.");
                    } else {
                        lista.display();
                    }
                    break;

                case 3:
                    if (lista.head == null) {
                        System.out.println("Error: No se puede eliminar. La lista está vacía.");
                        break;
                    }
                    System.out.print("Elemento a eliminar: ");
                    String elemEliminar = sc.nextLine();
                    if (elemEliminar.trim().isEmpty()) {
                        System.out.println("Error: Debe especificar un elemento para eliminar.");
                        break;
                    }
                    boolean eliminado = lista.delete(elemEliminar);
                    if (eliminado) {
                        System.out.println("Elemento eliminado exitosamente.");
                    } else {
                        System.out.println("Elemento no encontrado en la lista.");
                    }
                    break;

                case 4:
                    if (lista.head == null) {
                        System.out.println("Error: No se puede buscar. La lista está vacía.");
                        break;
                    }
                    System.out.print("Elemento a buscar: ");
                    String elemBuscar = sc.nextLine();
                    if (elemBuscar.trim().isEmpty()) {
                        System.out.println("Error: Debe especificar un elemento para buscar.");
                        break;
                    }
                    boolean encontrado = lista.search(elemBuscar);
                    if (encontrado) {
                        System.out.println("Elemento encontrado en la lista.");
                    } else {
                        System.out.println("Elemento no encontrado en la lista.");
                    }
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error durante la operación: " + e.getMessage());
        }
    }

    private static void manejarOperacionesPila(Scanner sc, Pila pila, int opcion) {
        try {
            switch (opcion) {
                case 1: 
                    String elementoPush = "";
                    while (elementoPush.trim().isEmpty()) {
                        System.out.print("Elemento a agregar: ");
                        elementoPush = sc.nextLine();
                        if (elementoPush.trim().isEmpty()) {
                            System.out.println("Error: No se puede agregar un elemento vacío.");
                        }
                    }
                    pila.push(elementoPush);
                    System.out.println("Elemento agregado a la pila exitosamente.");
                    break;

                case 2: 
                    if (pila.isEmpty()) {
                        System.out.println("Error: No se puede realizar pop. La pila está vacía.");
                        break;
                    }
                    Object elementoPop = pila.pop();
                    if (elementoPop != null) {
                        System.out.println("Elemento removido: " + elementoPop);
                    } else {
                        System.out.println("Error: No se pudo remover el elemento.");
                    }
                    break;

                case 3: 
                    if (pila.isEmpty()) {
                        System.out.println("Error: No se puede realizar peek. La pila está vacía.");
                        break;
                    }
                    Object elementoTope = pila.peek();
                    if (elementoTope != null) {
                        System.out.println("Tope de la pila: " + elementoTope);
                    } else {
                        System.out.println("Error: No se pudo obtener el tope de la pila.");
                    }
                    break;

                case 4: 
                    if (pila.isEmpty()) {
                        System.out.println("La pila está vacía.");
                    } else {
                        pila.display();
                    }
                    break;

                case 5: 
                    System.out.println("Tamaño de la pila: " + pila.size());
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error durante la operación de pila: " + e.getMessage());
        }
    }

    private static void manejarOperacionesCola(Scanner sc, Cola cola, int opcion) {
        try {
            switch (opcion) {
                case 1: 
                    String elementoEnqueue = "";
                    while (elementoEnqueue.trim().isEmpty()) {
                        System.out.print("Elemento a agregar: ");
                        elementoEnqueue = sc.nextLine();
                        if (elementoEnqueue.trim().isEmpty()) {
                            System.out.println("Error: No se puede agregar un elemento vacío.");
                        }
                    }
                    cola.enqueue(elementoEnqueue);
                    System.out.println("Elemento agregado a la cola exitosamente.");
                    break;

                case 2: 
                    if (cola.isEmpty()) {
                        System.out.println("Error: No se puede realizar dequeue. La cola está vacía.");
                        break;
                    }
                    Object elementoDequeue = cola.dequeue();
                    if (elementoDequeue != null) {
                        System.out.println("Elemento removido: " + elementoDequeue);
                    } else {
                        System.out.println("Error: No se pudo remover el elemento.");
                    }
                    break;

                case 3: 
                    if (cola.isEmpty()) {
                        System.out.println("Error: No se puede realizar peek. La cola está vacía.");
                        break;
                    }
                    Object elementoFrente = cola.peek();
                    if (elementoFrente != null) {
                        System.out.println("Frente de la cola: " + elementoFrente);
                    } else {
                        System.out.println("Error: No se pudo obtener el frente de la cola.");
                    }
                    break;

                case 4: 
                    if (cola.isEmpty()) {
                        System.out.println("La cola está vacía.");
                    } else {
                        cola.display();
                    }
                    break;

                case 5: 
                    System.out.println("Tamaño de la cola: " + cola.size());
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error durante la operación de cola: " + e.getMessage());
        }
    }
}