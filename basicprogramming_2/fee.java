import java.util.Scanner;
class fee
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the fee of College:");
		int f = input.nextInt();
		int d = (f*10)/100;
		System.out.println("Discounted price is:"+d);
		int a = f-d;
		System.out.println("fee to be paid:"+a);
	}
}
