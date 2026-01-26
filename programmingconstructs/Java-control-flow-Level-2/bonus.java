import java.util.Scanner;
class Bonus {
    public static void main(String args[]) 
	{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter salary");
        int salary = input.nextInt();
        System.out.println("Enter years of service");
        int years = input.nextInt();
        if (years > 5)
            System.out.println("Bonus = " + (salary * 5 / 100));
        else
            System.out.println("No Bonus");
    }
}