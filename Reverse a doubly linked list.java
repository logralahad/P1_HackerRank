// Complete the reverse function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {

        if(head == null){  // si la lista está vacía
            return head;  // regresamos el inicio
        }

        else{
            DoublyLinkedListNode aux = head;  // inicializamos un nodo auxiliar que apunte al inicio
            DoublyLinkedListNode nuevo = head;   // inicializamos un nodo nuevo que apunte al inicio
            

            while(aux != null){  // mientras no lleguemos al final

                DoublyLinkedListNode ant = aux.prev;  // un nodo anterior guarda el nodo antes de auxiliar
                aux.prev = aux.next;  // ese nodo anterior lo volvemos el nodo siguiente
                aux.next = ant;  // el nodo siguiente se vuelve el anterior

                nuevo = aux;  // el nuevo nodo se vuelve el nodo auxiliar
                aux = aux.prev;  // y avanzamos el nodo auxiliar
            }

            return nuevo;  // regresamos el nuevo nodo
        }
    }

