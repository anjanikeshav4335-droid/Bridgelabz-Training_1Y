
public class Area_Circumference{
	int radius;
	public  Area_Circumference (int radius){
		this.radius=radius;
	}
	public void calculateareaandcircumference(){
		System.out.println("radius IS "+radius);
		double area=Math.PI*radius*radius;
		double circumference=2*Math.PI*radius;
		System.out.println("Area is "+area);
		System.out.println("Circumference is "+circumference);
	}
	public static void main(String args[]){
		Area_Circumference c1=new Area_Circumference(7);
		c1.calculateareaandcircumference();
	}
}