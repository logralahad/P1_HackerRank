// Complete the compareLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode aux1 = head1;
        SinglyLinkedListNode aux2 = head2;
        
        if(head1.data != head2.data) return false;  // si el dato de la cabeza de la lista uno es diferente al de la cabeza de la lista 2, regresa falso
        else if(head1.next == null || head2.next == null) return false;  // si alguna de las dos listas están vacías, regresa falso
        else if(head1.next != null && head2.next != null){ // si no están vacias
            
            while(aux1 != null && aux2 != null){  //mientras no lleguen al fin de cada lista
                
                if(aux1.data != aux2.data) return false;  // si el dato de ambos nodos es diferente, regresa falso

                aux1 = aux1.next; // avanza al siguiente nodo de la lista 1
                aux2 = aux2.next; // avanza al siguiente nodo de la lista 2
                
            }
            return true;  // retorna verdadero
        }
        else return true;
        
    }
