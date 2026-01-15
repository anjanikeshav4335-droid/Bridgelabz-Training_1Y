import java.util.Scanner;
class handshake
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number of Students");
		int s = input.nextInt();
		double h = (s*(s-1))/2;
		System.out.println("Number of handshakes:"+h);
	}
}
