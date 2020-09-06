// Complete the deleteNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        
        if(position == 0){   // si el nodo está en la posición 0
            head = head.next;  // el inicio lo movemos al siguiente nodo
            return head;   // regresamos el inicio
        }
        else{
            SinglyLinkedListNode ant = null;   // inicializamos un nodo anterior a nulo
            SinglyLinkedListNode aux = head;  // inicializamos un nodo auxiliar que apunte al inicio de la lista


            while(aux != null && position > 0){  // mientras la posicion sea mayor a 0 y auxiliar no llegue a nulo
                ant = aux;  // anterior lo movemos a donde está auxiliar
                aux = aux.next;   // auxiliar lo movemos al nodo que está continuo de él
                position--;  // a posición le restamos uno
            }
            aux = aux.next;  // auxiliar lo movemos al nodo siguiente
            ant.next = aux;  // conectamos el nodo anterior con auxiliar
        }
        return head;  // regresamos el inicio

    }
