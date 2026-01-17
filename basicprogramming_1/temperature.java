import java.util.Scanner;
class temperature
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature in Celsius|");
		int c = input.nextInt();
		double fahrenheit = (c *9/5) +32;
		System.out.println("Temperature in farehnheit- " +fahrenheit);
	}
}	