 // Complete the sortedInsert function below.

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
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {

        DoublyLinkedListNode nuevo = new DoublyLinkedListNode(data);   // creamos el nuevo nodo con dato como valor

        DoublyLinkedListNode aux = head;  // inicializamos un nuevo nodo que apunte al inicio
        DoublyLinkedListNode ant = null; // inicializamos un nuevo nodo

        if(nuevo.data <= head.data){  // si el valor del nuevo nodo es menor o igual a la cabeza
            nuevo.next = head;  // lo hacemos nuestra nueva cabeza
            return nuevo;  // regresamos el nuevo nodo
        }

        else{
            while(aux != null && aux.data < nuevo.data){  // si no, mientras auxiliar no sea nulo y el valor del nuevo nodo sea mayor a auxiliar
                ant = aux;  // movemos anterior a donde estaba auxiliar
                aux = aux.next;  // auxiliar lo movemos al nodo siguiente
            }

            ant.next = nuevo;  // conectamos el nodo anterior con el nuevo nodo
            nuevo.next = aux; // conectamos el nuevo nodo con auxiliar
            return head;  // regresamos el inicio
        }

    }

