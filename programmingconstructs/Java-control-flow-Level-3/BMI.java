import java.util.Scanner;
class BMI 
{
    public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in kg:");
        double weight = input.nextDouble();

        System.out.println("Enter height in cm:");
        double heightCm = input.nextDouble();

        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);

        System.out.println("BMI = " + bmi);

        if (bmi <= 18.4) 
		{
            System.out.println("Underweight");
        } 
		else if (bmi >= 18.5 && bmi <= 24.9) 
		{
            System.out.println("Normal");
        } 
		else if (bmi >= 25.0 && bmi <= 39.9) 
		{
            System.out.println("Overweight");
        }
		else 
		{
            System.out.println("Obese");
        }
    }
}