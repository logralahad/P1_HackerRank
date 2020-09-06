 // Complete the findMergeNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        SinglyLinkedListNode aux1 = head1;  // inicializamos un nodo auxiliar que apunte al inicio de la lista 1
        SinglyLinkedListNode aux2 = head2;  // inicializamos un nodo auxiliar que apunte al inicio de la lista 2

        while(aux1 != aux2){  // si son diferentes

            if(aux1.next == null){  // y no hay un nodo después
                aux1 = head2;  // auxiliar1 lo volvemos la cabeza de la lista 2
            }else{
                aux1 = aux1.next;  // si no, avanzamos al siguiente nodo
            }

            if(aux2.next == null){  // si no hay un nodo después del auxiliar2
                aux2 = head1; // auxiliar2 lo volvemos la cabeza de la lista 1
            }else{
                aux2 = aux2.next; // si no, avanzamos al siguiente nodo
            }

        }

        return aux1.data;  // regresamos el dato del nodo auxiliar1

    }

