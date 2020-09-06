// Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        
        SinglyLinkedListNode nuevo = new SinglyLinkedListNode(data);

        if(head == null){
            head = new SinglyLinkedListNode(data);
            return head;
        }
        else{
            SinglyLinkedListNode ant = null;
            SinglyLinkedListNode aux = head;


            while(aux != null && position > 0){
                ant = aux;
                aux = aux.next;
                position--;
            }
            ant.next = nuevo;
            nuevo.next = aux;
        }
        return head;

    }