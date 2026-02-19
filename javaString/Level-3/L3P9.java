import java.util.*;
import java.util.Calendar;

class L3P9{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int y=sc.nextInt();

Calendar c=Calendar.getInstance();
c.set(y,m-1,1);

int days=c.getActualMaximum(Calendar.DAY_OF_MONTH);
int start=c.get(Calendar.DAY_OF_WEEK);

System.out.println("Sun Mon Tue Wed Thu Fri Sat");

for(int i=1;i<start;i++) System.out.print("    ");

for(int i=1;i<=days;i++){
System.out.printf("%3d ",i);
if((i+start-1)%7==0) System.out.println();
}}
}
