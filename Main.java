public class Main {
	
	 public static void dosomething(Animal a)
	   {
		   try
		   {
		   if(a instanceof Oviparous)
		   {
			   if(a instanceof Birds)
			   {
				   System.out.println("This is birds class");
			   }
			   else if(a instanceof Insects)
			   {
				   System.out.println("This is Insects class");
			   }
		   }
		   else if(a instanceof Mamal)
		   {
			   if(a instanceof Land)
			   {
				   System.out.println("This is land class");
			   }
			   else if(a instanceof Water)
			   {
				   System.out.println("This is Water class");
			   }
		   }
		   }
		   catch(Exception e)
		   {
			   System.out.println("An error occoured!!!");
		   }
	   }
    public static void variadic(Animal ... t) {
    	for(Animal i: t) {
    		dosomething(i);
    	}
    }
	public static void main(String[] args) {
	   variadic(new Animal(),new Oviparous(),new Birds());
	  
        
	}

}
