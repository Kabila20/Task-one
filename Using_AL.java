package Training;
import java.util.*;
public class Using_AL {
public static void main(String[] args)
{
	ArrayList <String> list = new ArrayList<>();
	list.add("kabi");
	list.add("karan");
	list.add("nithesh");
	list.add("jana");
	
	Iterator itr = list.listIterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	ArrayList <String> list1 = new ArrayList<>();
	list1.add("guru");
	list1.add("dinesh");
	
	list.addAll(1, list1);
	System.out.println(list);
	list.remove(0);
	System.out.println(list);
	
	System.out.println("Total size" + list.size());
			
}
}
