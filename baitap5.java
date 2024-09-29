package CHAPTER2;
public class baitap5 {
public static void main (String[] args )
{
	Student st=new Student();
	st.setName("Do Lam");
	st.setTuoi(18);
	st.setDiachi("Thua Thien Hue");
	st.setMa("24GITE056");
	st.setDiemtoan(9.8);
	st.setDiemvan(7.6);
	st.setDiemTa(8.5);
	st.diemtb();
	System.out.println("Thong tin hoc sinh");
	st.show();
}
}
class Student{ 
	String name;
	int tuoi;
	String diachi;
	double diem;
	String masv;
	double  diemtoan, diemvan, diemta;
	double diemtb;
	public void setName(String a)
	{
		this.name=a;
	}
	public void setTuoi(int b)
	{
		this.tuoi=b;
	}
	public void setDiachi(String c)
	{
		this.diachi=c;
	}
	public void setMa(String ma)
	{
		this.masv=ma;
	}
	public void setDiemtoan(double  x)
	{
	this.diemtoan=x;
	}
	public void setDiemvan(double  y)
	{
		this.diemvan=y;
	}
	public void setDiemTa(double  z)
	{
		this.diemta=z;
	}
	public double  diemtb()
	{
		return diemtb=(diemtoan+ diemvan + diemta)/3;
	}
	void show()
	{
		System.out.println(name);
		System.out.println("tuoi: "+tuoi);
		System.out.println("Dia chi: "+ diachi);
		System.out.println("ma sinh vien: " + masv);
		System.out.println("diem trung binh sinh vien: " + diemtb);
	}
}

