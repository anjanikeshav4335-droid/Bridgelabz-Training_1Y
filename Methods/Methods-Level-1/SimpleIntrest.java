public class Simple_interest{
    public void Simple_Interest(int principle,int rate,int time) {
        System.out.println("Simple interest is");
		int SI=(principle*rate*time)/100;
		System.out.println("The simple interest is"+SI);
    }
    
	public static void main(String[] args) {
        Simple_interest Si = new Simple_interest();
        Si.Simple_Interest(500000,2,5);
    }
}