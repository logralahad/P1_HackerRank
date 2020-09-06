

    // Complete the printLinkedList function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void printLinkedList(SinglyLinkedListNode head) {

        SinglyLinkedListNode aux = head;  // inicializamos un nodo auxiliar que apunte al inicio
        
        while(aux != null){  // mientras no lleguemos al fin de la lista
            System.out.println(aux.data);  // imprimimos el valor de ese nodo
            aux = aux.next;  // auxiliar lo movemos al siguiente nodo
        }


    }

