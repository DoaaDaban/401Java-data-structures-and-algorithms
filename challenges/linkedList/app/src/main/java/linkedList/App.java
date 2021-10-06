/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("hello");


        LinkedList linkedList=new LinkedList();
        linkedList.insert("D");
        linkedList.insert("o");
        linkedList.insert("a");
        linkedList.insert("a");

        System.out.println(linkedList);

        System.out.println(linkedList.includes("l"));


        linkedList.append("K");
        linkedList.insertBefore("a","U");
        linkedList.insertAfter("D","T");

        System.out.println(linkedList);

        System.out.println(linkedList.kthFromEnd(2));

        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList list3 = new LinkedList();

        list1.append("D");
        list1.append("O");
        list1.append("A");
        list1.append("A");
        list1.append("D");
        list1.append("A");

        list2.append("1");
        list2.append("2");
        list2.append("3");
        list2.append("4");

        System.out.println(list3.zipLists(list1,list2));
    }
}