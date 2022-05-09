package nesneyonemlianaliz2;

import java.util.Scanner;

public class AgArayuzu implements IAgArayuz{
		//Dependency
		private IEkran ekran;
	    private IKisi kullanici;
	    private IVeritabani veriTabaniSurucusu;
	    private IMerkeziÝslem anaIslem;
	    private ITusTakimi tustakimi;
	    
	    //Ag Arayuzunu oluþtugunda ekran, tus takimi, veritabani ve merkezi iþlem de oluþturur.
	    public AgArayuzu() {
	        this.ekran = new Ekran();
	        this.tustakimi=new TusTakimi();
	        this.veriTabaniSurucusu=new PostgresqlVeritabani();
	        this.anaIslem=new MerkeziÝslem(ekran,this);
	    }

	    public void Basla()
	    {
	       
	        do {
	            ekran.mesajYazdir("--------------------------------");
	            ekran.mesajYazdir("- Hoþgeldiniz -- \n\nLütfen Giriþ Yapýnýz");
	            ekran.mesajYazdir("Kullanýcý Adýnýzý Giriniz :");
	            String kullaniciadi =tustakimi.stringVeriAl();
	            ekran.mesajYazdir("Þifrenizi Giriniz :");
	            String sifre = tustakimi.stringVeriAl();
	            
	            //FACTORY METHOD UYGULAMA
	            kullanici = KullaniciFactory.getKisi(kullaniciadi, sifre);
	            
	        }while (!KullaniciDogrula(kullanici));
	        
	        ekran.mesajYazdir(kullanici.getKullaniciAdi()+", HOÞ GELDÝNÝZ...");
	        IslemSecimi();
	        
	    }

	    @Override
	    public boolean KullaniciDogrula(IKisi kullanici) {
	        ekran.mesajYazdir("**Veritabanýna baðlanma iþlemi gerçekleþtiriliyor**");
	        Araclar.delay(500);
	        
	        if(!veriTabaniSurucusu.baglan())
	        {
	            ekran.mesajYazdir("Veritabanýna baðlanýlma iþlemi gerçekleþtirilmiyor. Lütfen tekrar deneyiniz.");
	            return false;
	        }
	        
	        if(!veriTabaniSurucusu.kullaniciKontrol(kullanici))
	        {
	            ekran.mesajYazdir("Kullanýcý adý veya þifreniz hatalýdýr. Lütfen tekrar giriþ yapýnýz.");
	            return  false;
	        }
	        
	        else{
	        	ekran.mesajYazdir("Veritabanina baþarýlý bir þekilde baðlanýldý.");
	            return true;
	        }
	    }


	    @Override
	    public void IslemSecimi() {
	    	
	      
	        Secenekler secenekler = new Secenekler(ekran);
	        
	        String devam;
	        do {
	            secenekler.AnaMenuyuGoster();
	            int islem = tustakimi.intVeriAl();
	            tustakimi.stringVeriAl();
	            
	            anaIslem.IslemiGerceklestir(islem);
	            ekran.mesajYazdir("Ýþleme devam etmek istiyor musunuz ? (E/H)");
	            devam = tustakimi.stringVeriAl();
	            
	        } while ((devam.equalsIgnoreCase("E") && devam.equalsIgnoreCase("e")));
	        ekran.mesajYazdir("Ýyi günler dileriz.");
	    }

	   
}
