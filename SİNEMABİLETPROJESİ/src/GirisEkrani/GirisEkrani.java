package GirisEkrani;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GirisEkrani
{
	public static void main(String args[])
	{
		JFrame Ekran = new JFrame();
		Ekran.setLocation(500,200);
		Ekran.setSize(500,400);
                
                
		JPanel Panel = new JPanel();
		Panel.setBackground(Color.darkGray);
		
		JPanel Panel1 = new JPanel();
		Panel1.setBackground(Color.darkGray);
		Panel1.setSize(300,200);
		Panel1.setLocation(100,200);
		
		JPanel Panel2 = new JPanel();
		Panel2.setBackground(Color.darkGray);
		Panel2.setLocation(50,100);
		Panel2.setSize(400,100);
		
		JLabel Isim = new JLabel("GAZİ SİNEMA SALONU");
		Isim.setForeground(Color.YELLOW);
		Isim.setFont(new Font("Broadway", Font.PLAIN, 30));
		Panel2.add(Isim);
		
		JButton Giris1 = new JButton("ÜYE GİRİŞİ");
		Giris1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				UyeGirisi();
			}
		});
			
		JButton Giris2 = new JButton("ÜYE OL");
		Giris2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				UyeOl();
			}
		});
		
		JButton Giris3 = new JButton("YÖNETİCİ GİRİŞİ");
		Giris3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				YoneticiGiris();
			}
		});


	Ekran.add(Panel1);
	Ekran.add(Panel2);	
	Panel1.add(Giris1);	
	Panel1.add(Giris2);	
	Panel1.add(Giris3);
	Ekran.add(Panel);
        
	Ekran.setVisible(true);
	}

	public static void UyeOl()
	{

			JFrame frame;
			JTextField textField;
			JTextField textField_1;
			JTextField textField_2;
			JTextField textField_3;
			JTextField textField_4;
			
			frame = new JFrame("ÜYE OLMA EKRANI");
			frame.setBounds(500,200,500,400);
			frame.getContentPane().setBackground(Color.DARK_GRAY);
			frame.setBackground(Color.WHITE);
			frame.getContentPane().setLayout(null);
			
			textField = new JTextField();
			textField.setBounds(200,50,200,30);
			frame.getContentPane().add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setBounds(200,100,200,30);
			frame.getContentPane().add(textField_1);
			textField_1.setColumns(10);
			
			textField_2 = new JTextField();
			textField_2.setBounds(200, 150, 200, 30);
			frame.getContentPane().add(textField_2);
			textField_2.setColumns(10);
			
			textField_3 = new JTextField();
			textField_3.setBounds(200, 200, 200, 30);
			frame.getContentPane().add(textField_3);
			textField_3.setColumns(10);
			
			textField_4 = new JTextField();
			textField_4.setBounds(200, 250,200 , 30);
			frame.getContentPane().add(textField_4);
			textField_4.setColumns(10);
			
			JLabel lblNewLabel_1 = new JLabel("AD:");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setBounds(30, 50, 200, 30);
			frame.getContentPane().add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("SOYAD:");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNewLabel_2.setForeground(Color.WHITE);
			lblNewLabel_2.setBounds(30, 100, 200, 30);
			frame.getContentPane().add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("E-POSTA:");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNewLabel_3.setForeground(Color.WHITE);
			lblNewLabel_3.setBounds(30, 150, 200, 30);
			frame.getContentPane().add(lblNewLabel_3);
			
			JLabel lblNewLabel_4 = new JLabel("KULLANICI ADI:");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNewLabel_4.setForeground(Color.WHITE);
			lblNewLabel_4.setBounds(30, 200, 200, 30);
			frame.getContentPane().add(lblNewLabel_4);
			
			JLabel lblNewLabel_5 = new JLabel("PAROLA:");
			lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNewLabel_5.setForeground(Color.WHITE);
			lblNewLabel_5.setBounds(30, 250, 200, 30);
			frame.getContentPane().add(lblNewLabel_5);
			
			JButton btnNewButton_1 = new JButton("\u00DCYE OL ");
			btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNewButton_1.setBounds(150, 300, 150, 30);
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					String ad,soyad,eposta,kullaniciadi,parola,sqlSorgu;
					ad = textField.getText();
					soyad = textField_1.getText();
					eposta = textField_2.getText();
					kullaniciadi = textField_3.getText();
					parola = textField_4.getText();
					sqlSorgu = "INSERT INTO uye_bilgi (uye_ad,uye_soyad,uye_eposta,uye_kulaniciadi,uye_sifre) "
							+ "VALUES (" + "'" + ad + "'" + ",'" + soyad + "'" + ",'" + eposta + "'" + ",'" + kullaniciadi + "'" + ",'" + parola + "')" ;
					Otomasyon.baglanti.ekle(sqlSorgu);
					
					JOptionPane.showMessageDialog(null,"UYELIGINIZ OLUSTURULMUSTUR!!");
					UyeGirisi();
					
				}
			});
			frame.getContentPane().add(btnNewButton_1);
			
	frame.setVisible(true);
	}	
        
	public static void UyeGirisi()
	{
		JFrame frame;
		JTextField textField_5;
		JTextField textField_6;

		
		frame = new JFrame("�YE G�R�� EKRANI");
		frame.setBounds(500,200,500,400);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		

		JLabel lblNewLabel_1 = new JLabel("KULLANICI ADI:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(30, 100, 200, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PAROLA:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(30, 150, 200, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_5 = new JTextField();
		textField_5.setBounds(250,100, 200, 30);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JPasswordField();
		textField_6.setBounds(250,150,200,30);
		frame.add(textField_6);
		
		JButton btnNewButton = new JButton("G\u0130R\u0130\u015E YAP");
		btnNewButton.setBounds(200,230,100,50);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String ad,sifre;
				ad = textField_5.getText();
				sifre = textField_6.getText();
				
				String sql_sorgu = "select count(uye_ad) as giris from uye_bilgi where uye_kulaniciadi='"+ad+"' and uye_sifre='"+sifre+"'";
				
				ResultSet myRs = Otomasyon.baglanti.yap();
				myRs = Otomasyon.baglanti.sorgula(sql_sorgu);
				
				try {
					while(myRs.next()){
						if(myRs.getInt("giris")==1)
						{
							JOptionPane.showMessageDialog(null,"Giriş Başarılı. Sinemamıza Hoşgeldiniz ! :)");
							SalonSecimi.SinemaSalonSecimi.main(null);
						} 
						else 
						{ 
							JOptionPane.showMessageDialog(null,"Giriş Başarısız. Lütfen tekrar deneyin veya üye olunuz.");
						}
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
				});

	frame.setVisible(true);
	}
	
	public static void YoneticiGiris()
	{

		JFrame frame;
		JTextField textField_5;
		JTextField textField_6;

		
		frame = new JFrame("YÖNETİCİ GİRİŞ EKRANI");
		frame.setBounds(500,200,500,400);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		

		JLabel lblNewLabel_1 = new JLabel("KULLANICI ADI:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(30, 100, 200, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PAROLA:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(30, 150, 200, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_5 = new JTextField();
		textField_5.setBounds(250,100, 200, 30);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JPasswordField();
		textField_6.setBounds(250,150,200,30);
		frame.add(textField_6);
		
		JButton btnNewButton = new JButton("G\u0130R\u0130\u015E YAP");
		btnNewButton.setBounds(200,230,100,50);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String ad,sifre;
				ad = textField_5.getText();
				sifre = textField_6.getText();
				
				String sql_sorgu = "select count(ID) as giris from yonetici_bilgi where yonetici_ad='"+ad+"' and yonetici_parola='"+sifre+"'";
				
				ResultSet myRs = Otomasyon.baglanti.yap();
				myRs = Otomasyon.baglanti.sorgula(sql_sorgu);
				
				try {
					while(myRs.next()){
						if(myRs.getInt("giris")==1)
						{
							JOptionPane.showMessageDialog(null,"Giriş Başarılı!!");
							YoneticiBilgi2.main(null);
						} 
						else 
						{ 
							JOptionPane.showMessageDialog(null,"Giriş Başarısız. Lütfen tekrar deneyin!!");
						}
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
				});

	frame.setVisible(true);
	}

}
