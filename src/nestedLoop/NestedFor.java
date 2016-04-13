package nestedLoop;

public class NestedFor {

	
	public static void main(String[] args)
	{ //main start
	
	for(int i=1;i<=5;i++)
	{
		
		for(int j=0;j < i;j++)
		{
			System.out.print("O ");
		}
		for(int j=0;j < 5-i;j++)
		{
			System.out.print(". ");
		}
		System.out.println();
	}	
	
	}//main end
	
}
