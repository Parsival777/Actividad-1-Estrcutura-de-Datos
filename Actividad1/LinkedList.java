public class LinkedList {
    Node head;
    boolean isDoubly, isCircular;

    public LinkedList(boolean isDoubly, boolean isCircular) {
        this.isDoubly = isDoubly;
        this.isCircular = isCircular;
    }

    public void insert(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            if (isCircular)
                newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != null && (!isCircular || temp.next != head))
                temp = temp.next;
            temp.next = newNode;
            if (isDoubly)
                newNode.prev = temp;
            if (isCircular)
                newNode.next = head;
        }
    }

    public boolean delete(Object data) {
        if (head == null)
            return false;

        Node current = head, prev = null;
        do {
            if (compareData(current.data, data)) {
                if (current == head) {
                    head = head.next;
                    if (isCircular && head != null) {
                        Node last = head;
                        while (last.next != current)
                            last = last.next;
                        last.next = head;
                        if (isDoubly)
                            head.prev = last;
                    }
                } else {
                    prev.next = current.next;
                    if (isDoubly && current.next != null)
                        current.next.prev = prev;
                }
                return true;
            }
            prev = current;
            current = current.next;
        } while (current != null && (!isCircular || current != head));

        return false;
    }

    public boolean search(Object data) {
        if (head == null)
            return false;

        Node temp = head;
        do {
            if (compareData(temp.data, data))
                return true;
            temp = temp.next;
        } while (temp != null && (!isCircular || temp != head));

        return false;
    }

    private boolean compareData(Object listData, Object searchData) {
        
        String searchStr = searchData.toString().toLowerCase();
        String listStr = listData.toString().toLowerCase();

        
        if (listData instanceof Main.Contacto) {
            Main.Contacto contacto = (Main.Contacto) listData;
            return contacto.nombre.toLowerCase().contains(searchStr) ||
                   contacto.telefono.toLowerCase().contains(searchStr) ||
                   contacto.direccion.toLowerCase().contains(searchStr) ||
                   listStr.contains(searchStr);
        }

        
        if (listData instanceof Number && searchData instanceof String) {
            try {
                double listValue = ((Number) listData).doubleValue();
                double searchValue = Double.parseDouble(searchStr);
                return listValue == searchValue;
            } catch (NumberFormatException e) {
                return false;
            }
        }

        
        return listStr.contains(searchStr);
    }

    public void display() {
        if (head == null) {
            System.out.println("Lista vacía.");
            return;
        }

        System.out.println("\nContenido de la lista:");
        Node temp = head;
        boolean isFirstNode = true;

        do {
            if (!isFirstNode) {
                if (isCircular) {
                    System.out.print(" ↻ ");
                } else if (isDoubly) {
                    System.out.print(" <-> ");
                } else {
                    System.out.print(" -> ");
                }
            }

            System.out.print(temp.data);
            temp = temp.next;
            isFirstNode = false;
        } while (temp != null && (!isCircular || temp != head));

        if (isCircular) {
            System.out.print(" ↻");
        }

        System.out.println();
    }

    public boolean isDoubly() {
        return isDoubly;
    }

    public boolean isCircular() {
        return isCircular;
    }
}