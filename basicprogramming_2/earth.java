import java.util.Scanner;
class earth
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Radius of Earth:");
		int r = input.nextInt();
		double p =3.14;
		double k = 4/3*p*r*r*r;
		System.out.println("volume of earth in kilometer"+k);
		double m = k*1.6;
		System.out.println("Volume of earth in Miles"+m);
	}
}
