package Features1;

public class Person {

    private String name;
	private int age;
	    
	    
	    //Constructors using Fields
    public Person(String name, int age) {
	        super();
	        this.name = name;
	        this.age = age;
	    }
	    //Getters and Setters
	    public String getName()
	    {
	        return name;
	    }
	    public void setName(String name)
	    {
	        this.name = name;
	    }

     public int getAge()
	    {
	        return age;
	    }
	    
	    public void setAge(int age)
	    {
	        this.age = age;
	    }
	    
	    //Generate toString
	    @Override
	    public String toString() {
	        return "Person [name=" + name + ", age=" + age + "]";
}
		
}

