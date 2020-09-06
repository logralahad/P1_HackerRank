// Complete the deleteNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        
        if(position == 0){
            head = head.next;
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
            aux = aux.next;
            ant.next = aux;
        }
        return head;

    }