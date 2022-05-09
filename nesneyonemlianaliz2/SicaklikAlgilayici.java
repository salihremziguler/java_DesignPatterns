package nesneyonemlianaliz2;

public class SicaklikAlgilayici implements ISicaklikAlgilayici{
	
	     private int sicaklik;
	     private ISUbject publisher;
	    public SicaklikAlgilayici(ISUbject publisher) {
	    	this.publisher=publisher;
	    }

	    public int getSicaklik() {
	        return sicaklik;
	    }

	    @Override
	    public void SicaklikOlc() {
	        sicaklik = (int)(Math.random()*15+50);
	        if(sicaklik>50)
	        {
	        	
	        	 publisher.notify("Sýcaklýk 50 derecenin üzerine çýktý! Lütfen soðutucuyu açýnýz!");
	        }
	    }
	    
	    @Override
	    public void AboneEkle(Observer abone) {
	        publisher.attach(abone);
	    }
	    
}
