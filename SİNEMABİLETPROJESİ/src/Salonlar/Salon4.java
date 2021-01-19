package Salonlar;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import SatinAl.SATINAL;

public class Salon4 extends javax.swing.JFrame
{
	static int[] koltuknumarasi = new int[20];
	static int[] koltuk = new int[20];
	static int koltuksayisi = 0;
	static int flag;
	static int[] yazdir = new int[flag];
	static int Tutar;
	static int tutar1,tutar2;
	static int Secilen1;
	static int Secilen2;
	final int ogr=15;
	final int tam=25;
	
			public void main(String args[])
			{
				
				JFrame Frame = new JFrame("SALON 4 ");
				Frame.getContentPane().setBackground(Color.DARK_GRAY);
				Frame.setLayout(null);
				Frame.setLocation(200,20);
				Frame.setSize(950,700);		

				JPanel Satir = new JPanel();
				Satir.setBackground(Color.white);
				Satir.setLocation(55,20);
				Satir.setSize(170,30);
				Frame.add(Satir);
				
				JLabel perde = new JLabel("PERDE");
				perde.setHorizontalAlignment(0);
				Satir.add(perde);
				
				JPanel jp1 = new JPanel();
				jp1.setBackground(Color.cyan);
				jp1.setLocation(20,65);
				jp1.setSize(20,20);
				Frame.add(jp1);
				
				JLabel jl1 = new JLabel("A");
				jp1.add(jl1);
				
				JPanel jp2 = new JPanel();
				jp2.setBackground(Color.cyan);
				jp2.setLocation(20,115);
				jp2.setSize(20,20);
				Frame.add(jp2);
				
				JLabel jl2 = new JLabel("B");
				jp2.add(jl2);
				
				JPanel jp3 = new JPanel();
				jp3.setBackground(Color.cyan);
				jp3.setLocation(20,165);
				jp3.setSize(20,20);
				Frame.add(jp3);
				
				JLabel jl3 = new JLabel("C");
				jp3.add(jl3);
				
				JPanel jp4 = new JPanel();
				jp4.setBackground(Color.cyan);
				jp4.setLocation(20,215);
				jp4.setSize(20,20);
				Frame.add(jp4);
				
				JLabel jl4 = new JLabel("D");
				jp4.add(jl4);
				
				JPanel jp5 = new JPanel();
				jp5.setBackground(Color.cyan);
				jp5.setLocation(20,265);
				jp5.setSize(20,20);
				Frame.add(jp5);
				
				JLabel jl5 = new JLabel("E");
				jp5.add(jl5);
				
				JButton koltuk1 = new JButton();
				koltuk1.setBackground(Color.orange);
				koltuk1.setLayout(null);
				koltuk1.setLocation(50,60);
				koltuk1.setSize(30,30);
				koltuk1.addActionListener(new ActionListener()
					{
					int sayac=0;
							public void actionPerformed(ActionEvent arg0)
							{
								sayac++;
								
								if(sayac%2 ==1)
								{
									koltuknumarasi[0] = 1;
									koltuksayisi++;
									koltuk1.setBackground(Color.red);
								}
								else
								{
									koltuknumarasi[0] = 0;
									koltuksayisi--;
									koltuk1.setBackground(Color.orange);
								}
							}
					});
				Frame.add(koltuk1);
								
				JLabel koltukno1 = new JLabel ("1");
				koltukno1.setLocation(10,10);
				koltukno1.setSize(10,10);
				koltukno1.setHorizontalAlignment(0);
				koltuk1.add(koltukno1);
				
				JButton koltuk2 = new JButton();
				koltuk2.setBackground(Color.orange);
				koltuk2.setLayout(null);
				koltuk2.setLocation(100,60);
				koltuk2.setSize(30,30);
				
				koltuk2.addActionListener(new ActionListener()
				{
				int sayac=0;
						public void actionPerformed(ActionEvent arg0)
						{
							sayac++;
							
							if(sayac%2 ==1)
							{
								koltuknumarasi[1] = 2;
								koltuksayisi++;
								koltuk2.setBackground(Color.red);
							}
							else
							{
								koltuknumarasi[1] = 0;
								koltuksayisi--;
								koltuk2.setBackground(Color.orange);
							}				
						}
				});
				

				Frame.add(koltuk2);
				
				JLabel koltukno2 = new JLabel ("2");
				koltukno2.setLocation(10,10);
				koltukno2.setSize(10,10);
				koltukno2.setHorizontalAlignment(0);
				koltuk2.add(koltukno2);
				
				JButton koltuk3 = new JButton();
				koltuk3.setBackground(Color.orange);
				koltuk3.setLayout(null);
				koltuk3.setLocation(150,60);
				koltuk3.setSize(30,30);
				koltuk3.addActionListener(new ActionListener()
				{
				int sayac=0;
						public void actionPerformed(ActionEvent arg0)
						{
							sayac++;
							
							if(sayac%2 ==1)
							{
								koltuknumarasi[2] = 3;
								koltuksayisi++;
								koltuk3.setBackground(Color.red);
							}
							else
							{
								koltuknumarasi[2] = 0;
								koltuksayisi--;
								koltuk3.setBackground(Color.orange);
							}
						}
				});
				Frame.add(koltuk3);
				
				JLabel koltukno3 = new JLabel ("3");
				koltukno3.setLocation(10,10);
				koltukno3.setSize(10,10);
				koltukno3.setHorizontalAlignment(0);
				koltuk3.add(koltukno3);
				
				JButton koltuk4 = new JButton();
				koltuk4.setBackground(Color.orange);
				koltuk4.setLayout(null);
				koltuk4.setLocation(200,60);
				koltuk4.setSize(30,30);
				koltuk4.addActionListener(new ActionListener()
				{
				int sayac=0;
						public void actionPerformed(ActionEvent arg0)
						{
							sayac++;
							
							if(sayac%2 ==1)
							{
								koltuknumarasi[3] = 4;
								koltuksayisi++;
								koltuk4.setBackground(Color.red);
							}
							else
							{
								koltuknumarasi[3] = 0;
								koltuksayisi--;
								koltuk4.setBackground(Color.orange);
							}
						}
				});
				Frame.add(koltuk4);
				
				JLabel koltukno4 = new JLabel ("4");
				koltukno4.setLocation(10,10);
				koltukno4.setSize(10,10);
				koltukno4.setHorizontalAlignment(0);
				koltuk4.add(koltukno4);
				
				JButton koltuk5 = new JButton();
				koltuk5.setBackground(Color.orange);
				koltuk5.setLayout(null);
				koltuk5.setLocation(50,110);
				koltuk5.setSize(30,30);
				koltuk5.addActionListener(new ActionListener()
				{
				int sayac=0;
						public void actionPerformed(ActionEvent arg0)
						{
							sayac++;
							
							if(sayac%2 ==1)
							{
								koltuknumarasi[4] = 5;
								koltuksayisi++;
								koltuk5.setBackground(Color.red);
							}
							else
							{
								koltuknumarasi[4] = 0;
								koltuksayisi--;
								koltuk5.setBackground(Color.orange);
							}
						}
				});
				Frame.add(koltuk5);
				
				JLabel koltukno5 = new JLabel ("5");
				koltukno5.setLocation(10,10);
				koltukno5.setSize(10,10);
				koltukno5.setHorizontalAlignment(0);
				koltuk5.add(koltukno5);
				
				JButton koltuk6 = new JButton();
				koltuk6.setBackground(Color.orange);
				koltuk6.setLayout(null);
				koltuk6.setLocation(100,110);
				koltuk6.setSize(30,30);
				koltuk6.addActionListener(new ActionListener()
				{
				int sayac=0;
						public void actionPerformed(ActionEvent arg0)
						{
							sayac++;
							
							if(sayac%2 ==1)
							{
								koltuknumarasi[5] = 6;
								koltuksayisi++;
								koltuk6.setBackground(Color.red);
							}
							else
							{
								koltuknumarasi[5] = 0;
								koltuksayisi--;
								koltuk6.setBackground(Color.orange);
							}
						}
				});
				Frame.add(koltuk6);
				
				JLabel koltukno6 = new JLabel ("6");
				koltukno6.setLocation(10,10);
				koltukno6.setSize(10,10);
				koltukno6.setHorizontalAlignment(0);
				koltuk6.add(koltukno6);
				
				JButton koltuk7 = new JButton();
				koltuk7.setBackground(Color.orange);
				koltuk7.setLayout(null);
				koltuk7.setLocation(150,110);
				koltuk7.setSize(30,30);
				koltuk7.addActionListener(new ActionListener()
				{
				int sayac=0;
						public void actionPerformed(ActionEvent arg0)
						{
							sayac++;
							
							if(sayac%2 ==1)
							{
								koltuknumarasi[6] = 7;
								koltuksayisi++;
								koltuk7.setBackground(Color.red);
							}
							else
							{
								koltuknumarasi[6] = 0;
								koltuksayisi--;
								koltuk7.setBackground(Color.orange);
							}
						}
				});
				Frame.add(koltuk7);
				
				JLabel koltukno7 = new JLabel ("7");
				koltukno7.setLocation(10,10);
				koltukno7.setSize(10,10);
				koltukno7.setHorizontalAlignment(0);
				koltuk7.add(koltukno7);
				
				JButton koltuk8 = new JButton();
				koltuk8.setBackground(Color.orange);
				koltuk8.setLayout(null);
				koltuk8.setLocation(200,110);
				koltuk8.setSize(30,30);
				koltuk8.addActionListener(new ActionListener()
				{
				int sayac=0;
						public void actionPerformed(ActionEvent arg0)
						{
							sayac++;
							
							if(sayac%2 ==1)
							{
								koltuknumarasi[7] =8;
								koltuksayisi++;
								koltuk8.setBackground(Color.red);
							}
							else
							{
								koltuknumarasi[7] = 0;
								koltuksayisi--;
								koltuk8.setBackground(Color.orange);
							}
						}
				});
				Frame.add(koltuk8);
				
				JLabel koltukno8 = new JLabel ("8");
				koltukno8.setLocation(10,10);
				koltukno8.setSize(10,10);
				koltukno8.setHorizontalAlignment(0);
				koltuk8.add(koltukno8);
				
				JButton koltuk9 = new JButton();
				koltuk9.setBackground(Color.orange);
				koltuk9.setLayout(null);
				koltuk9.setLocation(50,160);
				koltuk9.setSize(30,30);
				koltuk9.addActionListener(new ActionListener()
				{
				int sayac=0;
						public void actionPerformed(ActionEvent arg0)
						{
							sayac++;
							
							if(sayac%2 ==1)
							{
								koltuknumarasi[8] = 9;
								koltuksayisi++;
								koltuk9.setBackground(Color.red);
							}
							else
							{
								koltuknumarasi[8] = 0;
								koltuksayisi--;
								koltuk9.setBackground(Color.orange);
							}
						}
				});
				Frame.add(koltuk9);
				
				JLabel koltukno9 = new JLabel ("9");
				koltukno9.setLocation(10,10);
				koltukno9.setSize(10,10);
				koltukno9.setHorizontalAlignment(0);
				koltuk9.add(koltukno9);
				
				JButton koltuk10 = new JButton();
				koltuk10.setBackground(Color.orange);
				koltuk10.setLayout(null);
				koltuk10.setLocation(100,160);
				koltuk10.setSize(30,30);
				koltuk10.addActionListener(new ActionListener()
				{
				int sayac=0;
						public void actionPerformed(ActionEvent arg0)
						{
							sayac++;
							
							if(sayac%2 ==1)
							{
								koltuknumarasi[9] = 10;
								koltuksayisi++;
								koltuk10.setBackground(Color.red);
							}
							else
							{
								koltuknumarasi[9] = 0;
								koltuksayisi--;
								koltuk10.setBackground(Color.orange);
							}
						}		
				});
				Frame.add(koltuk10);
				
				JLabel koltukno10 = new JLabel ("10");
				koltukno10.setLocation(5,5);
				koltukno10.setSize(20,20);
				koltukno10.setHorizontalAlignment(0);
				koltuk10.add(koltukno10);
				
				JButton koltuk11 = new JButton();
				koltuk11.setBackground(Color.orange);
				koltuk11.setLayout(null);
				koltuk11.setLocation(150,160);
				koltuk11.setSize(30,30);
				koltuk11.addActionListener(new ActionListener()
				{
				int sayac=0;
						public void actionPerformed(ActionEvent arg0)
						{
							sayac++;
							
							if(sayac%2 ==1)
							{
								koltuknumarasi[10] =11;
								koltuksayisi++;
								koltuk11.setBackground(Color.red);
							}
							else
							{
								koltuknumarasi[10] = 0;
								koltuksayisi--;
								koltuk11.setBackground(Color.orange);
							}
						}
				});
				Frame.add(koltuk11);
				
				JLabel koltukno11 = new JLabel ("11");
				koltukno11.setLocation(5,5);
				koltukno11.setSize(20,20);
				koltukno11.setHorizontalAlignment(0);
				koltuk11.add(koltukno11);
				
				JButton koltuk12 = new JButton();
				koltuk12.setBackground(Color.orange);
				koltuk12.setLayout(null);
				koltuk12.setLocation(200,160);
				koltuk12.setSize(30,30);
				koltuk12.addActionListener(new ActionListener()
				{
				int sayac=0;
						public void actionPerformed(ActionEvent arg0)
						{
							sayac++;
							
							if(sayac%2 ==1)
							{
								koltuknumarasi[11] = 12;
								koltuksayisi++;
								koltuk12.setBackground(Color.red);
							}
							else
							{
								koltuknumarasi[11] = 0;
								koltuksayisi--;
								koltuk12.setBackground(Color.orange);
							}
						}
				});
				Frame.add(koltuk12);
				
				JLabel koltukno12 = new JLabel ("12");
				koltukno12.setLocation(5,5);
				koltukno12.setSize(20,20);
				koltukno12.setHorizontalAlignment(0);
				koltuk12.add(koltukno12);
				
				JButton koltuk13 = new JButton();
				koltuk13.setBackground(Color.orange);
				koltuk13.setLayout(null);
				koltuk13.setLocation(50,210);
				koltuk13.setSize(30,30);
				koltuk13.addActionListener(new ActionListener()
				{
				int sayac=0;
						public void actionPerformed(ActionEvent arg0)
						{
							sayac++;
							
							if(sayac%2 ==1)
							{
								koltuknumarasi[12] =13;
								koltuksayisi++;
								koltuk13.setBackground(Color.red);
							}
							else
							{
								koltuknumarasi[12] = 0;
								koltuksayisi--;
								koltuk13.setBackground(Color.orange);
							}
						}
				});
				Frame.add(koltuk13);
				
				JLabel koltukno13 = new JLabel ("13");
				koltukno13.setLocation(5,5);
				koltukno13.setSize(20,20);
				koltukno13.setHorizontalAlignment(0);
				koltuk13.add(koltukno13);
				
				JButton koltuk14 = new JButton();
				koltuk14.setBackground(Color.orange);
				koltuk14.setLayout(null);
				koltuk14.setLocation(100,210);
				koltuk14.setSize(30,30);
				koltuk14.addActionListener(new ActionListener()
				{
				int sayac=0;
						public void actionPerformed(ActionEvent arg0)
						{
							sayac++;
							
							if(sayac%2 ==1)
							{
								koltuknumarasi[13] =14;
								koltuksayisi++;
								koltuk14.setBackground(Color.red);
							}
							else
							{
								koltuknumarasi[13] = 0;
								koltuksayisi--;
								koltuk14.setBackground(Color.orange);
							}
						}
				});
				Frame.add(koltuk14);
				
				JLabel koltukno14 = new JLabel ("14");
				koltukno14.setLocation(5,5);
				koltukno14.setSize(20,20);
				koltukno14.setHorizontalAlignment(0);
				koltuk14.add(koltukno14);
				
				JButton koltuk15 = new JButton();
				koltuk15.setBackground(Color.orange);
				koltuk15.setLayout(null);
				koltuk15.setLocation(150,210);
				koltuk15.setSize(30,30);
				koltuk15.addActionListener(new ActionListener()
				{
				int sayac=0;
						public void actionPerformed(ActionEvent arg0)
						{
							sayac++;
							
							if(sayac%2 ==1)
							{
								koltuknumarasi[14] = 15;
								koltuksayisi++;
								koltuk15.setBackground(Color.red);
							}
							else
							{
								koltuknumarasi[14] = 0;
								koltuksayisi--;
								koltuk15.setBackground(Color.orange);
							}
						}
				});
				Frame.add(koltuk15);
				
				JLabel koltukno15 = new JLabel ("15");
				koltukno15.setLocation(5,5);
				koltukno15.setSize(20,20);
				koltukno15.setHorizontalAlignment(0);
				koltuk15.add(koltukno15);
				
				JButton koltuk16 = new JButton();
				koltuk16.setBackground(Color.orange);
				koltuk16.setLayout(null);
				koltuk16.setLocation(200,210);
				koltuk16.setSize(30,30);
				koltuk16.addActionListener(new ActionListener()
				{
				int sayac=0;
						public void actionPerformed(ActionEvent arg0)
						{
							sayac++;
							
							if(sayac%2 ==1)
							{
								koltuknumarasi[15] = 16;
								koltuksayisi++;
								koltuk16.setBackground(Color.red);	
							}
							else
							{
								koltuknumarasi[15] = 0;
								koltuksayisi--;
								koltuk16.setBackground(Color.orange);
							}
						}
				});
				Frame.add(koltuk16);
				
				JLabel koltukno16 = new JLabel ("16");
				koltukno16.setLocation(5,5);
				koltukno16.setSize(20,20);
				koltukno16.setHorizontalAlignment(0);
				koltuk16.add(koltukno16);
				
				JButton koltuk17 = new JButton();
				koltuk17.setBackground(Color.orange);
				koltuk17.setLayout(null);
				koltuk17.setLocation(50,260);
				koltuk17.setSize(30,30);
				koltuk17.addActionListener(new ActionListener()
				{
				int sayac=0;
						public void actionPerformed(ActionEvent arg0)
						{
							sayac++;
							
							if(sayac%2 ==1)
							{
								koltuknumarasi[16] = 17;
								koltuksayisi++;
								koltuk17.setBackground(Color.red);
							}
							else
							{
								koltuknumarasi[16] = 0;
								koltuksayisi--;
								koltuk17.setBackground(Color.orange);
							}
						}
				});
				Frame.add(koltuk17);
				
				JLabel koltukno17 = new JLabel ("17");
				koltukno17.setLocation(5,5);
				koltukno17.setSize(20,20);
				koltukno17.setHorizontalAlignment(0);
				koltuk17.add(koltukno17);
				
				JButton koltuk18 = new JButton();
				koltuk18.setBackground(Color.orange);
				koltuk18.setLayout(null);
				koltuk18.setLocation(100,260);
				koltuk18.setSize(30,30);
				koltuk18.addActionListener(new ActionListener()
				{
				int sayac=0;
						public void actionPerformed(ActionEvent arg0)
						{
							sayac++;
							
							if(sayac%2 ==1)
							{
								koltuknumarasi[17] = 18;
								koltuksayisi++;
								koltuk18.setBackground(Color.red);
							}
							else
							{
								koltuknumarasi[17] = 0;
								koltuksayisi--;
								koltuk18.setBackground(Color.orange);
							}
						}
				});
				Frame.add(koltuk18);
				
				JLabel koltukno18 = new JLabel ("18");
				koltukno18.setLocation(5,5);
				koltukno18.setSize(20,20);
				koltukno18.setHorizontalAlignment(0);
				koltuk18.add(koltukno18);
				
				JButton koltuk19 = new JButton();
				koltuk19.setBackground(Color.orange);
				koltuk19.setLayout(null);
				koltuk19.setLocation(150,260);
				koltuk19.setSize(30,30);
				koltuk19.addActionListener(new ActionListener()
				{
				int sayac=0;
						public void actionPerformed(ActionEvent arg0)
						{
							sayac++;
							
							if(sayac%2 ==1)
							{
								koltuknumarasi[18] = 19;
								koltuksayisi++;
								koltuk19.setBackground(Color.red);
							}
							else
							{
								koltuknumarasi[18] = 0;
								koltuksayisi--;
								koltuk19.setBackground(Color.orange);
							}
						}
				});
				Frame.add(koltuk19);
				
				JLabel koltukno19 = new JLabel ("19");
				koltukno19.setLocation(5,5);
				koltukno19.setSize(20,20);
				koltukno19.setHorizontalAlignment(0);
				koltuk19.add(koltukno19);
				
				JButton koltuk20 = new JButton();
				koltuk20.setBackground(Color.orange);
				koltuk20.setLayout(null);
				koltuk20.setLocation(200,260);
				koltuk20.setSize(30,30);
				koltuk20.addActionListener(new ActionListener()
				{
				int sayac=0;
						public void actionPerformed(ActionEvent arg0)
						{
							sayac++;
							
							if(sayac%2 ==1)
							{
								koltuknumarasi[19] = 20;
								koltuksayisi++;
								koltuk20.setBackground(Color.red);
							}
							else
							{
								koltuknumarasi[19] = 0;
								koltuksayisi--;
								koltuk20.setBackground(Color.orange);
							}
						}
				});
				Frame.add(koltuk20);
				
				JLabel koltukno20 = new JLabel ("20");
				koltukno20.setLocation(5,5);
				koltukno20.setSize(20,20);
				koltukno20.setHorizontalAlignment(0);
				koltuk20.add(koltukno20);
				
				Filmler film1 = new karayipKorsanlari("Karayip Korsanları", "Aksiyon/ Fantastik", "Salon 4");

				JPanel bilgi = new JPanel();
				bilgi.setBackground(Color.DARK_GRAY);
				bilgi.setLocation(260,20);
				bilgi.setSize(700,60);
				bilgi.add(film1.bilgilerigoster());
				Frame.add(bilgi);
				
				JPanel bilgi1 = new JPanel();
				bilgi1.setBackground(Color.DARK_GRAY);
				bilgi1.setLocation(400,80);
				bilgi1.setSize(400,40);
				bilgi1.add(film1.bilgilerigoster1());
				Frame.add(bilgi1);
				
				JPanel bilgi2 = new JPanel();
				bilgi2.setBackground(Color.DARK_GRAY);
				bilgi2.setLocation(400,120);
				bilgi2.setSize(400,40);
				bilgi2.add(film1.bilgilerigoster3());
				Frame.add(bilgi2);
				
				JLabel bilgi3 = new JLabel("ÖĞRENCİ BİLET FİYATI: " + ogr +"TL / TAM BİLET FIYATI: " + tam +"TL");
				bilgi3.setBackground(Color.DARK_GRAY);
				bilgi3.setForeground(Color.YELLOW);
				bilgi3.setFont(new Font("Arial", Font.PLAIN, 20));
				bilgi3.setLocation(370,200);
				bilgi3.setSize(600,40);
				Frame.add(bilgi3);
				
				JLabel bilgi4 = new JLabel("FİLME GİDİLECEK TARİH:");
				bilgi4.setBackground(Color.DARK_GRAY);
				bilgi4.setForeground(Color.YELLOW);
				bilgi4.setFont(new Font("Arial", Font.PLAIN, 20));
				bilgi4.setLocation(350,250);
				bilgi4.setSize(300,40);
				Frame.add(bilgi4);
				
				JTextField textField4 = new JTextField();
				textField4.setBounds(600,260,300,30);
				Frame.add(textField4);
				Frame.setVisible(true);

				Frame.setVisible(true);

				JTextField textField;
				JTextField textField_1;
				JTextField textField_2;
				JTextField textField_3;
				
				JPanel panel = new JPanel();
				panel.setBackground(Color.DARK_GRAY);
				panel.setLayout(null);
				panel.setBounds(10,300,970,450);
				Frame.getContentPane().add(panel);
			
				JLabel lblNewLabel_1 = new JLabel("KART UZERINDEKI ISIM:");
				lblNewLabel_1.setForeground(Color.YELLOW);
				lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
				lblNewLabel_1.setBounds(450,30,250,30);
				panel.add(lblNewLabel_1);
				
				textField = new JTextField();
				textField.setBounds(700,30,200,30);
				panel.add(textField);
				textField.setColumns(10);
				
				JLabel lblNewLabel_2 = new JLabel("KART NUMARASI:\r\n");
				lblNewLabel_2.setForeground(Color.YELLOW);
				lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 20));
				lblNewLabel_2.setBounds(450,70,250,30);
				panel.add(lblNewLabel_2);
				
				textField_1 = new JTextField();
				textField_1.setBounds(700,70,200,30);
				panel.add(textField_1);
				textField_1.setColumns(10);
				
				JLabel lblNewLabel_3 = new JLabel("SON KULLANMA TARIHI:");
				lblNewLabel_3.setForeground(Color.YELLOW);
				lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 20));
				lblNewLabel_3.setBounds(450,110,250,30);
				panel.add(lblNewLabel_3);
				
				textField_2 = new JTextField();
				textField_2.setBounds(700,110,100,30);
				panel.add(textField_2);
				textField_2.setColumns(10);
				
				JLabel lblNewLabel_4 = new JLabel("GUVENLIK KODU(CVV):");
				lblNewLabel_4.setForeground(Color.YELLOW);
				lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN,20));
				lblNewLabel_4.setBounds(450,150,250,30);
				panel.add(lblNewLabel_4);
				
				textField_3 = new JTextField();
				textField_3.setBounds(700,150,100,30);
				panel.add(textField_3);
				textField_3.setColumns(10);
				
				JLabel lblNewLabel = new JLabel("ÖĞRENCİ BİLET SAYISI:");
				lblNewLabel.setForeground(Color.YELLOW);
				lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
				lblNewLabel.setBounds(10,30, 278, 30);
				panel.add(lblNewLabel);
				
				JLabel lblNewLabel_11 = new JLabel("TAM BİLET SAYISI:");
				lblNewLabel_11.setForeground(Color.YELLOW);
				lblNewLabel_11.setFont(new Font("Arial", Font.PLAIN, 20));
				lblNewLabel_11.setBounds(10,80, 278, 30);
				panel.add(lblNewLabel_11);
				
				JComboBox<Object> comboBox = new JComboBox<Object>();
				comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
				comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] {"0","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
				comboBox.setBounds(250,30, 70, 30);
				comboBox.setSelectedIndex(0);
				panel.add(comboBox);
				
				JComboBox<Object> comboBox_1 = new JComboBox<Object>();
				comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
				comboBox_1.setModel(new DefaultComboBoxModel<Object>(new String[] {"0","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
				comboBox_1.setBounds(250,80,70, 30);
				comboBox_1.setSelectedIndex(0);
				panel.add(comboBox_1);
				
				JLabel lblNewLabel_21 = new JLabel();
				lblNewLabel_21.setFont(new Font("Tahoma", Font.PLAIN, 30));
				lblNewLabel_21.setBounds(200,200, 278, 30);
				panel.add(lblNewLabel_21);
				
				
				JButton btnNewButton = new JButton("OK");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						Secilen1 = comboBox.getSelectedIndex(); 
						Secilen2 = comboBox_1.getSelectedIndex();
						
						if(Secilen1 != 0 )
						{
							tutar1 = Secilen1 * ogr;
						}
						if(Secilen2 != 0)
						{
							tutar2 = Secilen2 * tam;
						}
						
						if(koltuksayisi != (Secilen1 + Secilen2))
						{
							JOptionPane.showMessageDialog(null,"EKSİK KOLTUK GİRDİNİZ!!");
						}
						
						
						Tutar = tutar1 + tutar2;
						lblNewLabel_21.setText("TUTAR:" + Tutar);
						
					}
				});
				btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
				btnNewButton.setBounds(150,150, 100, 30);
				panel.add(btnNewButton);
				
				
				JButton btnNewButton1 = new JButton("SATIN AL");
				btnNewButton1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						String isim,numara,tarih,kod,sql,filmtarih;
						isim = textField.getText();
						numara = textField_1.getText();
						tarih = textField_2.getText();
						kod = textField_3.getText();
						filmtarih = textField4.getText();
						
						sql = "INSERT INTO kart_bilgi (kart_filmtarih,kart_isim,kart_no,kart_tarih,kart_kod) "
								+ "VALUES (" + "'" + filmtarih + "'" + ",'" + isim + "'" + ",'" + numara + "'" + ",'" + tarih +"'" + ",'" + kod + "')" ;
						Otomasyon.baglanti.ekle(sql);
						
						
						
						String film = "Karayip Korsanları";
						String seans = SalonSecimi.SinemaSalonSecimi.seans;
						
						flag=0;
						
						for(int j=0;j<20;j++)
							for(int i=0;i<20;i++)
								if(koltuknumarasi[i] != 0)
								{
									koltuk[j] = (i+1);
									koltuknumarasi[i] = 0;
									flag++;
									break;
								}
						
						int[] yazdir = new int[flag];
						
						for(int i=0;i<flag;i++)
							for(int j=0;j<20;j++)
								if(koltuk[j] != 0)
								{
									yazdir[i] = koltuk[j];
									koltuk[j] = 0;
									break;
								}

						tarih = textField4.getText();
						SATINAL.SatinAl(film,seans,yazdir,Tutar,tarih);
					}
				});
			
				btnNewButton1.setFont(new Font("Tahoma", Font.PLAIN, 25));
				btnNewButton1.setBounds(600,200,150,30);
				panel.add(btnNewButton1);
				
				
				Frame.setBounds(10, 10, 1000,600);
				Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}

}

			