package BaiTap4;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.*;

public class BaiTapUI extends JFrame{
	JTextArea txtNoiDung;
	JButton btnDocFile, btnNghiFile, btnThoat;
	JFileChooser FileDialog= new JFileChooser();
	
	public BaiTapUI(String TieuDe){
		super(TieuDe);
		Control();
		Event();
	}
	
	
	public void ShowWindow(){
		this.setSize(500, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void Control(){
		//tạo panel chính
		JPanel pnMain= new JPanel();
		pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
		add(pnMain);
		
		
		//Khai báo panel tieu dề
		JPanel pnTieuDe= new JPanel();
		pnMain.add(pnTieuDe);
		JLabel lblTieuDe = new JLabel("Nội Dung File");
		lblTieuDe.setForeground(Color.blue);
		lblTieuDe.setFont(new Font("Arial", Font.BOLD, 20));
		pnTieuDe.add(lblTieuDe);
		
		
		//Khai báo panel tieu dề
		JPanel pnNoiDung= new JPanel();
		pnMain.add(pnNoiDung);
		txtNoiDung = new JTextArea(10,40);
		pnNoiDung.add(txtNoiDung);
		
		//Khai báo các nút lệnh
		JPanel pnNutLenh = new JPanel();
		pnMain.add(pnNoiDung);
		
		btnDocFile = new JButton("Đoc File");
		btnNghiFile = new JButton("Nghi File");
		btnThoat = new JButton("Thoát");
		pnNoiDung.add(btnDocFile);
		pnNoiDung.add(btnNghiFile);
		pnNoiDung.add(btnThoat);
	}
	
	private void Event() {
		// TODO Auto-generated method stub
		btnDocFile.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int val = FileDialog.showOpenDialog(null);
				if(val== JFileChooser.APPROVE_OPTION){
					File file = FileDialog.getSelectedFile();
					try {
						FileReader fr= new FileReader(file);
						BufferedReader br= new BufferedReader(fr);
						String dong="";
						txtNoiDung.setText("");
						do{
							dong= br.readLine();
							if(dong!=null){
								txtNoiDung.append(dong+ "\n");
							}
						}while(dong!=null);
						br.close();
						fr.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
			}
		});
		btnNghiFile.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int val = FileDialog.showSaveDialog(null);
				if(val== JFileChooser.APPROVE_OPTION){
					File file = FileDialog.getSelectedFile();
					try {
						FileWriter fr= new FileWriter(file);
						BufferedWriter br= new BufferedWriter(fr);
						br.write(txtNoiDung.getText());
						br.close();
						fr.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
			}
		});
		btnThoat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}

}
