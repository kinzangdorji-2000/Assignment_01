
public class ArrayList
{
	double main_1 = 0.25;
	double main_2 = 0.75;
	int Array_capacity = 4;
	static int x;
	int remove;
	int top = 0;

	static double length;
	static int Array[];
	public ArrayList()
	{
		Array = new int[Array_capacity];
	}

	public void add(int y)
	{
		Array[top] = y;
		top++;
	}

	public void pop()
	{
		top--;
		remove = Array[top];
		Array[top] = 0;
		int count = 0;
		for(int i = 0; i < Array[i]; i++) 
		{
			count++;
		}
		x = count;
		length = (double)x/Array_capacity;
		System.out.println("Remove Element " +remove);
	}
	
	public void resize()
	{
		if(length == main_1 ) 
		{
			int newArray[] = new int[(Array_capacity/2)];
			for(int i = 0; i < (Array.length/2); i++)
			{
				newArray[i] = Array[i];
			}
			Array = newArray;
			Array_capacity = Array_capacity/2;
			for(int n : newArray) 
			{
				System.out.print(n + " ");
			}	
		}
		else if(length == main_2) 
		{
			int newArray[] = new int[Array_capacity*2];
			for(int i = 0; i < Array.length; i++) 
			{
				newArray[i] = Array[i];
			}
			Array_capacity = Array_capacity * 2;
			Array = newArray;

			for(int j : newArray) 
			{
			System.out.print(j + " ");
			}
			System.out.println();
		}

		else 
		{
			System.out.println("ArrayIndexOutOfBoundRange");
		}
	}

	public int size()
	{
		return Array_capacity;
	}
	
	public String toString()
	{
		String s = Integer.toString(Array_capacity);
		return s;
	}


	public static void main(String[] args) 
	{
		ArrayList obj = new ArrayList();
		obj.add(5);
		obj.add(8);
		obj.add(4);
		obj.add(3);
		obj.pop();
		obj.resize();
		System.out.println("toString  " +obj.toString());
		System.out.println("The number of elements in the new Array is " +x);
		System.out.println("The Size of new Array is " +obj.size());
	}
}
