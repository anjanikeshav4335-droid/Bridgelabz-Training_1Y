import java.util.Scanner;
class Friends 
{
    public static void main(String args[]) 
	{
        Scanner input = new Scanner(System.in);

        System.out.println("Enter age and height of Amar");
        int ageAmar = input.nextInt();
        int heightAmar = input.nextInt();

        System.out.println("Enter age and height of Akbar");
        int ageAkbar = input.nextInt();
        int heightAkbar = input.nextInt();

        System.out.println("Enter age and height of Anthony");
        int ageAnthony = input.nextInt();
        int heightAnthony = input.nextInt();

        if (ageAmar < ageAkbar && ageAmar < ageAnthony)
            System.out.println("Youngest = Amar");
        else if (ageAkbar < ageAmar && ageAkbar < ageAnthony)
            System.out.println("Youngest = Akbar");
        else
            System.out.println("Youngest = Anthony");

        if (heightAmar > heightAkbar && heightAmar > heightAnthony)
            System.out.println("Tallest = Amar");
        else if (heightAkbar > heightAmar && heightAkbar > heightAnthony)
            System.out.println("Tallest = Akbar");
        else
            System.out.println("Tallest = Anthony");
    }
}