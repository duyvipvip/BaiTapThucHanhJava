package BaiTap2;

import java.io.Serializable;
import java.util.Scanner;

public class NhaSanXuat implements Serializable {
	private String TenNSX;
	private String DiaChi;
	
	public String getTenNSX() {
		return TenNSX;
	}


	public void setTenNSX(String tenNSX) {
		TenNSX = tenNSX;
	}


	public String getDiaChi() {
		return DiaChi;
	}


	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}


	public void Nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap nhap ten NSX: ");
		TenNSX = sc.nextLine();
	
		
		
		System.out.println("Moi ban nhap dia chi: ");
		DiaChi = sc.nextLine();
	}

	
	public String toString() {
		return "\nTenNSX: " + TenNSX
			+ "\nDiaChi: " + DiaChi;
	}
}
