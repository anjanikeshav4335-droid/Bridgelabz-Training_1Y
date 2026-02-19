import java.util.*;
class L2P2{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String t=sc.nextLine(),w=""; 
ArrayList<String> list=new ArrayList<>();

for(int i=0;i<t.length();i++){
char c=t.charAt(i);
if(c==' '){ list.add(w); w=""; }
else w+=c;
}
list.add(w);

System.out.println(list);
System.out.println(Arrays.toString(t.split(" ")));
}}
