import java.util.*;
class L3P2{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();

for(int i=0;i<s.length();i++){
boolean unique=true;
for(int j=0;j<i;j++)
if(s.charAt(i)==s.charAt(j)) unique=false;

if(unique) System.out.print(s.charAt(i)+" ");
}}
}
