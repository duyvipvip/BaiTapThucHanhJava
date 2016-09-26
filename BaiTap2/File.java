package BaiTap2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import BaiTap1.KySu;

public class File {
	public static void NghiFile(List<MayTinh> ks, String path){
		try {
			FileOutputStream ops	= new FileOutputStream(path);
			ObjectOutputStream	oops = new ObjectOutputStream(ops);
			oops.writeObject(ks);
			oops.flush();
			oops.close();
			ops.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static List<MayTinh> DocFile(String path){
		List<MayTinh> l= new ArrayList<MayTinh>();
		
		
		try {
			FileInputStream finput	= new FileInputStream(path);
			ObjectInputStream Ojinput	= new ObjectInputStream(finput);
			Object oj= Ojinput.readObject();
			l= (List<MayTinh>) oj;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}
}
