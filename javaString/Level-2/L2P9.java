import java.util.*;
class L2P9{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String[] opt={"rock","paper","scissors"};
int userWin=0,compWin=0;

int n=sc.nextInt();
for(int i=0;i<n;i++){
String user=sc.next();
String comp=opt[(int)(Math.random()*3)];
System.out.println("Computer: "+comp);

if(user.equals(comp)){}
else if((user.equals("rock")&&comp.equals("scissors"))||
(user.equals("paper")&&comp.equals("rock"))||
(user.equals("scissors")&&comp.equals("paper")))
userWin++;
else compWin++;
}

System.out.println("User Wins="+userWin);
System.out.println("Computer Wins="+compWin);
}}
