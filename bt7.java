package CHAPTER2;

public class bt7 {

	public static void main(String[] args) {
	Person ps=new Person(); 
	Techer tc=new Techer();
	System.out.println("Thong tin ca nhan: ");
	ps.show();
	System.out.println("thong tin giao vien:");
	tc.show();
	}
}
class Person{
	private String name;
	private int age;
	private String address;
	public void setName(String name)
	{
		this.name=name;
		
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public void show()
	{
		System.out.println("Ho va ten: "+ name);
		System.out.println("tuoi: " + age);
		System.out.println("Dia chi: "+address);
	}
}
class Techer{
	private String name;
	private int age;
	private String address;
	private String instituion_name;
	private String coures;
	public void setName(String name)
	{
		this.name=name;
		
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public void setinstituion_name(String a)
	{
		this.instituion_name=a;
	}
	public void setcoures(String b)
	{
		this.coures=b;
	}
	public void show()
	{
		System.out.println("Ho va ten: "+ name);
		System.out.println("tuoi: " + age);
		System.out.println("Dia chi: "+address);
		System.out.println("Ten co so giao duc: "+instituion_name);
		System.out.println("Khoa hoc: "+ coures);
		
	}
}
