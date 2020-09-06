 // Complete the removeDuplicates function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        SinglyLinkedListNode aux = head;  // inicializamos un nodo que apunte al inicio
        SinglyLinkedListNode ant = null;  // inicializamos con nulo un nodo anterior

        if(head.next == null){  // si el inicio no tiene nodos siguientes
            return head;  // regresamos la cabeza
        }
        else{

            while(aux.next != null){   // mientras tengamos un nodo siguiente
                ant = aux;   // movemos anterior a donde está auxiliar
                aux = aux.next;  // movemos auxiliar al nodo siguiente

                while(aux.data == ant.data){  // si los datos de ambos nodos son iguales
                    if(aux.next == null){  // y no hay nodo siguiente
                        aux = null;  // auxiliar lo volvemos nulo
                        ant.next = aux;  // conectamos el nodo anterior con el auxiliar
                        return head;  // regresamos la cabeza
                    }
                    aux = aux.next;  // si no, que avance al nodo siguiente
                }

            ant.next = aux;  // conectamos el nodo anterior con auxiliar

            }
        }

        return head;
    }
