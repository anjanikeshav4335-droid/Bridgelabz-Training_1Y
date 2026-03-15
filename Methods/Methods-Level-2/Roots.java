
public class Roots
{
	public void quadratic_roots(double a,double b,double c){
		double delta=(b*b)-(4*a*c);
		if(delta>0){
			double root1=(-b+Math.sqrt(delta))/(2*a);
			double root2=(-b-Math.sqrt(delta))/(2*a);
			System.out.println("Both the roots are"+root1+","+root2);
		}
		else{
			System.out.println("Invalid Equation");
		}
	}
	public static void main(String args[]){
		Roots r1=new Roots();
		r1.quadratic_roots(1.0,5.0,4.0);
	}
}