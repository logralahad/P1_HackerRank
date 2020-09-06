  // Complete the reversePrint function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void reversePrint(SinglyLinkedListNode head) {

        if(head.next == null){
            System.out.println(head.data);
        }

        else{

            SinglyLinkedListNode aux = head;
            SinglyLinkedListNode ant = null;

            while(aux != null){
                ant = aux;
                aux = aux.next;
            }

            System.out.println(ant.data);

            do{
                aux = head;
                while(aux.next != ant){
                    aux = aux.next;
                }

                ant = aux;
                System.out.println(ant.data);
            }while(ant != head);

        }
    }