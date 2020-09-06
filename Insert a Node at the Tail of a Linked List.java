 // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode aux = head;  // inicializamos un nodo auxiliar que apunte al inicio

            if(aux == null){  // si ese nodo es nulo
                head = new SinglyLinkedListNode(data);  // convertimos en nuestra nueva cabeza al nuevo nodo
                return head;  // regresamos el inicio
            }
            else{
                while(aux.next != null){  // si hay un nodo siguiente
                    aux = aux.next;  // nos movemos hacia ese nodo
                }

                aux.next = new SinglyLinkedListNode(data);  // si llegamos al final, este nodo siguiente tomará el valor del nuevo nodo
            }
        return head;  // regresamos el inicio
    }
