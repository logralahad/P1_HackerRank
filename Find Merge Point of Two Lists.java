 // Complete the findMergeNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        SinglyLinkedListNode aux1 = head1;
        SinglyLinkedListNode aux2 = head2;

        while(aux1 != aux2){

            if(aux1.next == null){
                aux1 = head2;
            }else{
                aux1 = aux1.next;
            }

            if(aux2.next == null){
                aux2 = head1;
            }else{
                aux2 = aux2.next;
            }

        }

        return aux1.data;

    }

