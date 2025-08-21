public class Pila {
    private LinkedList lista;

    public Pila() {
        this.lista = new LinkedList(false, false);
    }

    public void push(Object data) {
        lista.insert(data);
    }

    public Object pop() {
        if (isEmpty()) return null;
        
        Node current = lista.head;
        while (current.next != null) current = current.next;
        
        Object data = current.data;
        lista.delete(data);
        return data;
    }

    public Object peek() {
        if (isEmpty()) return null;
        
        Node current = lista.head;
        while (current.next != null) current = current.next;
        return current.data;
    }

    public boolean isEmpty() {
        return lista.head == null;
    }

    public void display() {
        int size = size();
        
        if (size == 0) {
            System.out.println("┌────────┐");
            System.out.println("│Pila vac│");
            System.out.println("└────────┘");
            return;
        }

        
        int maxWidth = 0;
        Node current = lista.head;
        while (current != null) {
            int width = current.data.toString().length();
            if (width > maxWidth) maxWidth = width;
            current = current.next;
        }
        maxWidth = Math.max(maxWidth, 4);

        
        String[] elementos = new String[size];
        current = lista.head;
        for (int i = 0; i < size; i++) {
            elementos[i] = current.data.toString();
            current = current.next;
        }

        
        System.out.println("┌" + "─".repeat(maxWidth) + "┐");
        
        for (int i = size - 1; i >= 0; i--) {
            String elem = elementos[i];
            String padded = String.format("%" + maxWidth + "s", elem).replace(' ', ' ');
            System.out.println("│" + padded + "│");
            
            if (i > 0) {
                System.out.println("├" + "─".repeat(maxWidth) + "┤");
            }
        }
        
        System.out.println("└" + "─".repeat(maxWidth) + "┘");
    }

    public int size() {
        int count = 0;
        Node current = lista.head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}