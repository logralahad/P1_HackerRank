// Complete the compareLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode aux1 = head1;
        SinglyLinkedListNode aux2 = head2;
        
        if(head1.data != head2.data) return false;
        else if(head1.next == null || head2.next == null) return false;
        else if(head1.next != null && head2.next != null){
            
            while(aux1 != null && aux2 != null){
                
                if(aux1.data != aux2.data) return false;

                aux1 = aux1.next;
                aux2 = aux2.next;
                
            }
            return true;
        }
        else return true;
        
    }