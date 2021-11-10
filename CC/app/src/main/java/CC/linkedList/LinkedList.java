package CC.linkedList;

public class LinkedList<T>{

    private Node<T> head;

    public LinkedList() {
    }

    public LinkedList(Node<T> head) {
        this.head = null;
    }

    public void insert(T value) {
        Node<T> newNode = new Node<T>(value);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    public Boolean includes(T data){
        Node current= head;
        while (current != null){
            if (current.getData()== data){
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public void append(T data){
        Node<T> newNode= new Node<T>(data);

        if(head==null){
            head= newNode;
        }else{
            Node current= head;
            while (current.getNext() != null){
                current= current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void insertBefore(T value, T newValue){
        Node newNode= new Node(newValue);

        if(head == null){
            head = newNode;
        }else if(head.getData()== value){
            newNode.setNext(head);
            head= newNode;
        }else{
            Node current= head;
            while (current != null){
                if(current.getNext().getData() == value){
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
        if(head == null){
            head= newNode;
        }else{
            Node<T> current= head;
            while (current.getData()!= value){
                current= current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
    }

    public String toString() {
        Node<T> current = head;
        String sortedList = "";
        while (current != null) {
            sortedList = sortedList + "{ " + current.getData() + " } ->";
            current=current.getNext();
        }
        sortedList= sortedList+ "null";
        return sortedList;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public int size(){
        Node current = head;
        int count=0;
        while (current!=null){
            count++;
            current=current.getNext();
        }
        return count;
    }

    public T Kth(int k){
        int length = size();
        if ( k < length && k >=0){
            Node<T> search= head;
            while (length-- >= 0){
                if(length == k){
                    return (T) search.getData();
                }
                search= search.getNext();
            }
        }
        return (T) "k out of range";
    }


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


    public LinkedList<T> zipList(LinkedList list1, LinkedList list2) throws Exception{
        if(list1.size()==0 && list2.size()==0){
            throw new Exception("You can't zip two empty lists");
        }else if(list1.size()==0){
            return list2;
        }else if(list2.size()==0){
            return list1;
        }else {
            Node<T> current  = list1.head;
            Node<T> current2 = list2.head;

            int length1= list1.size();
            int length2= list2.size();
            int index=0;

            while (current.getNext() != null){
                list1.insertAfter(index, current2.getData());
                if(current2.getNext() == null){
                    break;
                }else{
                    current2= current2.getNext();
                    current = current.getNext().getNext();
                    index+=2;
                }
            }
            if(length2 >= length1){
                while (current2 != null){
                    list1.append(current2.getData());
                    current2= current2.getNext();
                }
            }

        }
        return list1;
    }


    public LinkedList<T> listReverser(LinkedList list1){

        Node current= list1.head;
        LinkedList<T> list2 = new LinkedList<T>();

        while (current !=null){
            list2.insert((T) current.getData());
            current= current.getNext();
        }
        return list2;
    }


}

