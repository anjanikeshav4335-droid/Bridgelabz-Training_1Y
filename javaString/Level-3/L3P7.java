import java.util.*;
class L3P7{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
boolean p=true;

for(int i=0;i<s.length()/2;i++)
if(s.charAt(i)!=s.charAt(s.length()-1-i))
p=false;

System.out.println(p?"Palindrome":"Not Palindrome");
}}
