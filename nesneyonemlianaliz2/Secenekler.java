package nesneyonemlianaliz2;

public class Secenekler implements ISecenekler {
	 private IEkran ekran;
	    public Secenekler(IEkran ekran) {
	        this.ekran = ekran;
	    }

	    @Override
	    public  void AnaMenuyuGoster() {
	        ekran.mesajYazdir("-- Ana Menüye Hoþgeldiniz--");
	        ekran.mesajYazdir("1- Soðutuyucu Aç");
	        ekran.mesajYazdir("2- Soðutucuyu Kapat");
	        ekran.mesajYazdir("3- Sýcaklýðý Öðren");
	        ekran.mesajYazdir("Hangi iþlemi yapmak istiyorsunuz ?");

	    }
}
