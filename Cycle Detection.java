  // Complete the hasCycle function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean hasCycle(SinglyLinkedListNode head) {
        
        if(head == null) return false;  // si el inicio es nulo, entonces está vacía y retorna falso

        
        SinglyLinkedListNode ant = head; // declaramos un nodo anterior en el inicio de la lista
        SinglyLinkedListNode aux = head.next;  // declaramos un nodo auxiliar en el nodo siguiente al inicio de la lista

        while(aux != null && aux.next != null){  // mientras no llegue a nulo

            if(ant == aux){   // si el dato del nodo anterior es el mismo al de auxiliar, regresa verdadero
                return true;
            }

            ant = ant.next;  // avanza al siguiente del nodo anterior
            aux = aux.next.next;  // avanza dos nodos hacia adelante del nodo auxiliar
        }

        return false;  // si no se cumplió, regresa falso
    }
