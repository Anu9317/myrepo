	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer a = new StringBuffer("hello");
System.out.println(a);
StringBuilder b = new StringBuilder("hi");
System.out.println(b);
//insert
System.out.println(a.insert(3, "world"));
//Append
System.out.println(a.append("hi"));
//replace
System.out.println(a.replace(3, 5, "world"));
//delete
System.out.println(a.delete(2, 4));
System.out.println(b.delete(3,5)); 
	}
}

	