package Salonlar;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Filmler
{
            private String isim;
	    private String kategori;
	    private String salon;

	    public Filmler(String isim, String kategori, String salon) {
	        this.setisim(isim);
	        this.setKategori(kategori);
	        this.setSalon(salon);
	    }
	    public String getisim() {
	        return isim;
	    }
	    public void setisim(String isim) {
	        this.isim = isim;
	    }
	    public String getKategori() {
	        return kategori;
	    }
	    public void setKategori(String kategori) {
	        this.kategori = kategori;
	    }
	    public String getSalon() {
	        return salon;
	    }
	    public void setSalon(String salon) {
	        this.salon = salon;
	    }
	    public Component bilgilerigoster()
	    {
	    	JPanel panel = new JPanel();
	    	panel.setBackground(Color.DARK_GRAY);
	    	JPanel Panel = new JPanel();
	    	Panel.setBackground(Color.DARK_GRAY);
	    	panel.add(Panel);
	    	
	    	JLabel Label = new JLabel("FILMIN ADI : "+ isim);
			Label.setForeground(Color.YELLOW);
			Label.setFont(new Font("Broadway", Font.PLAIN, 40));
	    	Panel.add(Label);
	    	return panel;
	    }
		public Component bilgilerigoster1() 
		{
	    	JPanel panel = new JPanel();
	    	panel.setBackground(Color.DARK_GRAY);
	    	JPanel Panel = new JPanel();
	    	Panel.setBackground(Color.DARK_GRAY);
	    	panel.add(Panel);
	    	
	    	JLabel Label = new JLabel("SALON NO : "+ salon);
			Label.setForeground(Color.YELLOW);
			Label.setFont(new Font("Arial", Font.PLAIN, 20));
	    	Panel.add(Label);
			return panel;
		}

		public Component bilgilerigoster3() 
		{
	    	JPanel panel = new JPanel();
	    	panel.setBackground(Color.DARK_GRAY);
	    	JPanel Panel = new JPanel();
	    	Panel.setBackground(Color.DARK_GRAY);
	    	panel.add(Panel);
	    	
	    	JLabel Label = new JLabel("FİLMİN KATEGORİSİ : "+ kategori);
			Label.setForeground(Color.YELLOW);
			Label.setFont(new Font("Arial", Font.PLAIN, 20));
	    	Panel.add(Label);
	    	return panel;
		}	
	}   

	class doktorUyku extends Filmler{
	    public doktorUyku(String isim, String kategori, String salon) {
	        super(isim, kategori, salon);
	    }

	    @Override
	    public Component bilgilerigoster() {
	        return super.bilgilerigoster();
	    }
	}
	class suicideSquad extends Filmler{
	    public suicideSquad(String isim, String kategori, String salon) {
	        super(isim, kategori, salon);
	    }

	    @Override
	    public Component bilgilerigoster() {
	        return super.bilgilerigoster();
	    }
	}
	class sirinler extends Filmler{
	    public sirinler(String isim, String kategori, String salon) {
	        super(isim, kategori, salon);
	    }

	    @Override
	    public Component bilgilerigoster() {
	        return super.bilgilerigoster();
	    }
	}
	class karayipKorsanlari extends Filmler{
	    public karayipKorsanlari(String isim, String kategori, String salon) {
	        super(isim, kategori, salon);
	    }

	    @Override
	    public Component bilgilerigoster() {
	        return super.bilgilerigoster();
	    }
	}
	class avatar extends Filmler{
	    public avatar(String isim, String kategori, String salon) {
	        super(isim, kategori, salon);
	    }

	    @Override
	    public Component bilgilerigoster() {
	        return super.bilgilerigoster();
	    }
	}
	class interstellar extends Filmler{
	    public interstellar(String isim, String kategori, String salon) {
	        super(isim, kategori, salon);
	    }

	    @Override
	    public Component bilgilerigoster() {
	        return super.bilgilerigoster();
	    }
	}
	class malefiz extends Filmler{
	    public malefiz(String isim, String kategori, String salon) {
	        super(isim, kategori, salon);
	    }

	    @Override
	    public Component bilgilerigoster() {
	        return super.bilgilerigoster();
	    }
	}
	class ayla extends Filmler{
	    public ayla(String isim, String kategori, String salon) {
	        super(isim, kategori, salon);
	    }

	    @Override
	    public Component bilgilerigoster() {
	        return super.bilgilerigoster();
	    }

}
