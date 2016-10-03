package BaiTap2;

import javax.swing.border.TitledBorder;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.*;
public class UI extends JFrame {
	JLabel lblNhapTen, lblDiaChi;
	JTextField txtNhapTen;
	JTextArea txtDiaChi;
	JCheckBox chkDiBoi, chkXemPhim;
	JRadioButton rdbNam, rdbNu;
	JButton btnOK;
	public UI(String TieuDe){
		super(TieuDe);
		AddControl();
		AddEvent();
	}

	public void Showindow(){
		this.setSize(500, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void AddControl() {
		// TODO Auto-generated method stub
		//Tạo panel chính
		JPanel pnMain= new JPanel();
		pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
		add(pnMain);
		/***************************************
		 * PHẦN THÔNG TIN
		 **************************************/
		JPanel pnThongTin = new JPanel();
		pnThongTin.setBorder(new TitledBorder("Thông Tin"));
		pnThongTin.setLayout(new BoxLayout(pnThongTin, BoxLayout.Y_AXIS));
		
		//phần nhập tên
		JPanel pnNhapTen= new JPanel();
		
		lblNhapTen = new JLabel("Nhập Tên: ");
		txtNhapTen = new JTextField(25);
		pnNhapTen.add(lblNhapTen);
		pnNhapTen.add(txtNhapTen);
		
		//phần nhập địa chỉ
		JPanel pnNhapDiaChi= new JPanel();
		lblDiaChi = new JLabel("Nhập Địa Chỉ: ");
		txtDiaChi = new JTextArea(5, 25);
		txtDiaChi.setLineWrap(true);
		txtDiaChi.setWrapStyleWord(true);
		
		JScrollPane jscrollpane = new JScrollPane(txtDiaChi);
		txtDiaChi.setPreferredSize(new Dimension(0, 100));
		pnNhapDiaChi.add(lblDiaChi);
		pnNhapDiaChi.add(jscrollpane);
	
		pnThongTin.add(pnNhapTen);
		pnThongTin.add(pnNhapDiaChi);
		
		/***************************************
		 * PHẦN SỞ THÍCH VÀ GIỚI TINH
		 **************************************/
		JPanel pnSTGT= new JPanel();
		pnSTGT.setLayout(new GridLayout(1, 2));
		
		//phan sở thích
		JPanel pnSoThich = new JPanel();
		pnSoThich.setBorder(new TitledBorder("Sở Thích"));
		pnSoThich.setLayout(new BoxLayout(pnSoThich, BoxLayout.Y_AXIS));
		chkDiBoi = new JCheckBox("Đi Bơi");
		chkXemPhim = new JCheckBox("Đi Xem Phim");
		pnSoThich.add(chkDiBoi);
		pnSoThich.add(chkXemPhim);
		
		//phan gioi tinh
		JPanel pnGioiTinh = new JPanel();
		pnGioiTinh.setBorder(new TitledBorder("Giới Tính"));
		pnGioiTinh.setLayout(new BoxLayout(pnGioiTinh, BoxLayout.Y_AXIS));
		rdbNam = new JRadioButton("Nam");
		rdbNu = new JRadioButton("Nữ");
		ButtonGroup btngr= new ButtonGroup();
		btngr.add(rdbNam);
		btngr.add(rdbNu);

		pnGioiTinh.add(rdbNam);
		pnGioiTinh.add(rdbNu);
		
		pnSTGT.add(pnSoThich);
		pnSTGT.add(pnGioiTinh);
		
		//phan nút nhấn
		JPanel pnNutNhan = new JPanel();
		
		btnOK= new JButton("OK");
		pnNutNhan.add(btnOK);
		
		pnMain.add(pnThongTin);
		pnMain.add(pnSTGT);
		pnMain.add(pnNutNhan);
	}
	private void AddEvent() {
		// TODO Auto-generated method stub
		btnOK.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String msg = "Họ Và Tên: "+ txtNhapTen.getText();
				msg	+= "\nĐia Chỉ: "+txtDiaChi.getText();
				
				if(chkDiBoi.isSelected()==true && chkXemPhim.isSelected()==true){
					msg	+= "\nSở Thích: "+chkDiBoi.getText()+","+chkXemPhim.getText();
				}else if(chkDiBoi.isSelected()==true){
					msg	+= "\nSở Thích: "+chkDiBoi.getText();
				}else if(chkXemPhim.isSelected()==true){
					msg	+= "\nSở Thích: "+chkXemPhim.getText();
				}
				
				if(rdbNam.isSelected()==true){
					msg	+= "\nGiới Tính: "+rdbNam.getText();
				}else if(rdbNu.isSelected()==true){
					msg	+= "\nGiới Tính: "+rdbNu.getText();
				}
				
				JOptionPane.showMessageDialog(null, msg);
			}
		});
	}

}
