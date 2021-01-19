package SalonSecimi;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class SinemaSalonSecimi 
{
	public static String seans;
	
	public static void main(String args[])
	{
		
		Salonlar.Salon1 Salon1 = new Salonlar.Salon1();
		Salonlar.Salon2 Salon2 = new Salonlar.Salon2();
		Salonlar.Salon3 Salon3 = new Salonlar.Salon3();
		Salonlar.Salon4 Salon4 = new Salonlar.Salon4();
		Salonlar.Salon5 Salon5 = new Salonlar.Salon5();
		Salonlar.Salon6 Salon6 = new Salonlar.Salon6();
		Salonlar.Salon7 Salon7 = new Salonlar.Salon7();
		Salonlar.Salon8 Salon8 = new Salonlar.Salon8();
		JFrame Frame = new JFrame("SALON SECIM EKRANI"); 
		Frame.getContentPane().setBackground(Color.DARK_GRAY);
		Frame.setLayout(null);
		Frame.setLocation(0,0);
		Frame.setSize(1500,800);	
		
		
		Image img1 = new ImageIcon(SinemaSalonSecimi.class.getResource("doktor.jpg")).getImage();
		JButton Film1 = new JButton(new ImageIcon(img1));
		Film1.setLayout(null);
		Film1.setLocation(50,30);
		Film1.setSize(200,200);
		Frame.add(Film1);
			
		Image img2 = new ImageIcon(SinemaSalonSecimi.class.getResource("suicidesquad.jpeg")).getImage();
		JButton Film2 = new JButton(new ImageIcon(img2));
		Film2.setLayout(null);
		Film2.setLocation(450,30);
		Film2.setSize(200,200);

		Frame.add(Film2);
		
		Image img3 = new ImageIcon(SinemaSalonSecimi.class.getResource("sirinler.jpeg")).getImage();
		JButton Film3 = new JButton(new ImageIcon(img3));
		Film3.setLayout(null);
		Film3.setLocation(850,30);
		Film3.setSize(200,200);

		Frame.add(Film3);
		
		Image img4 = new ImageIcon(SinemaSalonSecimi.class.getResource("karayip.jpeg")).getImage();
		JButton Film4 = new JButton(new ImageIcon(img4));
		Film4.setLayout(null);
		Film4.setLocation(1250,30);
		Film4.setSize(200,200);

		Frame.add(Film4);
	
		Image img5 = new ImageIcon(SinemaSalonSecimi.class.getResource("avatar.jpeg")).getImage();
		JButton Film5 = new JButton(new ImageIcon(img5));
		Film5.setLayout(null);
		Film5.setLocation(50,400);
		Film5.setSize(200,200);

		Frame.add(Film5);
		
		Image img6 = new ImageIcon(SinemaSalonSecimi.class.getResource("interstellar.jpeg")).getImage();
		JButton Film6 = new JButton(new ImageIcon(img6));
		Film6.setLayout(null);
		Film6.setLocation(450,400);
		Film6.setSize(200,200);

		Frame.add(Film6);
		
		Image img7 = new ImageIcon(SinemaSalonSecimi.class.getResource("malefiz.jpeg")).getImage();
		JButton Film7 = new JButton(new ImageIcon(img7));
		Film7.setLayout(null);
		Film7.setLocation(850,400);
		Film7.setSize(200,200);

		Frame.add(Film7);
		
		Image img8 = new ImageIcon(SinemaSalonSecimi.class.getResource("ayla.jpeg")).getImage();
		JButton Film8 = new JButton(new ImageIcon(img8));
		Film8.setLayout(null);
		Film8.setLocation(1250,400);
		Film8.setSize(200,200);
		Frame.add(Film8);
		
		///////////////////////SALON 1//////////////////////
		
		JPanel jp = new JPanel();
		jp.setBackground(Color.DARK_GRAY);
		jp.setLocation(50,240);
		jp.setSize(200,30);
		Frame.add(jp);
		
		JLabel jl = new JLabel("SALON 1");
		jl.setForeground(Color.YELLOW);
		jl.setFont(new Font("Broadway", Font.PLAIN, 25));
		jp.add(jl);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.DARK_GRAY);
		panel1.setBounds(50,280,200,100);
		Frame.add(panel1);
		
		JButton ch1 = new JButton("10.30");
		ch1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "10.30";
				JOptionPane.showMessageDialog(null,"SALON 1 10.30 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon1.main(null);
			}
		});	
		panel1.add(ch1);
		JButton ch2 = new JButton("13.00");
		ch2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "13.00";
				JOptionPane.showMessageDialog(null,"SALON 1 13.00 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon1.main(null);
			}
		});	
		panel1.add(ch2);
		JButton ch3 = new JButton("15.30");
		ch3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "15.30";
				JOptionPane.showMessageDialog(null,"SALON 1 15.30 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon1.main(null);
			}
		});	
		panel1.add(ch3);
		JButton ch4 = new JButton("18.00");
		ch4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "18.00";
				JOptionPane.showMessageDialog(null,"SALON 1 18.00 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon1.main(null);
			}
		});	
		panel1.add(ch4);
		JButton ch5 = new JButton("21.30");
		ch5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "21.30";
				JOptionPane.showMessageDialog(null,"SALON 1 21.30 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon1.main(null);
			}
		});	
		panel1.add(ch5);
		
		//////////////////////////////////////SALON2/////////////////////
		
		JPanel jp1 = new JPanel();
		jp1.setBackground(Color.DARK_GRAY);
		jp1.setLocation(450,240);
		jp1.setSize(200,30);
		Frame.add(jp1);
		
		
		JLabel jl1 = new JLabel("SALON 2");
		jl1.setForeground(Color.YELLOW);
		jl1.setFont(new Font("Broadway", Font.PLAIN, 25));
		jp1.add(jl1);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.DARK_GRAY);
		panel2.setBounds(450,280,200,100);
		Frame.add(panel2);
		
		JButton ch6 = new JButton("10.30");
		ch6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "10.30";
				JOptionPane.showMessageDialog(null,"SALON 2 10.30 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon2.main(null);
			}
		});	
		panel2.add(ch6);
		JButton ch7 = new JButton("13.00");
		ch7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "13.00";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 2 13.00 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon2.main(null);
			}
		});	
		panel2.add(ch7);
		JButton ch8 = new JButton("15.30");
		ch8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "15.30";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 2 15.30 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon2.main(null);
			}
		});	
		panel2.add(ch8);
		JButton ch9 = new JButton("18.00");
		ch9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "18.00";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 2 18.00 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon2.main(null);
			}
		});	
		panel2.add(ch9);
		JButton ch10 = new JButton("21.30");
		ch10.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "21.30";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 2 21.30 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon2.main(null);
			}
		});	
		panel2.add(ch10);
		
		//////////////////////////////////SALON3//////////////////////////
		
		JPanel jp2 = new JPanel();
		jp2.setBackground(Color.DARK_GRAY);
		jp2.setLocation(850,240);
		jp2.setSize(200,30);
		Frame.add(jp2);
		
		JLabel jl2 = new JLabel("SALON 3");
		jl2.setForeground(Color.YELLOW);
		jl2.setFont(new Font("Broadway", Font.PLAIN, 25));
		jp2.add(jl2);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.DARK_GRAY);
		panel3.setBounds(850,280,200,100);
		Frame.add(panel3);
		
		JButton ch11 = new JButton("10.30");
		ch11.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "10.30";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 3 10.30 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon3.main(null);
			}
		});	
		panel3.add(ch11);
		JButton ch12 = new JButton("13.00");
		ch12.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "13.00";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 3 13.00 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon3.main(null);
			}
		});	
		panel3.add(ch12);
		JButton ch13 = new JButton("15.30");
		ch13.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "15.30";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 3 15.30 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon3.main(null);
			}
		});	
		panel3.add(ch13);
		JButton ch14 = new JButton("18.00");
		ch14.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "18.00";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 3 18.00 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon3.main(null);
			}
		});	
		panel3.add(ch14);
		JButton ch15 = new JButton("21.30");
		ch15.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "21.30";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 3 21.30 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon3.main(null);
			}
		});	
		panel3.add(ch15);
		
		/////////////////////SALON4/////////////////////////////////
		
		JPanel jp3 = new JPanel();
		jp3.setBackground(Color.DARK_GRAY);
		jp3.setLocation(1250,240);
		jp3.setSize(200,30);
		Frame.add(jp3);
		
		JLabel jl3 = new JLabel("SALON 4");
		jl3.setForeground(Color.YELLOW);
		jl3.setFont(new Font("Broadway", Font.PLAIN, 25));
		jp3.add(jl3);
		
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.DARK_GRAY);
		panel4.setBounds(1250,280,200,100);
		Frame.add(panel4);
		
		JButton ch16 = new JButton("10.30");
		ch16.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "10.30";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 4 10.30 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon4.main(null);
			}
		});	
		panel4.add(ch16);
		JButton ch17 = new JButton("13.00");
		ch17.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "13.00";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 4 13.00 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon4.main(null);
			}
		});	
		panel4.add(ch17);
		JButton ch18 = new JButton("15.30");
		ch18.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "15.30";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 4 15.30 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon4.main(null);
			}
		});	
		panel4.add(ch18);
		JButton ch19 = new JButton("18.00");
		ch19.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "18.00";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 4 18.00 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon4.main(null);
			}
		});	
		panel4.add(ch19);
		JButton ch20 = new JButton("21.30");
		ch20.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "21.30";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 4 21.30 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon4.main(null);
			}
		});	
		panel4.add(ch20);
		
		//////////////////////////SALON5///////////////////////////////
		
		JPanel jp4 = new JPanel();
		jp4.setBackground(Color.DARK_GRAY);
		jp4.setLocation(50,610);
		jp4.setSize(200,30);
		Frame.add(jp4);
		
		JLabel jl4 = new JLabel("SALON 5");
		jl4.setForeground(Color.YELLOW);
		jl4.setFont(new Font("Broadway", Font.PLAIN, 25));
		jp4.add(jl4);
		
		JPanel panel5 = new JPanel();
		panel5.setBackground(Color.DARK_GRAY);
		panel5.setBounds(50,650,200,100);
		Frame.add(panel5);
		
		JButton ch21 = new JButton("10.30");
		ch21.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "10.30";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 5 10.30 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon5.main(null);
			}
		});	
		panel5.add(ch21);
		JButton ch22 = new JButton("13.00");
		ch22.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "13.00";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 5 13.00 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon5.main(null);
			}
		});	
		panel5.add(ch22);
		JButton ch23 = new JButton("15.30");
		ch23.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "15.30";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 5 15.30 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon5.main(null);
			}
		});	
		panel5.add(ch23);
		JButton ch24 = new JButton("18.00");
		ch24.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "18.00";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 5 18.00 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon5.main(null);
			}
		});	
		panel5.add(ch24);
		JButton ch25 = new JButton("21.30");
		ch25.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "21.30";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 5 21.30 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon5.main(null);
			}
		});	
		panel5.add(ch25);
		
		//////////////////////////////////SALON 6//////////////////////////////
		
		JPanel jp5 = new JPanel();
		jp5.setBackground(Color.DARK_GRAY);
		jp5.setLocation(450,610);
		jp5.setSize(200,30);
		Frame.add(jp5);
		
		JLabel jl5 = new JLabel("SALON 6");
		jl5.setForeground(Color.YELLOW);
		jl5.setFont(new Font("Broadway", Font.PLAIN, 25));
		jp5.add(jl5);
		
		JPanel panel6 = new JPanel();
		panel6.setBackground(Color.DARK_GRAY);
		panel6.setBounds(450,650,200,100);
		Frame.add(panel6);
		
		JButton ch26 = new JButton("10.30");
		ch26.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "10.30";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 6 10.30 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon6.main(null);
			}
		});	
		panel6.add(ch26);
		JButton ch27 = new JButton("13.00");
		ch27.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "13.00";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 6 13.00 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon6.main(null);
			}
		});	
		panel6.add(ch27);
		JButton ch28 = new JButton("15.30");
		ch28.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 6 15.30 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon6.main(null);
			}
		});	
		panel6.add(ch28);
		JButton ch29 = new JButton("18.00");
		ch29.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "18.00";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 6 18.00 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon6.main(null);
			}
		});	
		panel6.add(ch29);
		JButton ch30 = new JButton("21.30");
		ch30.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "21.30";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 6 21.30 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon6.main(null);
			}
		});	
		panel6.add(ch30);
		
		////////////////////////////SALON 7/////////////////////////////////////
		
		JPanel jp6 = new JPanel();
		jp6.setBackground(Color.DARK_GRAY);
		jp6.setLocation(850,610);
		jp6.setSize(200,30);
		Frame.add(jp6);
		
		JLabel jl6 = new JLabel("SALON 7");
		jl6.setForeground(Color.YELLOW);
		jl6.setFont(new Font("Broadway", Font.PLAIN, 25));
		jp6.add(jl6);
		
		JPanel panel7 = new JPanel();
		panel7.setBackground(Color.DARK_GRAY);
		panel7.setBounds(850,650,200,100);
		Frame.add(panel7);
		
		JButton ch31 = new JButton("10.30");
		ch31.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "10.30";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 7 10.30 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon7.main(null);
			}
		});	
		panel7.add(ch31);
		JButton ch32 = new JButton("13.00");
		ch32.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "13.00";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 7 13.00 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon7.main(null);
			}
		});	
		panel7.add(ch32);
		JButton ch33 = new JButton("15.30");
		ch33.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "15.30";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 7 15.30 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon7.main(null);
			}
		});	
		panel7.add(ch33);
		JButton ch34 = new JButton("18.00");
		ch34.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "18.00";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 7 18.00 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon7.main(null);
			}
		});	
		panel7.add(ch34);
		JButton ch35 = new JButton("21.30");
		ch35.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "21.30";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 7 21.30 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon7.main(null);
			}
		});	
		panel7.add(ch35);
		
		///////SALON 8////////////////////////
		
		JPanel jp7 = new JPanel();
		jp7.setBackground(Color.DARK_GRAY);
		jp7.setLocation(1250,610);
		jp7.setSize(200,30);
		Frame.add(jp7);
		
		JLabel jl7 = new JLabel("SALON 8");
		jl7.setForeground(Color.YELLOW);
		jl7.setFont(new Font("Broadway", Font.PLAIN, 25));
		jp7.add(jl7);
		
		JPanel panel8 = new JPanel();
		panel8.setBackground(Color.DARK_GRAY);
		panel8.setBounds(1250,650,200,100);
		Frame.add(panel8);
		
		JButton ch36 = new JButton("10.30");
		ch36.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "10.30";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 8 10.30 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon8.main(null);
			}
		});	
		panel8.add(ch36);
		
		JButton ch37 = new JButton("13.00");
		ch37.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "13.00";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 8 13.00 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon8.main(null);
			}
		});	
		panel8.add(ch37);
		JButton ch38 = new JButton("15.30");
		ch38.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "15.30";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 8 15.30 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon8.main(null);
			}
		});	
		panel8.add(ch38);
		JButton ch39 = new JButton("18.00");
		ch38.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "18.00";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 8 18.00 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon8.main(null);
			}
		});	
		panel8.add(ch39);
		JButton ch40 = new JButton("21.30");
		ch40.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				seans = "21.30";
				new JOptionPane();
				JOptionPane.showMessageDialog(null,"SALON 8 21.00 SEANSINA YONLENDIRILIYORSUNUZ!!");
				Salon8.main(null);
			}
		});	
		panel8.add(ch40);
	
	Frame.setVisible(true);
	}

}
