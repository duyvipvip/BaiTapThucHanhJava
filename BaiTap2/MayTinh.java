package BaiTap2;

import java.util.Scanner;

public class MayTinh extends May{
	private int TocDo;
	private int DungLuongRam;
	private int DungLuongHDD;

	public void Nhap(){
		super.Nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap toc do: ");
		TocDo = Integer.parseInt(sc.nextLine());
		
		
		System.out.println("Moi ban nhap dung luong ram: ");
		DungLuongRam = Integer.parseInt(sc.nextLine());
		
		System.out.println("Moi ban nhap dung luong HDD: ");
		DungLuongHDD = Integer.parseInt(sc.nextLine());
	}

	@Override
	public String toString() {
		return "\nToc Do: "+ TocDo
			+	"\nDung Luong Ram: "+ DungLuongRam
			+	"\nDung Luong HDD: "+ DungLuongHDD
			+	"\nNhan Hieu: " + getNhanHieu()
			+ 	"\nGia Thanh: "+ getGiaThanh()
			+ 	"\nTen Nha San Xuat: "+ this.getNhaSanXuat().getTenNSX()
			+ 	"\nDia Chi: "+ this.getNhaSanXuat().getDiaChi();
	}

	
	
}
