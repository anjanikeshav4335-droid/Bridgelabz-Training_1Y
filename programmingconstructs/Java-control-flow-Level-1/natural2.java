import java.util.Scanner;
class Natural
 {
    public static void main(String args[]) 
	{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a natural number n");
        int n = input.nextInt();
        if (n <= 0) 
		{
            System.out.println("Not a natural number");
        } else
		{
            int formulaSum = n * (n + 1) / 2;
            int loopSum = 0;
            for (int i = 1; i <= n; i++) 
			{
                loopSum = loopSum + i;
            }
            System.out.println("Sum using formula = " + formulaSum);
            System.out.println("Sum using for loop = " + loopSum);
            if (formulaSum == loopSum) 
			{
                System.out.println("Both results match");
            } else 
			{
                System.out.println("Mismatch found");
            }
        }
    }
}