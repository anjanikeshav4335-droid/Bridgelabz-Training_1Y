import java.util.*;
class L2P4{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String[] w=sc.nextLine().split(" ");

String min=w[0],max=w[0];

for(String x:w){
if(x.length()<min.length()) min=x;
if(x.length()>max.length()) max=x;
}

System.out.println("Shortest: "+min);
System.out.println("Longest: "+max);
}}
