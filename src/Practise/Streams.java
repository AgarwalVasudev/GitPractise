package Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Streams {
	@Test(enabled=false)
public void normal()
{
	ArrayList<String> list=new ArrayList<String>();
	list.add("Adam");
	list.add("Apple");
	list.add("Bobby");
	list.add("Carl");
	int count=0;
	//to print the count of elements in list starting with a
	
	for(int i=0;i<list.size();i++)
	{
		if(list.get(i).startsWith("A")) {
			count++;
		}
	}
	System.out.println(count);
	
	
}
	//the same above can be achieved via streams as well very easily
	@Test(enabled=false)
	public void filters()
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Adam");
		list.add("Apple");
		list.add("Bobby");
		list.add("Carl");
		/*Step 1:Convert the collection to a stream
		 * Step 2:apply a intermidate operation(like filter) if needed
		 * Step 3:apply a terminal operator
		 */
		Long Count=list.stream().filter(s->s.startsWith("A")).count();
		System.out.println(Count);
		//to print items having length greater than 4
		list.stream().filter(s->s.length()>4).sorted().forEach(s->System.out.println(s));
	}
	@Test(enabled=false)
	public void map()
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Adam");
		list.add("Apple");
		list.add("Bobby");
		list.add("Carla");
		//print the ones ending with a in upper case
		//when we change a collection to list and perform any operation on that stream a new stream is formed so the collection is unchanged
		list.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}
	@Test
	public void stremCollect()
	{
		//we can also convert a stream into list 
	List<String> names=	Stream.of("Abhijeet","Baba","Amala","Theo").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
	System.out.println(names.get(0));
	
	List<Integer> values=Arrays.asList(3,4,1,9,2,4,2,1);
	//Print the unique values in the array
	//Sort the array
	values.stream().distinct().forEach(s->System.out.println(s));
	values.stream().sorted().forEach(s->System.out.println(s));
	}
}
