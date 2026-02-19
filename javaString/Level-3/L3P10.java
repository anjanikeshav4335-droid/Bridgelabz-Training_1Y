import java.util.*;
class L3P10{
public static void main(String[] a){
String[] suits={"Hearts","Diamonds","Clubs","Spades"};
String[] ranks={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

ArrayList<String> deck=new ArrayList<>();

for(String s:suits)
for(String r:ranks)
deck.add(r+" of "+s);

Collections.shuffle(deck);

for(int i=0;i<10;i++)
System.out.println(deck.get(i));
}}
