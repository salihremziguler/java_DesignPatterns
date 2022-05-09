package nesneyonemlianaliz2;

public  class SogutucuAc implements IIslem  {

	private IEyleyici eyleyici;
    public SogutucuAc(IEyleyici eyleyici) {
        this.eyleyici = eyleyici;
    }

    @Override
    public void IslemYap() {
        eyleyici.SogutucuyuAc();
    }

    @Override
    public String toString() {
         if(eyleyici.getdurum()==0)
             return "Soðutucu Zaten Açýk Durumdadýr.";
         
         else
         return "Soðutucu Açýldý.";
    }
	
}
