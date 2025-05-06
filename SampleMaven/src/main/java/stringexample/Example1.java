package stringexample;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
String a = "hello";
//charat
char b = a.charAt(2);
System.out.println(b);
//length
System.out.println(a.length());
//concat
String c ="world";
System.out.println(a.concat(c));
//contains
String d = "There is a tree";
System.out.println(d.contains("There"));
System.out.println(d.contains("are"));
//isempty
System.out.println(a.isEmpty());
String e = "";
System.out.println(e.isEmpty());
String g = "java";
String h = "Java";
String j = "java";
String i = "Selenium";
//Equals
System.out.println(g.equals(j));
System.out.println(g.equals(h));
System.out.println(g.equals(i));
//equalsIgnoreCase
System.out.println(g.equalsIgnoreCase(h));
//touppercase
System.out.println(g.toUpperCase());
//tolowercase
System.out.println(g.toLowerCase());
//valueof
int t = 1;
String s = String.valueOf(t);
System.out.println(s);
String y = new String("java");
System.out.println(g.equals(y));
//==
System.out.println(g==j);
System.out.println(g==y);
//reference

	}

}
