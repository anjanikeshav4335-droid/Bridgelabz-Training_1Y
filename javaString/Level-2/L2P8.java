import java.util.*;
class L2P8{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
int[] age=new int[10];

for(int i=0;i<10;i++) age[i]=sc.nextInt();

for(int i=0;i<10;i++)
System.out.println(age[i]+" -> "+(age[i]>=18));
}}
