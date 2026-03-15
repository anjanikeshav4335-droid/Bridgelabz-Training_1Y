public class sum_of_natural
{
	public void Sum(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			sum+=i;
		}
		System.out.println("sum of n natural no is"+" "+sum);
	}
	public static void main(String args[]){
		sum_of_natural S1=new sum_of_natural();
		S1.Sum(10);
	}
}