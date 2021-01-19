package SatinAl;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SATINAL
{
	public static void SatinAl(String film,String seans,int[] koltuk,int tutar, String tarih)
	{
		JFrame frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BILETINIZIN SATIN ALIMI GERCEKLESMISTIR!!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(30, 41, 594, 89);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_11 = new JLabel("FILME GIDILECEK TARIH:" + tarih);
		lblNewLabel_11.setForeground(Color.WHITE);		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_11.setBounds(30, 130,600, 41);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_1 = new JLabel("FILM:" + film);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(30, 170,350, 41);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("SEANS:" + seans);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(30, 221,350, 41);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("KOLTUK NO:" + Arrays.toString(koltuk));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_5.setBounds(30, 272,500, 41);
		frame.getContentPane().add(lblNewLabel_5);
		
		int randomNumber;
		Random random = new Random();
		randomNumber = random.nextInt(899999) + 100000;
		
		JLabel lblNewLabel_7 = new JLabel("TUTAR:" + tutar);
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_7.setBounds(30, 323, 350, 41);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("BARKOD NO:" + randomNumber);
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_8.setBounds(30, 374, 350, 41);
		frame.getContentPane().add(lblNewLabel_8);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{	
                                String sqlSorgu;
				sqlSorgu = "INSERT INTO bilet_bilgi (film,seans,koltuk,tutar,barkod) "
							+ "VALUES (" + "'" + film + "'" + ",'" + seans + "'" + ",'" + Arrays.toString(koltuk) + "'" + ",'" + tutar + "'" + ",'" + randomNumber + "')" ;
                                Otomasyon.baglanti.ekle(sqlSorgu);
                                
                                System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(300,400,100,30);
		frame.add(btnNewButton);
		
                
		
		
		frame.setBounds(101,101,650,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
