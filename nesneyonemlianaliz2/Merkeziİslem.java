package nesneyonemlianaliz2;

public class MerkeziÝslem implements IMerkeziÝslem {
	private final IEyleyici eyleyici;
    private final ISicaklikAlgilayici algilayici;
    private final IAgArayuz agArayuz;
    private final IEkran ekran;

    public MerkeziÝslem(IEkran ekran,AgArayuzu agArayuz) {
        this.eyleyici = new Eyleyici();
        this.algilayici=new SicaklikAlgilayici(new Publisher());
         this.algilayici.AboneEkle(new Abone.AboneBuilder().setisim().setsoyisim().setyas().build());
        this.agArayuz = agArayuz;
        this.ekran = ekran;

    }



    @Override
    public void IslemiGerceklestir(int secim){
        IIslem islem;
        switch (secim)
        {
            case 1:
                islem = new SogutucuAc(eyleyici);
               
                ekran.mesajYazdir("Eyleyici Çalýþtýrýlýyor.");
                Araclar.delay(1000);
                islem.IslemYap();
               
                break;
            case 2:
                islem = new SogutucuKapat(eyleyici);
             
                ekran.mesajYazdir("Eyleyici Çalýþtýrýlýyor.");
                Araclar.delay(1000);
                islem.IslemYap();
                break;
            case 3:
                islem = new SicaklikAlgilayiciCalistir(algilayici);
              
                ekran.mesajYazdir("Sýcaklýk Algýlayýcý Çalýþtýrýlýyor..");
                Araclar.delay(1000);
                islem.IslemYap();
                ekran.mesajYazdir(islem.toString());
                break;
            default:
                ekran.mesajYazdir("Lütfen Geçerli Seçim Yapýnýz.");
        }
    }
}
