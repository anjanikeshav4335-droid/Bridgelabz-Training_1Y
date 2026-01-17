import java.util.Scanner;
class profit_loss
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Cost price");
		int c = input.nextInt();
		System.out.println("Enter Selling price");
		int s = input.nextInt();
		int profit = s-c;
		System.out.println("Profit is of:"+profit);
		int percentage = (profit*100)/c;
		System.out.println("Profit percentage:"+percentage);
	}
}

		