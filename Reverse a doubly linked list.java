// Complete the reverse function below.

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
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {

        if(head == null){
            return head;
        }

        else{
            DoublyLinkedListNode aux = head;
            DoublyLinkedListNode nuevo = head;
            

            while(aux != null){

                DoublyLinkedListNode ant = aux.prev;
                aux.prev = aux.next;
                aux.next = ant;

                nuevo = aux;
                aux = aux.prev;
            }

            return nuevo;
        }
    }

