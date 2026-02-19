import java.util.*;
class L3P1{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
for(int i=1;i<=10;i++){
double w=sc.nextDouble();   // weight
double h=sc.nextDouble()/100; // height in meter
double bmi=w/(h*h);

String s=(bmi<18.5)?"Underweight":
(bmi<25)?"Normal":
(bmi<30)?"Overweight":"Obese";

System.out.println(w+" "+(h*100)+" "+bmi+" "+s);
}}
}
