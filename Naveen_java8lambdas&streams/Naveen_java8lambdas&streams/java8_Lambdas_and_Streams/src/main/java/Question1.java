import java.util.*;

public class Question1 {
	public double getAvg(List<Integer> list)
	{
		double average = 0.0f;		
		IntSummaryStatistics summaryStats = list.stream().mapToInt((a) -> a).summaryStatistics();
		average = (double) summaryStats.getAverage();
		return average;
/*
Output:
The Values in the Array is
1001
0101
0110
1111
0000

The Palidromes in the list are:[1001, 0110, 1111, 0000]
 */
	}
	public static void main(String[] args) 
	{
		List <Integer>list = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements");
		int numberOfElements = sc.nextInt();
		/*
Output:
The Values in the Array is
1001
0101
0110
1111
0000

The Palidromes in the list are:[1001, 0110, 1111, 0000]
 */
		int i;
		System.out.println("Enter the elements");
		for(i = 0;i < numberOfElements;i++)
		{
			list.add(sc.nextInt());
		}
/*
Output:
The Values in the Array is
1001
0101
0110
1111
0000

The Palidromes in the list are:[1001, 0110, 1111, 0000]
 */
		System.out.println("The list of elements are:");
		System.out.println(list);
		
		Question1 average = new Question1();
		System.out.println("The Average value of the list is:");
		System.out.println(average.getAvg(list));
		
		sc.close();		
	}

}
/*
 OutPut:

Enter the number of elements
6
Enter the elements
40 20 80 10 90 30
The list of elements are:
[40, 20, 80, 10, 90, 30]
The Average value of the list is:
45.0

 */
