package GirisEkrani;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Otomasyon.baglanti;

public class YoneticiBilgi2 {
	
	private JFrame frame1;
	private JTable table;
	
	DefaultTableModel modelim = new DefaultTableModel();
	
	Object[] kolonlar = {"uye_ad","uye_soyad","uye_eposta","uye_kulaniciadi","uye_sifre"};  
	Object[] satirlar = new Object[5];
	Object[] satirlar1 = new Object[5];
	private JTextField txt_ad;
	private JTextField txt_soyad;
	private JTextField txt_eposta;
	private JTextField txt_kullanici;
	private JTextField txt_sifre;
	private JTextField txt_sorgu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YoneticiBilgi2 window = new YoneticiBilgi2();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public YoneticiBilgi2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame1 = new JFrame();
		frame1.getContentPane().setLayout(null);
		frame1.getContentPane().setBackground(Color.DARK_GRAY);
		
		txt_sorgu = new JTextField();
		txt_sorgu.setBounds(60, 530, 400, 30);
		frame1.getContentPane().add(txt_sorgu);
		txt_sorgu.setColumns(10);
		
		JComboBox<Object> comboBox = new JComboBox<Object>();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] {"AD", "SOYAD", "E-POSTA", "KULLANICIADI"}));
		comboBox.setBounds(348, 480,120, 30);
		frame1.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Sorgula");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelim.setRowCount(0);
				
				String sql_sorgu=null;
				
				String alan = txt_sorgu.getText();
				
				ResultSet myRs = null;
				
				int secilen = comboBox.getSelectedIndex();
				
				if(secilen == 0 ) {
					sql_sorgu = "select * from uye_bilgi where uye_ad like '"+ alan +"%'";
				} else if(secilen == 1)
				{
					sql_sorgu = "select * from uye_bilgi where uye_soyad like '"+ alan +"%'";
				} else if(secilen == 2)
				{
					sql_sorgu = "select * from uye_bilgi where uye_eposta like '"+ alan +"%'";
				} else if(secilen == 3)
				{
					sql_sorgu = "select * from uye_bilgi where uye_kulaniciadi = "+ alan +"%'";
				}
				
								
				//System.out.println(sql_sorgu);
				
				myRs = baglanti.sorgula(sql_sorgu);
				
				try {
					while(myRs.next()) {
						satirlar1[0] = myRs.getString("uye_ad");
						satirlar1[1] = myRs.getString("uye_soyad");
						satirlar1[2] = myRs.getString("uye_eposta");
						satirlar1[3] = myRs.getString("uye_kulaniciadi");	
						satirlar1[4] = myRs.getString("uye_sifre");
						modelim.addRow(satirlar1);
					}
				} catch (SQLException e1) {					
					e1.printStackTrace();
				}

				table.setModel(modelim);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(178, 580, 150, 30);
		frame1.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("S\u0130L");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String ad,sqlSorgu;
				ad = txt_ad.getText();
				
				sqlSorgu = "DELETE FROM uye_bilgi WHERE uye_ad='" + ad + "'";
				
				Otomasyon.baglanti.sil(sqlSorgu);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(310, 400, 150, 30);
		frame1.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("L\u0130STELE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				modelim.setRowCount(0);
				ResultSet myRs = Otomasyon.baglanti.yap();
				
				try {
					while(myRs.next())
					{
						satirlar[0] = myRs.getString("uye_ad"); 
						satirlar[1] = myRs.getString("uye_soyad"); 
						satirlar[2] = myRs.getString("uye_eposta"); 
						satirlar[3] = myRs.getString("uye_kulaniciadi"); 
						satirlar[4] = myRs.getString("uye_sifre"); 
						modelim.addRow(satirlar);
					}
				} 
				catch (SQLException e1) 
				{
					e1.printStackTrace();
				}

				
				table.setModel(modelim);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(178, 50, 150, 30);
		frame1.getContentPane().add(btnNewButton_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(700, 50, 563, 380);
		frame1.getContentPane().add(scrollPane);
		
		table = new JTable();
		modelim.setColumnIdentifiers(kolonlar);
		modelim.addRow(satirlar);
		table.setModel(modelim);
		table.setBounds(60, 450, 450, 240);
		scrollPane.setViewportView(table);
		
		table.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				txt_ad.setText((String) modelim.getValueAt(table.getSelectedRow(), 0));
				txt_soyad.setText((String) modelim.getValueAt(table.getSelectedRow(), 1));
				txt_eposta.setText((String) modelim.getValueAt(table.getSelectedRow(), 2));
				txt_kullanici.setText((String) modelim.getValueAt(table.getSelectedRow(), 3));
				txt_sifre.setText((String) modelim.getValueAt(table.getSelectedRow(), 4));
			}
		});
		
		txt_ad = new JTextField();
		txt_ad.setBounds(260, 120, 200, 30);
		frame1.getContentPane().add(txt_ad);
		txt_ad.setColumns(10);
		
		JLabel lbl_ad = new JLabel("\u00DCYE ADI:");
		lbl_ad.setForeground(Color.WHITE);
		lbl_ad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl_ad.setBackground(Color.WHITE);
		lbl_ad.setBounds(60, 120, 150, 30);
		frame1.getContentPane().add(lbl_ad);
		
		txt_soyad = new JTextField();
		txt_soyad.setBounds(260, 170, 200, 30);
		frame1.getContentPane().add(txt_soyad);
		txt_soyad.setColumns(10);
		
		JLabel lbl_soyad = new JLabel("\u00DCYE SOYADI:");
		lbl_soyad.setForeground(Color.WHITE);
		lbl_soyad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl_soyad.setBounds(60, 170, 150, 30);
		frame1.getContentPane().add(lbl_soyad);
		
		JLabel lbl_eposta = new JLabel("\u00DCYE EPOSTA:");
		lbl_eposta.setForeground(Color.WHITE);
		lbl_eposta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl_eposta.setBounds(60, 220, 150, 30);
		frame1.getContentPane().add(lbl_eposta);
		
		txt_eposta = new JTextField();
		txt_eposta.setBounds(260, 220, 200, 30);
		frame1.getContentPane().add(txt_eposta);
		txt_eposta.setColumns(10);
		
		JLabel lbl_kullanici = new JLabel("\u00DCYE KULLANICI ADI:");
		lbl_kullanici.setForeground(Color.WHITE);
		lbl_kullanici.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl_kullanici.setBounds(60, 270, 200, 30);
		frame1.getContentPane().add(lbl_kullanici);
		
		txt_kullanici = new JTextField();
		txt_kullanici.setBounds(260, 270, 200, 30);
		frame1.getContentPane().add(txt_kullanici);
		txt_kullanici.setColumns(10);
		
		JLabel lbl_sifre = new JLabel("\u00DCYE S\u0130FRE:");
		lbl_sifre.setForeground(Color.WHITE);
		lbl_sifre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl_sifre.setBounds(60, 320, 200, 30);
		frame1.getContentPane().add(lbl_sifre);
		
		txt_sifre = new JTextField();
		txt_sifre.setBounds(260, 320, 200, 30);
		frame1.getContentPane().add(txt_sifre);
		txt_sifre.setColumns(10);
		
		JButton degistir = new JButton("DE\u011E\u0130\u015ET\u0130R");
		degistir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String ad,soyad,eposta,kullaniciadi,parola,sqlSorgu;
				ad = txt_ad.getText();
				soyad = txt_soyad.getText();
				eposta = txt_eposta.getText();
				kullaniciadi = txt_kullanici.getText();
				parola = txt_sifre.getText();
				sqlSorgu = "UPDATE uye_bilgi SET uye_ad='" + ad + 
						   "', uye_soyad='" + soyad + "', uye_eposta='" + eposta + 
						   "' , uye_kulaniciadi='" + kullaniciadi + "', uye_sifre='" + parola + "' WHERE uye_ad='" + ad + "'";
				
				Otomasyon.baglanti.degistir(sqlSorgu);
			}
		});
		degistir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		degistir.setBounds(60, 400, 150, 30);
		frame1.getContentPane().add(degistir);
		
		JLabel lblNewLabel = new JLabel("ARAMAK \u0130STED\u0130\u011E\u0130N\u0130Z KR\u0130TER");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(60, 479, 278, 30);
		frame1.getContentPane().add(lblNewLabel);
		
		frame1.setBounds(200, 20, 1308, 669);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
