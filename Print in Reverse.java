  // Complete the reversePrint function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void reversePrint(SinglyLinkedListNode head) {

        if(head.next == null){   // si la lista solo tiene un nodo
            System.out.println(head.data);  // imprimimos el valor de ese único nodo
        }

        else{

            SinglyLinkedListNode aux = head;  // inicializamos un nodo auxiliar que apunte al inicio
            SinglyLinkedListNode ant = null;  // inicializamos un nodo anterior

            while(aux != null){  // mientras auxiliar no llegue al final
                ant = aux;  // anterior lo movemos a donde está auxiliar
                aux = aux.next;  // auxiliar lo movemos al nodo siguiente
            }

            System.out.println(ant.data); // imprimimos el dato del nodo anterior

            do{  
                aux = head;  // auxiliar lo regresamos al inicio
                while(aux.next != ant){  // mientras haya un nodo siguiente
                    aux = aux.next;  // lo movemos a ese siguiente nodo
                }

                ant = aux;  // el nodo anterior lo movemos a donde estaba auxiliar
                System.out.println(ant.data);  // imprimimos el valor de ese nodo
            }while(ant != head);  // todo mientras anterior sea diferente a la cabeza

        }
    }
