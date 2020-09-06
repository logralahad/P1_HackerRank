  // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        
        SinglyLinkedListNode aux = new SinglyLinkedListNode(data);

        if(llist != null){
            aux.next = llist;
            return aux;
        }
        
        llist = new SinglyLinkedListNode(data);
        return llist;
    }