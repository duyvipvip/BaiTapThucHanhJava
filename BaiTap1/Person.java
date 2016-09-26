package BaiTap1;

import java.io.Serializable;
import java.util.Scanner;

public class Person implements Serializable {
	private String HoTen;
	private String NgaySinh;
	private String QueQuan;
	
	
	public void Nhap(){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Moi ban nhap Ho Ten: ");
		HoTen = sc.nextLine();
		
		System.out.println("Moi ban nhap Ngay Sinh: ");
		NgaySinh	= sc.nextLine();
		
		System.out.println("Moi ban nhap Que Quan: ");
		QueQuan	= sc.nextLine();
		
	}


	public String getHoTen() {
		return HoTen;
	}


	public String getNgaySinh() {
		return NgaySinh;
	}


	public String getQueQuan() {
		return QueQuan;
	}
	
	
}
