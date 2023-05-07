import java.util.*;
/*
HashSet is extends the AbbstractSet and implements Set interface.
It creates a collection that uses a hash table for storage.
It cannot acceptes null values.
Note:Insertion order is not preserved.
The default cpacity of 16, fill ratio 0.75
*/
public calss Hash_Set
{
public static void main(String args[])
{
HashSet <String> animals = new HashSet<>();
animals.add("Lion");
animals.add("Tiger");
animals.add("Peekock");
animals.add("Monkey");
animals.add("Donkey");
System.out.println(animals);
//return not insertion order
//loop
Iterator itr = animals.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}


}

}
