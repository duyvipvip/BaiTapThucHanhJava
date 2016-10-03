package BaiTap1;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame {
	JButton btnGiai, btnThoat, btnHelp;
	JLabel lblGiaiPhuongTrinhBac1, lblHeSoA, lblKetQua, lblHeSoB;
	JTextField txtHeSoA, txtHeSoB, txtKetQua;
	public UI(String TieuDe){
		super(TieuDe);
		AddControl();
		AddEvent();
	}
	
	
	private void AddControl() {
		// TODO Auto-generated method stub
		
		//tạo một panel main
		JPanel pnMain= new JPanel();
		pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
		add(pnMain);
		/***************************************
		 * PHẦN TIÊU ĐỀ
		 **************************************/
		JPanel pnTieuDe= new JPanel();
		pnMain.add(pnTieuDe);
		lblGiaiPhuongTrinhBac1 = new JLabel("Giải Phương Trình Bậc Nhất");
		lblGiaiPhuongTrinhBac1.setFont(new Font("Arial", Font.BOLD, 20));
		lblGiaiPhuongTrinhBac1.setForeground(Color.blue);
		pnTieuDe.add(lblGiaiPhuongTrinhBac1);
		
		
		/***************************************
		 * PHẦN Hệ Số A
		 **************************************/
		JPanel pnHeSoA= new JPanel();
		pnMain.add(pnHeSoA);
		lblHeSoA = new JLabel("Hệ Số A: ");
		txtHeSoA = new JTextField(15);
		pnHeSoA.add(lblHeSoA);
		pnHeSoA.add(txtHeSoA);
		
		/***************************************
		 * PHẦN Hệ Số B
		 **************************************/
		JPanel pnHeSoB = new JPanel();
		pnMain.add(pnHeSoB);
		lblHeSoB = new JLabel("Hệ Số B: ");
		txtHeSoB = new JTextField(15);
		pnHeSoB.add(lblHeSoB);
		pnHeSoB.add(txtHeSoB);
		
		/***************************************
		 * PHẦN NÚT LỆNH
		 **************************************/
		JPanel pnNutLenh = new JPanel();
		pnMain.add(pnNutLenh);
		btnGiai = new JButton("Giải");
		btnThoat = new JButton("Thoát");
		btnHelp	 = new JButton("Help");
		pnNutLenh.add(btnGiai);
		pnNutLenh.add(btnThoat);
		pnNutLenh.add(btnHelp);
		
		
		/***************************************
		 * PHẦN Hệ Số B
		 **************************************/
		JPanel pnKetQua = new JPanel();
		pnMain.add(pnKetQua);
		lblKetQua = new JLabel("Kết Quả: ");
		txtKetQua = new JTextField(15);
		pnKetQua.add(lblKetQua);
		pnKetQua.add(txtKetQua);
	}
	private void AddEvent() {
		// TODO Auto-generated method stub
		btnThoat.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		btnGiai.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double SoA= new Double(txtHeSoA.getText());
				double SoB= new Double(txtHeSoB.getText());
				
				if(SoA==0 && SoB==0){
					txtKetQua.setText("Phương Trình Vô Số Ngiệm");
				}else if(SoA==0 && SoB!=0){
					txtKetQua.setText("Phương Trình Vô Ngiệm");
				}else{
					txtKetQua.setText("x = "+ -SoB/SoA);
				}

			}
		});
		
		btnHelp.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String msg= "Email:  havanduy709@gmail.com";
				JOptionPane.showMessageDialog(null, msg);
			}
		});
	}

	public void Showindow(){
		this.setSize(400, 250);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
