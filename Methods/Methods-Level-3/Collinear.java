
public class Collinear
{
	public void collinear(int x1,int y1,int x2,int y2,int x3,int y3 ){
		int slope1=(y2-y1)/(x2-x1);
		int slope2=(y3-y2)/(x3-x2);
		int slope3=(y3-y1)/(x3-x1);
		if(slope1==slope2 && slope2==slope3){
			System.out.println("points are collinear");
		}
		else{
			System.out.println("points are not collinear");
		}
	}
	public static void main(String args[]){
		Collinear c1=new Collinear();
		c1.collinear(2,4,4,6,6,8);
	}
}