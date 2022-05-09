package nesneyonemlianaliz2;

public class SogutucuKapat implements IIslem{
	
	 private IEyleyici eyleyici;
	    public SogutucuKapat(IEyleyici eyleyici) {
	        this.eyleyici = eyleyici;
	    }

	    @Override
	    public void IslemYap() {
	        eyleyici.SogutucuyuKapat();
	    }

	    @Override
	    public String toString() {
	        if(eyleyici.getdurum()==0)
	            return "Soðutucu Zaten Kapalý Durumdadýr.";
	        else
	        return "Soðutucu Kapatýldý.";
	    }
}
