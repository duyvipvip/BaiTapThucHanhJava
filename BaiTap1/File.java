package BaiTap1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class File {
	public static void NghiFile(List<KySu> ks, String path){
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
	
	public static List<KySu> DocFile(String path){
		List<KySu> l= new ArrayList<KySu>();
		
		
		try {
			FileInputStream finput	= new FileInputStream(path);
			ObjectInputStream Ojinput	= new ObjectInputStream(finput);
			Object oj= Ojinput.readObject();
			l= (List<KySu>) oj;
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
