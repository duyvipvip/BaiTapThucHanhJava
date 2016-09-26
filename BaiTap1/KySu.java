package BaiTap1;

import java.util.Scanner;

public class KySu extends Person  {
	public int getNamTotNgiep() {
		return NamTotNgiep;
	}

	private String NgayHoc;
	private int NamTotNgiep;
	
	public void Nhap(){
		super.Nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi Ban Nhap Vao Ngay Hoc: ");
		NgayHoc	= sc.nextLine();
		
		System.out.println("Moi Ban Nhap Vao Nam Tot Ngiep: ");
		NamTotNgiep	= Integer.parseInt(sc.nextLine());
	}

	public String toString() {
		return "\nHo Ten : " + getHoTen()
			+ "\nNgay Sinh: "+ getNgaySinh()
			+ "\nQue Quan: "+ getQueQuan()
			+"\nNgay Hoc: "+ NgayHoc
			+"\nNam Tot Ngiep: "+ NamTotNgiep;
	}

	
}
