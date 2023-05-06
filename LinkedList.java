import java.util.*;
/*LinkedList is a class extends AbstractSeqentialList and it implements List interface&Deque interface 
it provides a linked-list data structure
Ex:in LLinkedList contains each element is store like node that node can be divide in three nodes
firstnode can have the address of preveious element and second node is the element and threed node
is the address of the next node(PEN).
|_P_|_5_|_N_|
insertion order can be preserved.
and it allows the duplicate vlues.
it can have the same method in ArrayList and add some additional methods because of it can be implemented the Deque interface also,
Methods:
addFirst() addLast() removeFirst(), removeLast(), offerFirst(), offerLast(), getFirst(), peekLast(),
pollFirst(), pollLast();

UseCase:
LinkedList is mostly preferable the Inserting,Deleting opertions.
it is more quikely this process compareto others.
because of it will each object linked with other object.
but it not suitable for retriveing.
*/

import java.util.*;
class LinkedListDemo
{
  public static void main(String args[])
  {
    //Creating LinkedList.
    LinkedList<String> ll = new LinkedList<>();
    ll.add("Manohar");
    ll.add("Nikhil");
    ll.add("Naresh");
    ll.add("Suresh");
    ll.add("Ramesh");
    addFirst("Venkat");
    System.out.println(ll);
    //it return the first object not deleting.
    poll();
    
  }
}
