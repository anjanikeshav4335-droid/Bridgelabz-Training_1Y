
public class Mobile{
	String brand_name;
	int model;
	int price;
	public Mobile(String brand_name,int model,int price){
		this.brand_name=brand_name;
		this.model=model;
		this.price=price;
	}
	public void displaydetails(){
		System.out.println("brand Name is "+brand_name);
		System.out.println("model IS "+model);
		System.out.println("price is "+price);
	}
	public static void main(String args[]){
		Mobile mob=new Mobile("Samsung",25,20000);
		mob.displaydetails();
	}
}