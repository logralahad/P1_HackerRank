 // Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
       

        if(head1 == null) return head2;  // Si no hay nada en la lista uno, regresamos la cabeza de la lista 2 

        else if(head2 == null) return head1;  // Si no hay nada en la lista dos, regresamos la cabeza de la lista 1

        else{

            SinglyLinkedListNode head3 = null ;  // creamos una nueva cabeza

            if(head1.data < head2.data){  //  si el valor de la cabeza de la lista 1 es menor al de la cabeza de la lista 2
                head3 = head1;  // la nueva cabeza toma ese valor
                head1 = head1.next;  // y movemos la cabeza al siguiente nodo
            } else{
                head3 = head2;  // si no, la cabeza toma el valor del otro nodo
                head2 = head2.next;  // y ese otro nodo lo movemos a su siguiente nodo
            }

            SinglyLinkedListNode aux = head3;  // de ahi, creamos un nodo auxiliar que apunte a esta nueva cabeza

            while(head1 != null && head2 != null){  // mientras ambas listas no lleguen a su fin

                if(head1.data < head2.data){   //  si el valor de la cabeza de la lista 1 es menor al de la cabeza de la lista 2
                    aux.next = head1;  // conectamos auxiliar a la cabeza de la lista 1
                    head1 = head1.next;  // y la cabeza de la lista 1 la movemos al siguiente nodo
                } else{
                    aux.next = head2;  // si no, conectamos a la cabeza de la lista 2
                    head2 = head2.next;  // y la cabeza de la lista 2 la movemos al siguiente nodo
                }

                aux = aux.next;  // avanzamos a auxiliar a la siguiente lista
            }

            if(head1 == null){  // si la cabeza de la lista 1 es nula
                aux.next = head2;  // conectamos auxiliar a la cabeza de la lista 2
            }else{
                aux.next = head1;  // si no, conectamos auxiliar a esa cabeza
            }

            return head3;  // regresamos la nueva cabeza

        }

    }
