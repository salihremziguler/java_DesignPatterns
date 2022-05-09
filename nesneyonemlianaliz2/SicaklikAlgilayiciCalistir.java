package nesneyonemlianaliz2;

public class SicaklikAlgilayiciCalistir implements IIslem{
	private ISicaklikAlgilayici sicaklikAlgilayici;
	 
	 
    public SicaklikAlgilayiciCalistir(ISicaklikAlgilayici sicaklikAlgilayici) {
        this.sicaklikAlgilayici = sicaklikAlgilayici;
    }

    public void IslemYap(){
        sicaklikAlgilayici.SicaklikOlc();
        
    }

    @Override
    public String toString() {
        return "Sýcaklýk : "+ sicaklikAlgilayici.getSicaklik()+" Derece";
    }
}
