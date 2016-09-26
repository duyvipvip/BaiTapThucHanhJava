package BaiTap2;

import java.io.Serializable;
import java.util.Scanner;

public class May implements Serializable, Comparable<May>{
	private String NhanHieu;
	private NhaSanXuat NhaSanXuat;
	private int GiaThanh;
	
	public String getNhanHieu() {
		return NhanHieu;
	}

	public void setNhanHieu(String nhanHieu) {
		NhanHieu = nhanHieu;
	}

	public NhaSanXuat getNhaSanXuat() {
		return NhaSanXuat;
	}

	public void setNhaSanXuat(NhaSanXuat nhaSanXuat) {
		NhaSanXuat = nhaSanXuat;
	}

	public int getGiaThanh() {
		return GiaThanh;
	}

	public void setGiaThanh(int giaThanh) {
		GiaThanh = giaThanh;
	}

	public void Nhap(){
		NhaSanXuat= new NhaSanXuat();
		NhaSanXuat.Nhap();
		this.NhaSanXuat= NhaSanXuat;
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap nhan hieu: ");
		NhanHieu = sc.nextLine();
		
		
		System.out.println("Moi ban nhap gia thanh: ");
		GiaThanh = sc.nextInt();
		sc.nextLine();
	}

	public String toString() {
		return "\nNhanHieu: " + NhanHieu
			+ "\nNhaSanXuat: " + NhaSanXuat
			+ "\nGiaThanh: " + GiaThanh;
	}
	public int compareTo(May o) {
		// TODO Auto-generated method stub
		if(this.getGiaThanh()< o.getGiaThanh()){
			return 1;
		}
		return -1;
	}
}
