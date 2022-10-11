import java.util.*;
public class LinkedListDemo {

	
	public static void main(String[] args)
	{
		LinkedList <String> list = new LinkedList<>();
		list.add("kabi");
		list.add("hem");
		list.add("sri");
		list.add("sudhan");
		System.out.println("after add elements to list:" + list);
		
		list.remove(3);
		System.out.println("After removing element in list:" + list);
		
		LinkedList <String> list1 = new LinkedList<>();
		list1.add("shobana");
		list1.add("durga");
		list1.add("sharmi");
		list.addAll(list1);
		System.out.println("Update element in the list:" + list);
		list.size();
		System.out.println("Size fo the list is:"+list);
		list.addFirst("junga");
		System.out.println("adding elemtn to first:" +list);
		
		Collections.sort(list);


		list.descendingIterator();
		System.out.println(list);
		
		list.removeFirst();
		System.out.println("removing 1st element:" +list);
		
		list.removeLast();
		System.out.println("removing last element" + list);
		
		list.clear();
		System.out.println("clearing all" + list);
		
		list.size();
		System.out.println("size of the element is:" + list);
		
	}
}
