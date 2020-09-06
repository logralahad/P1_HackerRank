// Complete the getNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        SinglyLinkedListNode aux = head;
        int pos_tail = 0;
        int value = 0;

        while(aux.next != null){
            aux = aux.next;
            pos_tail++;
        }

        if(positionFromTail == 0){
            value = aux.data;
        }
        else{
            aux = head;
            pos_tail -= positionFromTail;
            while(pos_tail != 0 && aux.next != null){
                aux = aux.next;
                pos_tail--;
            }
            value = aux.data;
        }
        return value;
    }