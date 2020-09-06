// Complete the reverse function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {

        if(head.next == null){  // si la lista está vacía
            return head;  // regresamos la cabeza
        }

        else{

            SinglyLinkedListNode aux = head;   // inicializamos el nodo auxiliar al inicio
            SinglyLinkedListNode ant = null;  // inicializamos un nodo anterior
            SinglyLinkedListNode top = null;  // inicializamos un nodo top


            while(aux != null){   // mientras no lleguemos al final de la lista
                ant = aux;  // movemos el nodo anterior a donde estaba auxiliar
                aux = aux.next;  // movemos auxiliar al siguiente nodo
            }

            aux = head;  // auxiliar lo movemos a la cabeza
            head = ant;  // la cabeza será el nodo anterior
            top = aux;  //  y el nodo top será auxiliar, que es la cabeza


            do{
 
                while(aux.next != null && aux.next != ant ){  // mientras haya un nodo siguiente y ese nodo sea diferente a anterior
                    aux = aux.next;  // movemos auxiliar al siguiente nodo
                }

                if(head.next == null){  // si no hay otro nodo despues de la cabeza
                    aux.next = null;  // volvemos nulo al nodo siguiente de auxiliar
                    head.next = aux;  // conectamos la cabeza con auxiliar
                    ant = head.next;  // anterior lo hacemos el nodo siguiente a la cabeza
                }else{
                    aux.next = null;  // el nodo siguiente de auxiliar lo hacemos nulo
                    ant.next = aux;  // el nodo siguiente de anterior será auxiliar
                    ant = aux; // movemos auxiliar a donde estaba auxiliar
                }

                aux = top;  // auxiliar lo hacemos el nodo top
                
            }while(ant != top);  // todo mientras el nodo anterior sea diferente al nodo top

            return head;  // regresamos el nodo cabeza
        }
    }
