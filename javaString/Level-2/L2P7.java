import java.util.*;
class L2P7{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int st=0,en=s.length()-1;

while(st<=en && s.charAt(st)==' ') st++;
while(en>=st && s.charAt(en)==' ') en--;

String r="";
for(int i=st;i<=en;i++) r+=s.charAt(i);

System.out.println(r);
System.out.println(s.trim());
}}
