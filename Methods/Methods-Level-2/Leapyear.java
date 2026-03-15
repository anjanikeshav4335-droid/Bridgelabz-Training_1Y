
public class leap_year
{
	public void Leap_Year(int Year){
		if(Year>=1582){
			if(Year%4==0 && Year%100!=0 || Year%400==0){
				System.out.println("Year is leap year");
			}
			else{
				System.out.println("Year is not leap year");
			}
		}
		else{
			System.out.println("Invalid year");
		}
	}
	public static void main(String args[]){
		leap_year L1=new leap_year();
		L1.Leap_Year(2020);
	}
}