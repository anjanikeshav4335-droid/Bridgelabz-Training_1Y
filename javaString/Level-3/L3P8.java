import java.util.*;
class L3P8{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();

int[] f=new int[256];

for(int i=0;i<s1.length();i++) f[s1.charAt(i)]++;
for(int i=0;i<s2.length();i++) f[s2.charAt(i)]--;

boolean ok=true;
for(int i=0;i<256;i++)
if(f[i]!=0) ok=false;

System.out.println(ok?"Anagram":"Not Anagram");
}}
