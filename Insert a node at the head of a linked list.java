  // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        
        SinglyLinkedListNode aux = new SinglyLinkedListNode(data);  // creamos el nuevo nodo con dato como valor

        if(llist != null){ // si la lista no está vacia
            aux.next = llist;  // conectamos a nuestro nuevo nodo con la cabeza, siendo éste la nueva cabeza
            return aux; // regresamos el nuevo nodo (que es la nueva cabeza)
        }
        
        llist = new SinglyLinkedListNode(data);  /// si no, la cabeza será el nuevo nodo
        return llist;  // regresamos el inicio
    }
