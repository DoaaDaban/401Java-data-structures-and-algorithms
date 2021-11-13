package CC.linkedList;

import java.util.ArrayList;
import java.util.List;

public class LinkedList<T>{

    private Node<T> head;

    public LinkedList() {
    }

    public LinkedList(Node<T> head) {
        this.head = null;
    }

    public void insert(T value){
        Node<T> newNode= new Node<T>(value);
        if(head == null){
            head=newNode;
        }else{
            newNode.setNext(head);
            head= newNode;
        }
    }

    public Boolean include(T data){
        Node current= head;
        if(head==null){
            return false;
        }else{
            while (current!= null){
                if(current.getData() == data){
                    return true;
                }
                current= current.getNext();
            }
            }
        return false;
    }

    public String toString(){

        Node<T> current= head;
        String sortedString="";

        while (current!= null){
            sortedString= sortedString + "{" + current.getData() + "} -> ";
            current= current.getNext();
        }
        return sortedString + "Null";
    }

    public void append(T data){
        Node<T> newNode=new Node<>(data);
        Node current= head;
        if(head == null){
            head=newNode;
        }else {
                while (current.getNext() != null){
                    current= current.getNext();
                }
               current.setNext(newNode);
        }
    }

    public void insertBefore(T value, T newValue){
        Node<T> newNode= new Node<>(newValue);
        Node<T> current=head;
        if(head== null){
            head= newNode;
        }else if(head.getData()==value){
            newNode.setNext(head);
            head= newNode;
        } else {
            while (current!=null){
                if(current.getData()==value){
                    newNode.setNext(current.getNext());
                    current.setNext(newNode);
                    break;
                }
                current= current.getNext();
            }
        }
    }

    public void insertAfter(T value, T newValue){
        Node<T> newNode= new Node<>(newValue);
        Node<T> current= head;

        if(head == null){
            head= newNode;
        }
        while (current!=null){
            if(current.getData()==value){
                newNode.setNext(current.getNext());
                current.setNext(newNode);
                break;
            }
            current= current.getNext();
        }
    }

    public int size(){
        Node current= head;
        int count=0;

        while (current!= null){
            count++;
            current=current.getNext();
        }
        return count;
    }

    public T Kth(int k){
        Node current= head;
        int length= size();

        if( k>=0 && k<length){
                while (length-- >=0){
                    if(length == k){
                        return (T) current.getData();
                    }
                    current= current.getNext();
                }
        }
        return (T) "kth out of range";
    }

    public LinkedList<T> zipList(LinkedList<T> list1, LinkedList<T> list2) throws Exception{

        if (list1.head== null && list2.head==null){
            throw new Exception ("cant zip empty lists");
        } else if(list1.head== null){
            return list2;
        } else if(list2.head == null){
            return list1;
        } else {
            Node<T> current= list1.head;
            Node<T> current2= list2.head;
            int index=0;

            int length1= list1.size();
            int length2=list2.size();

            while (current.getNext()!=null){
                list1.insertAfter(index, current2.getData());
                if(current2.getNext()==null){
                    break;
                }
                index+=2;
                current= current.getNext().getNext();
                current2= current2.getNext();
            }
            if(length2 > length1){
                while (current2!=null){
                    list1.append(current2.getData());
                    current2= current2.getNext();
                }
            }

        }
        return list1;
    }

    public Boolean isPalindrome(LinkedList<T> list){
        List<T> list1= new ArrayList<T>();
        List<T> list2= new ArrayList<T>();

        Node current= head;
        while (current!=null){
            list1.add((T) current.getData());
            current= current.getNext();
        }
        for (int i= list1.size()-1; i>=0; i--){
            list2.add(list1.get(i));
        }
        if(list1.toString().equals(list2.toString())){
            return true;
        }
        return false;
    }

    public void sortList(LinkedList<T> list){

        Node<T> current=head;
        Node<T> index= current.getNext();
        T temp;

        if(head==null){
            return;
        }
        while (current!=null){
           while (index!=null){
               if((int) current.getData() > (int) index.getData()){
                   temp= current.getData();
                   current.setData(index.getData());
                   index.setData(temp);
               }
               index=index.getNext();
           }
           current=current.getNext();
        }
    }


//    public void deleteNode(T value){
//        if(head== null){
//            return;
//        }
//
//        Node current= head;
//        Node current1= current.getNext();
//
//        while(current1 != null){
//            if(current.getNext().getData() == value){
//                current.setNext(current1.getNext());
//                current1.setNext(null);
//                break;
//            }
//            current=current1;
//            current1= current1.getNext();
//        }
//
//    }

    public LinkedList<T> deleteNode(T value, LinkedList<T> list) throws Exception{
        if(head== null){
            throw new Exception("cant delete from emptyList");
        }

        Node current= head;
        Node current1= head.getNext();

        while(current1 != null){
            if(current.getNext().getData() == value){
                current.setNext(current1.getNext());
                current1.setNext(null);
                break;
            }
            current=current1;
            current1= current1.getNext();
        }
        return list;
    }
//============================================round1=================================
//    public void insert(T value) {
//        Node<T> newNode = new Node<T>(value);
//        if (head == null) {
//            head = newNode;
//        } else {
//            newNode.setNext(head);
//            head = newNode;
//        }
//    }

//    public Boolean includes(T data){
//        Node current= head;
//        while (current != null){
//            if (current.getData()== data){
//                return true;
//            }
//            current = current.getNext();
//        }
//        return false;
//    }

//    public void append(T data){
//        Node<T> newNode= new Node<T>(data);
//
//        if(head==null){
//            head= newNode;
//        }else{
//            Node current= head;
//            while (current.getNext() != null){
//                current= current.getNext();
//            }
//            current.setNext(newNode);
//        }
//    }

//    public String toString() {
//        Node<T> current = head;
//        String sortedList = "";
//        while (current != null) {
//            sortedList = sortedList + "{ " + current.getData() + " } ->";
//            current=current.getNext();
//        }
//        sortedList= sortedList+ "null";
//        return sortedList;
//    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

//    public void insertBefore(T value, T newValue){
//        Node newNode= new Node(newValue);
//
//        if(head == null){
//            head = newNode;
//        }else if(head.getData()== value){
//            newNode.setNext(head);
//            head= newNode;
//        }else{
//            Node current= head;
//            while (current != null){
//                if(current.getNext().getData() == value){
//                    newNode.setNext(current.getNext());
//                    current.setNext(newNode);
//                    break;
//                }
//                current= current.getNext();
//            }
//        }
//    }

//    public void insertAfter(T value, T newValue){
//        Node<T> newNode= new Node<>(newValue);
//        if(head == null){
//            head= newNode;
//        }else{
//            Node<T> current= head;
//            while (current.getData()!= value){
//                current= current.getNext();
//            }
//            newNode.setNext(current.getNext());
//            current.setNext(newNode);
//        }
//    }


//    public int size(){
//        Node current = head;
//        int count=0;
//        while (current!=null){
//            count++;
//            current=current.getNext();
//        }
//        return count;
//    }

//    public T Kth(int k){
//        int length = size();
//        if ( k < length && k >=0){
//            Node<T> search= head;
//            while (length-- >= 0){
//                if(length == k){
//                    return (T) search.getData();
//                }
//                search= search.getNext();
//            }
//        }
//        return (T) "k out of range";
//    }


    public void insertAfter(int idx, T value){
        Node newNode = new Node(value);

        if(head==null){
            head=newNode;
        }else {
            Node current= head;
            int idxCount= 0;
            while (current != null) {
                if (idxCount == idx) {
                    newNode.setNext(current.getNext());
                    current.setNext(newNode);
                    break;
                }
                idxCount++;
                current = current.getNext();
            }
        }
    }

//
//    public LinkedList<T> zipList(LinkedList list1, LinkedList list2) throws Exception{
//        if(list1.size()==0 && list2.size()==0){
//            throw new Exception("You can't zip two empty lists");
//        }else if(list1.size()==0){
//            return list2;
//        }else if(list2.size()==0){
//            return list1;
//        }else {
//            Node<T> current  = list1.head;
//            Node<T> current2 = list2.head;
//
//            int length1= list1.size();
//            int length2= list2.size();
//            int index=0;
//
//            while (current.getNext() != null){
//                list1.insertAfter(index, current2.getData());
//                if(current2.getNext() == null){
//                    break;
//                }else{
//                    current2= current2.getNext();
//                    current = current.getNext().getNext();
//                    index+=2;
//                }
//            }
//            if(length2 >= length1){
//                while (current2 != null){
//                    list1.append(current2.getData());
//                    current2= current2.getNext();
//                }
//            }
//
//        }
//        return list1;
//    }


    // Big O >> space -> O(n)
    public LinkedList<T> listReverser(LinkedList list1){

        Node current= list1.head;
        LinkedList<T> list2 = new LinkedList<T>();

        while (current !=null){
            list2.insert((T) current.getData());
            current= current.getNext();
        }
        return list2;
    }

    // Big 0 --> O(1)
//    public void reverser(){
//        Node prev = null;
//        Node current = head;
//        Node next = null;
//        while (current != null){
//            next = current.getNext();
//            current.setNext(prev);
//            prev = current;
//            current = next;
//        }
//        head = prev;
//    }
//

    // hard way
//    public boolean isPalindrome(Node<String> head) {
//        Node fast = this.head;
//        Node slow = this.head;
//        while (fast != null && fast.getNext() != null) {
//            fast = fast.getNext().getNext();
//            slow = slow.getNext();
//        }
//        slow = reversed(slow);
//        fast = this.head;
//        while (slow != null) {
//            if (slow.getData() != fast.getData()) {
//                return false;
//            }
//            slow = slow.getNext();
//            fast = fast.getNext();
//        }
//        return true;
//    }
//
//    private Node reversed(Node head){
//        Node prev = null;
//        Node current = head;
//        Node next = null;
//        while (current != null){
//            next = current.getNext();
//            current.setNext(prev);
//            prev = current;
//            current = next;
//        }
//        return prev;
//    }

//    public void sortList() {
//        // Node current will point to head
//        Node current = head;
//        Node index = null;
//
//        T temp;
//
//        if (head == null) {
//            return;
//        }
//        else {
//            while (current != null) {
//                // Node index will point to node next to current
//                index = current.getNext();
//
//                while (index != null) {
//                    // If current node's data is greater than index's node data, swap the data
//                    // between them
//                    if ((int)current.getData() > (int) index.getData()) {
//                        temp = (T) current.getData();
//                        current.setData(index.getData());
//                        index.setData(temp);
//                    }
//
//                    index = index.getNext();
//                }
//                current = current.getNext();
//            }
//        }
//
//    }

//    public void delete(String data) {
//        Node current = head;
//        Node current1 = head.getNext();
//        while (current1 != null) {
//
//            if (current.getNext().getData() == data) {
//                current.setNext(current1.getNext());
//                current1.setNext(null);
//                break;
//            }
//            current = current1;
//            current1 = current1.getNext();
//        }
//
//    }

    public static boolean isTextInList(LinkedList list, String string){
        Node current = list.getHead();
        while (current != null){
            if(current.getData() == string){return true;}
            current = current.getNext();
        }
        return false;
    }

//    public static boolean isListPalindrome(LinkedList list){
//        List<String> list1 = new ArrayList<>();
//        List<String> list2 = new ArrayList<>();
//        Node current = list.getHead();
//        while (current != null){
//            list1.add((String) current.getData());
//            current = current.getNext();
//        }
//        for (int i = list1.size() - 1; i > -1; i--){
//            list2.add(list1.get(i));
//        }
//        System.out.println(list1);
//        System.out.println(list2);
////  for(int i=0; i<list1.size(); i++ ){
////    if(!list1.get(i).equals(list2.get(i))){return false;}
////  }
//        if(list1.toString().equals(list2.toString()))
//            return true;
//        else return false;
//    }
}
