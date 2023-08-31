package Features1;

import java.util.Arrays;
import java.util.List;

public class PersonMain {
	public static void main(String[] args)
    {
        //Storing data in list
        List<Person> persons = Arrays.asList(
                new Person("Harsitha",22),
                new Person("Sneha",23),
                new Person("Swapna",24),
                new Person("Chotu",23));
        
        //Convert to Streams //Single Condition
        Person SC = persons.stream().filter(n->"Chotu".equals(n.getName())).findAny() .orElse(null);
        System.out.println(SC);
        
        //Convert to Streams //Multiple Condition
        Person MC = persons.stream().filter((n2)->!"Swapna".equals(n2.getName()) && 23 == n2.getAge()).findAny() .orElse(null);
        System.out.println(MC);
       



   }



}


