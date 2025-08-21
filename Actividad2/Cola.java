public class Cola {
    private LinkedList lista;

    public Cola() {
        this.lista = new LinkedList(false, false); 
    }

    public void enqueue(Object data) {
        lista.insert(data);
    }

    public Object dequeue() {
        if (isEmpty()) {
            return null;
        }
        
        Object data = lista.head.data;
        lista.delete(data);
        return data;
    }

    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return lista.head.data;
    }

    public boolean isEmpty() {
        return lista.head == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("queue vacia");
            return;
        }

        System.out.print("frente → ");
        Node current = lista.head;
        while (current != null) {
            System.out.print("[" + current.data + "]");
            if (current.next != null) {
                System.out.print(" → ");
            }
            current = current.next;
        }
        System.out.println(" ← fin");
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