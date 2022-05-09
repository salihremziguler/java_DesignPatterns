package nesneyonemlianaliz2;

public class Kisi implements IKisi{
	private String kullaniciAdi;
    private String sifre;

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }


    public Kisi(String kullaniciAdi, String sifre) {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
    }

}
