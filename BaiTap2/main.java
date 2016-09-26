package BaiTap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class main {
	private static final String Path	= "C:\\Users\\havanduy\\workspace\\java_training\\src\\text.txt";
	private static List<MayTinh> list = new ArrayList();
	private static MayTinh mt;
	private static Scanner sc	= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n============ MENU ===========");
		System.out.println("\n1. Them san pham");
		System.out.println("\n2. Hien thi danh sach san pham");
		System.out.println("\n3. Hien thi danh sach san pham theo nha san xuat");
		System.out.println("\n4. Sap xep danh sach may tinh giam dan");
		System.out.println("\n0. Thoat");
		System.out.println("\n=============================");
		
		int chon;
		do{
			System.out.println("\nXin moi ban chon! ");
			chon = Integer.parseInt(sc.nextLine());
			
			switch (chon) {
				case 0:
					System.out.println("Thoat!");
					break;
				case 1:
					Them();
					break;
				case 2:
					System.out.println("====== Danh sach san pham ====!");
					XuatDS();
					break;
				case 3:
					System.out.println("\nNhap vao nha san xuat:");
					String NhaSanXuat	= sc.nextLine();
					XuatDS(NhaSanXuat);
					break;
				case 4:
					System.out.println("====== Danh sach san pham giam dan ====!");
					DSGiam();
				default:
					System.out.println("\nBan chon sai thao tac!");
					break;
				}
		}while(chon !=0);
	}
	private static void DSGiam() {
		// TODO Auto-generated method stub
		List<MayTinh> temp;
		temp = File.DocFile(Path);
		Collections.sort(temp);
		for(MayTinh MT : temp){
			System.out.println(MT);
		}
	}
	private static void XuatDS(String nhaSanXuat) {

		
		// TODO Auto-generated method stub
		boolean check= false;
		List<MayTinh> temp;
		temp = File.DocFile(Path);
		System.out.println("\n======== Ten Nha San Xuat Can Tim ===========\n");
		for(MayTinh MT : temp){
			if(MT.getNhaSanXuat().getTenNSX().equals(nhaSanXuat)){
				System.out.println(MT);
				check=true;
				break;
			}
		}
		if(check==false){
			System.out.println("Khong Tim Thay Ten Nha San Xuat");
		}
	}
	private static void XuatDS() {
		// TODO Auto-generated method stub
		List<MayTinh> temp;
		temp = File.DocFile(Path);
		for(MayTinh ds : temp){
			System.out.println(ds);
		}
	}
	private static void Them() {
		// TODO Auto-generated method stub
		
		int n=0;
		System.out.println("Moi ban nhap danh sach may tinh: ");
		n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i< n; i++){
			mt= new MayTinh();
			mt.Nhap();
			list.add(mt);
		}
		File.NghiFile(list, Path);
	}

}
