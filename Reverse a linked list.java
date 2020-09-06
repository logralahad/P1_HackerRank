// Complete the reverse function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {

        if(head.next == null){
            return head;
        }

        else{

            SinglyLinkedListNode aux = head;
            SinglyLinkedListNode ant = null;
            SinglyLinkedListNode top = null;


            while(aux != null){
                ant = aux;
                aux = aux.next;
            }

            aux = head;
            head = ant;
            top = aux;


            do{

                while(aux.next != null && aux.next != ant ){
                    aux = aux.next;
                }

                if(head.next == null){
                    aux.next = null;
                    head.next = aux;
                    ant = head.next;
                }else{
                    aux.next = null;
                    ant.next = aux;
                    ant = aux;
                }

                aux = top;
                
            }while(ant != top);

            return head;
        }
    }