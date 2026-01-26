import java.util.Scanner;
class Grade
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Physics marks:");
        int phy = sc.nextInt();
        System.out.println("Enter Chemistry marks:");
        int chem = sc.nextInt();
        System.out.println("Enter Maths marks:");
        int math = sc.nextInt();

        double percent = (phy + chem + math) / 3.0;
        System.out.println("Average Percentage: " + percent);

        if (percent >= 80) 
		{
            System.out.println("Grade A");
        } 
		else if (percent >= 70) 
		{
            System.out.println("Grade B");
        } 
		else if (percent >= 60) 
		{
            System.out.println("Grade C");
        } 
		else if (percent >= 50) 
		{
            System.out.println("Grade D");
        } 
		else if (percent >= 40) 
		{
            System.out.println("Grade E");
        } else 
		{
            System.out.println("Grade R");
        }
    }
}