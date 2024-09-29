package CHAPTER2;

public class bt6 {

	public static void main(String[] args) {
		Congty a=new Congty();
		a.setcongTy("DO LAM","Nam Dong-Hue","Bao Hiem");
		a.setcongTy(150000.000,200000.000 );
		a.show();
	}
}
class Congty{
	private String name;
	private String diaChi;
	private double chiPhi;
	private double thuNhap;
	private String phucLoi;
	public void setcongTy(String a, String b, String c)
	{
		this.name=a;
		this.diaChi=b;
		this.phucLoi=c;
	}
	public void setcongTy(double a, double b)
	{
		this.chiPhi=a;
		this.thuNhap=b;
	}
	public void show() {
		System.out.println("Ho va ten: " + name);
		System.out.println("Dia chi: "+ diaChi);
		System.out.println("Chi phi: " + chiPhi+" VND");
		System.out.println("Thu nhap: " + thuNhap+" VND");
		System.out.println("Phuc loi xa hoi: "+ phucLoi);
		
	}
}
