
public class Item{
	String Item_name;
	int Item_id;
	int Item_price;
	int Quantity;
	public Item(String Item_name,int Item_id,int Item_price,int Quantity){
		this.Item_name=Item_name;
		this.Item_id=Item_id;
		this.Item_price=Item_price;
		this.Quantity=Quantity;
	}
	public void displayCost(){
		System.out.println("ItemName is "+Item_name);
		System.out.println("ID IS "+Item_id);
		System.out.println("price is "+Item_price);
		System.out.println("Quantity is "+Quantity);
		System.out.println("total cost "+Item_price*Quantity);
	}
	public static void main(String args[]){
		Item i=new Item("OIl",1,50,200);
		i.displayCost();
	}
}