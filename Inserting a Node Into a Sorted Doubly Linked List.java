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

        DoublyLinkedListNode nuevo = new DoublyLinkedListNode(data);

        DoublyLinkedListNode aux = head;
        DoublyLinkedListNode ant = null;

        if(nuevo.data <= head.data){
            nuevo.next = head;
            return nuevo;
        }

        else{
            while(aux != null && aux.data < nuevo.data){
                ant = aux;
                aux = aux.next;
            }

            ant.next = nuevo;
            nuevo.next = aux;
            return head;
        }

    }

