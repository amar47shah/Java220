package assignment_05_05_Pascal;

public class PascalRow 
{

	private int n;
	
	public PascalRow(int N)
	{
		assert(N >= 0);

		n = N;
		if (n == 0)
			System.out.println("1");
		else 
			printRow(1, 1);
	}
	
	private void printRow(int... row)
	{
		if (row[1] == n) 
		{
			for (int i : row)
				System.out.print(i + " ");
			System.out.println();
			return;
		}
		else
		{
			int[] nextRow = new int[row[1]+2];

			nextRow[0] = 1;
			for (int i = 1; i < row[1]+1; i++)
				nextRow[i] = row[i-1] + row[i];
			nextRow[row[1]+1] = 1;

			printRow(nextRow);
		}
				
	}
	
}
