package StreamDemo1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo1 {

	public static void main(String[] args) {
		


			List<String>names= new ArrayList<>();
			names.add("Sneha");
			names.add("Swapna");
			names.add("Harshii");
			names.add("Teju");
			names.add("Chotu");
			names.add("Anju");
			names.add("Appu");
			int count=0;
			for(String str:names) {
				if(str.length()<6)
					count++;
			}
			System.out.println(count+"names with less than 6 characters");
			//creating a stream using stream.of
            Stream<String>names1=Stream.of("sneha","swapna");
            names1.forEach(System.out::println);
			}
		}
