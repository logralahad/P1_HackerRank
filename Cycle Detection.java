  // Complete the hasCycle function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean hasCycle(SinglyLinkedListNode head) {
        
        if(head == null) return false;

        
        SinglyLinkedListNode ant = head;
        SinglyLinkedListNode aux = head.next;

        while(aux != null && aux.next != null){

            if(ant == aux){
                return true;
            }

            ant = ant.next;
            aux = aux.next.next;
        }

        return false;
    }