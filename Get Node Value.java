// Complete the getNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        SinglyLinkedListNode aux = head;   // inicializamos un nodo auxiliar al inicio de la lista
        int pos_tail = 0;  // creamos un contador de posiciones
        int value = 0;  // creamos el valor a comparar

        while(aux.next != null){   // si hay un nodo siguiente
            aux = aux.next;  // avanzamos a ese nodo
            pos_tail++;  // al contador le sumamos uno
        }

        if(positionFromTail == 0){  // si nuestra posición es el final
            value = aux.data;  // el nuevo valor es el de auxiliar
        }
        else{
            aux = head;  // si no, auxiliar lo movemos al inicio
            pos_tail -= positionFromTail;   // a la posicion desde el inicio le restamos la posicion desde la cola
            while(pos_tail != 0 && aux.next != null){  // mientras la posicion desde la cola no sea 0 y haya un nodo siguiente
                aux = aux.next;  // nos movemos al siguiente nodo
                pos_tail--;  // y le quitamos uno a la posicion desde la cola
            }
            value = aux.data;  // el nuevo valor será el valor de auxiliar
        }
        return value;  // regresamos ese nuevo valor
    }
