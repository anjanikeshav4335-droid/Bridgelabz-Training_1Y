import java.util.*;
class L2P3{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String[] w=sc.nextLine().split(" ");
String[][] data=new String[w.length][2];

for(int i=0;i<w.length;i++){
data[i][0]=w[i];
data[i][1]=String.valueOf(w[i].length());
}

for(int i=0;i<data.length;i++)
System.out.println(data[i][0]+" "+data[i][1]);
}}
