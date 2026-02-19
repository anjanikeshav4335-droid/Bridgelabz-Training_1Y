import java.util.*;
class L3P5{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();

for(int i=0;i<s.length();i++){
boolean seen=false;
for(int k=0;k<i;k++)
if(s.charAt(i)==s.charAt(k)) seen=true;

if(!seen){
int count=0;
for(int j=0;j<s.length();j++)
if(s.charAt(i)==s.charAt(j)) count++;

System.out.println(s.charAt(i)+" "+count);
}}
}
