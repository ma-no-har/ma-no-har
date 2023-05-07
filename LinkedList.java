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
Note: The default remvoe() method is remove the first insert object it follows like (FIFO).

UseCase:
LinkedList is mostly preferable the Inserting,Deleting opertions.
it is more quikely this process compareto others.
because of it will each object linked with other object.
but it not suitable for retriveing.
*/
public class Linked_List {
	public static void main(String args[])
	{
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Manohar");
		ll.add("Nikhil");
		ll.add("Mani");
		ll.add("Naresh");
		ll.add("Adnan");
		ll.addFirst("Venkat");
		ll.addLast("Ganesh");
		//System.out.println(ll);
		//ll.remove();
		//System.out.println(ll);
		ll.addFirst("Anil");
		ll.addLast("Sandeep");
		System.out.println(ll);
		//Converting ArrayList to Array.
		String str[] = new String[ll.size()];
		//Note:this str not supported to the collections method because it is the normal String not a Collection.
		str = ll.toArray(str);
		
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}
		//it will give an Error.
		//sstr.add(9);
		
		System.out.println();
		//Use addAll();
		LinkedList<String> linkedlist = new LinkedList<>();
		linkedlist.addAll(ll);
		//This poll() method remove the first insert element poll() alias remove()
		//linkedlist.poll();
		//This peek() is retrieve the first object in list not remove that object.
		System.out.println(linkedlist.peek());
		linkedlist.set(0, "Adnan");
		//instead  of addFirst() we can use offerFirst();
		linkedlist.offerFirst("Rahul");
		linkedlist.offer("Bharath");
		System.out.println(linkedlist);
		//Converted String[] to LinkedList
		LinkedList linkedlist1 = new LinkedList<>(Arrays.asList(str));
		linkedlist1.offer(4);
		System.out.println(linkedlist1);
		//Another way to Convert String array to LinkedList
		LinkedList<String> linkedlist2 = new LinkedList<>();
		//using Collections.addAll()
		Collections.addAll(linkedlist2, str);
		System.out.println(linkedlist2);
		Iterator itr = linkedlist1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}
	

}
