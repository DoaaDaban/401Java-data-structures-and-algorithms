package linkedList;

public class LinkedList {

   private Node head;

   public LinkedList(){

       head= null;
   }

    public int size () {
        Node current;
        int count=0;
        current=head;
        while(current != null){
            count++;

            current=current.getNext();
        }
        return count;
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

    public Boolean insertAfter(int idx, String Data) {
        Node newNode = new Node(Data);
        if (head == null) {
            head = newNode;
            return true;
        } else {
            int idxCount = 0;
            Node current = head;
            while (current != null) {
                if (idxCount == idx) {
                    newNode.setNext(current.getNext());
                    current.setNext(newNode);
                    idxCount++;
                    break;
                }
                idxCount++;
                current = current.getNext();
            }
            return true;
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
// ===========================CC8===================

    //    ZIP THE TWO LINKED LIST LISTS TOGETHER INTO ONE LINKED LIST
    public static LinkedList zipLists(LinkedList list1, LinkedList list2) throws Exception {

        if (list1.size() == 0 && list2.size() == 0) {
            throw new Exception("You can't zip two empty lists");
        } else if (list1.size() == 0)
            return list2;
        else if (list2.size() == 0)
            return list1;
        else {
            Node current = list1.head;
            Node current2 = list2.head;
            int length1 = list1.size();
            int length2 = list2.size();
            int index = 0;

            while (current.getNext() != null) {
                list1.insertAfter(index, current2.getData());
                if (current2.getNext() == null)
                    break;
                else {
                    current2 = current2.getNext();
                    current = current.getNext().getNext();
                    index += 2;
                }
            }

            if (length2 >= length1)
                while (current2 != null) {
                    list1.append(current2.getData());
                    current2 = current2.getNext();
                }

            return list1;
        }
    }

}
