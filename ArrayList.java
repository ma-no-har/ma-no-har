
import java.util.*;
/*ArrayList is class extends AbstractList and it implements the List interface & List interface is implements the Collection
 ArrayList supports dynamic Arrays 
 it can accept the duplicate values
 
 
 UseCase: it is use to the retrieve the data 
 and it insertion order is preserved.
 
 
 Methods:
 add(Object), add(index,Object), get(index); remove(); addAll(Collections);
 contains(); isEmpty(); clear();
 capacity = 10
 it accept the  homogeneous data and heterogeneous  data.
 
  */
 


public class Arraylist {
	public static void main(String args[])
	{
		//Heterogeneuos Example
//		ArrayList al = new ArrayList();
//		al.add("Manohar");
//		al.add(23);
//		al.add(98.4);
//		al.add(true);
//		System.out.println(al);
		//Homogeneous Example
		ArrayList<Integer> al = new ArrayList<>();
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(0,8);
//		System.out.println(al);
		ArrayList<Integer> aal = new ArrayList<>(al);
		//Collections.sort(aal,Collections.reverseOrder());
		aal.add(1,9);
//		System.out.println(aal);
//		System.out.println(aal.get(1));
		System.out.println("By Using for-each");
		for(Object x : aal)
		{
			System.out.println(x);
		}
		System.out.println("By Using Iterator");
		Iterator itr = aal.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("By Using for-loop");
		for(int i=0;i<aal.size();i++)
		{
			System.out.println(aal.get(i));
		}
		
		
	}

}
