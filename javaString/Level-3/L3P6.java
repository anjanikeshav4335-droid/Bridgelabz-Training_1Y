import java.util.*;
class L3P6{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
char[] c=sc.nextLine().toCharArray();

for(int i=0;i<c.length;i++){
if(c[i]=='0') continue;
int count=1;
for(int j=i+1;j<c.length;j++){
if(c[i]==c[j]){
count++;
c[j]='0';
}}
System.out.println(c[i]+" "+count);
}}
}
