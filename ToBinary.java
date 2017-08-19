import java.util.*;
class util{

	int i=0;
	void toBinary(int data)
	{
		
		int remainder;
		
		ArrayList<Integer> al=new ArrayList<Integer>();
	
		while(data>0)
		{
			remainder = data %2; 
			data=data/2;
			al.add(remainder);
	
		}
	
		Integer[] check=new Integer[al.size()];
		check=al.toArray(check);
	
		for(int i=check.length-1;i>=0;i--)
		{
		
			System.out.print(check[i]);
		}
	}

	
	
}
class ToBinary{
	public static void main(String...args)
	{
		int number; 
		util u=new util();
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter a positive integer");
       	 	number = sc.nextInt();

        	if (number < 0)
		{
           	 	System.out.println("Error: Not a positive integer");
        	} 
		else 
		{ 
            		System.out.println("Convert to binary is : \n");
          		u.toBinary(number);
            
       	 	}
	}
}
