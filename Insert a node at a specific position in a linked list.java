// Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        
        SinglyLinkedListNode nuevo = new SinglyLinkedListNode(data);  // creamos el nuevo nodo con dato como valor

        if(head == null){ // si la lista está vacía
            head = new SinglyLinkedListNode(data); // el nuevo nodo será nuestra cabeza
            return head;
        }
        else{
            SinglyLinkedListNode ant = null;  // inicializamos un nodo anterior a nulo
            SinglyLinkedListNode aux = head;  // inicializamos un nodo auxiliar que apunte a inicio


            while(aux != null && position > 0){ // mientras no hayamos llegado a la posicion y auxiliar no sea nulo
                ant = aux; // anterior lo movemos a donde estaba auxiliar
                aux = aux.next; // auxiliar lo avanzamos un nodo siguiente
                position--;  // le quitamos uno a la posicion
            }
            ant.next = nuevo;  // conectamos el nodo anterior con el nuevo nodo
            nuevo.next = aux;  // conectamos el nuevo nodo a auxiliar
        }
        return head;

    }
