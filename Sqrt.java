import java.util.*;
class Sqrt
	{
		public static void main(String []args)
			{
				Scanner sc = new Scanner(System.in);
				double c;
				System.out.println("enter the value of c");
				c=sc.nextDouble();
				unit obj = new unit();
				obj.func(c);

			}

	}


	class unit
	{
		static void func(double c)
		{
			double t;
			t=c;
			while((Math.abs(t-(c/t))) > (Math.exp(-15)*t))
			{
			
				t =(c/(2*t))+(t/2);	

			}
			System.out.println(t);
		}


	}


