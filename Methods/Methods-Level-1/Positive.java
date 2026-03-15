public class positive_negative_zero
{
	public  void positive_negative_zero (int num){
		if(num>0){
			System.out.println("no is positive");
		}
		if(num<0){
			System.out.println("no is negative");
		}
		if(num==0){
			System.out.println("no is zero");
		}
	}
	public static void main(String args[]){
		positive_negative_zero pnz=new positive_negative_zero();
		pnz.positive_negative_zero(0);
	}
}