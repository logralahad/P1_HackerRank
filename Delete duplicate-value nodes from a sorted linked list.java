 // Complete the removeDuplicates function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        SinglyLinkedListNode aux = head;
        SinglyLinkedListNode ant = null;

        if(head.next == null){
            return head;
        }
        else{

            while(aux.next != null){
                ant = aux;
                aux = aux.next;

                while(aux.data == ant.data){
                    if(aux.next == null){
                        aux = null;
                        ant.next = aux;
                        return head;
                    }
                    aux = aux.next;
                }

            ant.next = aux;

            }
        }

        return head;
    }