public class Smallest_Largest
{
	public void SmallestAndLargest(int num1,int num2,int num3){
		if(num1>num2 && num1>num3){
			System.out.println("Num1 is greater");
		}
		if(num2>num1 && num2>num3){
			System.out.println("Num2 is greater");
		}
		if(num3>num1 && num3>num2){
			System.out.println("Num3 is greater");
		}
		if(num1<num2 && num1<num3){
			System.out.println("Num1 is Smaller");
		}
		if(num2<num1 && num2<num3){
			System.out.println("Num2 is Smaller");
		}
		if(num3<num1 && num3<num2){
			System.out.println("Num3 is Smaller");
		}
	}
	public static void main(String args[]){
		Smallest_Largest sl=new Smallest_Largest();
		sl.SmallestAndLargest(45,58,74);
	}
}