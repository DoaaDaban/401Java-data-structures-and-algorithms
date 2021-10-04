package linkedList;

public class LinkedList {

   private Node head;

   public LinkedList(){

       head= null;
   }

    public void insert(String value){
       Node newNode= new Node(value);
       if(head == null){
           head= newNode;
       }
       else {
          newNode.setNext(head);
          head= newNode;
       }
    }

    public Boolean includes(String value){
       Node current= head;
       while (current!=null){
           if(current.getData()==value){
               return true;
           }
               current= current.getNext();
       }
        return false;
    }

    @Override
    public String toString() {
       Node current = head;
       String sortedList="";
       while (current!=null){
           sortedList = sortedList + "{" + current.getData() + "} -> " ;
           current = current.getNext();
       }
       sortedList = sortedList + "NULL";
        return sortedList;
    }


    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    //=====================================CC6====================

   public  void append(String value){
   Node newNode= new Node(value);

   if(head==null){
       head=newNode;
   }else {
       Node current= head;
       while (current.getNext()!=null){
           current= current.getNext();
       }
       current.setNext(newNode);
   }
  }

  public void insertBefore(String value, String newValue){
       Node newNode= new Node(newValue);
       if(head==null){
           head=newNode;
       }else if(head.getData()==value){
           newNode.setNext(head);
           head=newNode;
       }else {
           Node current =head;
           while (current !=null){
               if (current.getNext().getData()==value){
                   newNode.setNext(current.getNext());
                   current.setNext(newNode);
                   break;
               }
               current =current.getNext();
           }
       }

  }

    public void insertAfter (String value, String newValue) {
        Node newNode = new Node(newValue);
        Node current = head;
        while (current != null) {
            if (current.getData() == value) {
                newNode.setNext(current.getNext());
                current.setNext(newNode);
                break;
            }
            current = current.getNext();
        }
    }
// ===========================CC7===================


    /* Function to get the
      nth node from end of list */
    boolean kthFromEnd(int k)
    {
        Node main_ptr = head;
        Node ref_ptr = head;

        int count = 0;
        if (head != null)
        {
            while (count < k)
            {
                if (ref_ptr == null)
                {
                    System.out.println(k
                            + " is greater than the no "
                            + " of nodes in the list");
                    return false;
                }
                ref_ptr = ref_ptr.getNext();
                count++;
            }

            if(ref_ptr == null)
            {

                if(head != null)
                    System.out.println("Node no. " + k +
                            " from last is " +
                            head.getData());
            }
            else
            {

                while (ref_ptr != null)
                {
                    main_ptr = main_ptr.getNext();
                    ref_ptr = ref_ptr.getNext();
                }
                System.out.println("Node no. " + k +
                        " from last is " +
                        main_ptr.getData());
            }
        }
        return false;
    }


}
