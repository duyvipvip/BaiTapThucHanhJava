package BaiTap1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class main {
	private static final String Path= "C:\\Users\\havanduy\\workspace\\java_training\\text.txt";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nhap();
	}
	
	public static void Nhap(){
		Scanner sc = new Scanner(System.in);
		
		List<KySu> list = new ArrayList();
		
		System.out.println("Moi Ban Nhap Vao So Ky Su: ");
		int SL	= sc.nextInt();
		
		
		for(int i=0; i<SL; i++){
			KySu KS	= new KySu();
			KS.Nhap();
			list.add(KS);
			
		}
		
		File.NghiFile(list, Path);
		List<KySu> doclist = File.DocFile(Path);
		for(KySu ks : doclist){
			System.out.println(ks);
		}
		System.out.println("\nNam Tot ngiep Lon Nhat: ");
		int Max=-1;
		for(KySu ks : doclist){
			if(ks.getNamTotNgiep() > Max){
				Max= ks.getNamTotNgiep() ;
			}
		}
		for(KySu ks : doclist){
			if(ks.getNamTotNgiep() == Max){
				System.out.println(ks);
				break;
			}
		}
	}

}
