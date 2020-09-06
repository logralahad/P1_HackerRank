 // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode aux = head;  

            if(aux == null){
                head = new SinglyLinkedListNode(data);
                return head;
            }
            else{
                while(aux.next != null){
                    aux = aux.next;
                }

                aux.next = new SinglyLinkedListNode(data);
            }
        return head;
    }