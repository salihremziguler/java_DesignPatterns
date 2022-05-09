package nesneyonemlianaliz2;

public class KullaniciFactory {
	public static IKisi getKisi(String kullaniciadi,String sifre)
    {
        IKisi kisi = null;
       
        kisi = new Kisi(kullaniciadi,sifre);
       
        return kisi;
    }
}
