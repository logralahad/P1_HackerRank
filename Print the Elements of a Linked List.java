

    // Complete the printLinkedList function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void printLinkedList(SinglyLinkedListNode head) {

        SinglyLinkedListNode aux = head;
        
        while(aux != null){
            System.out.println(aux.data);
            aux = aux.next;
        }


    }

