package nesneyonemlianaliz2;

import java.util.Random;

public class Abone implements Observer{
	private final String isim;
    private final String soyisim;
    private final int yas;

    public static class AboneBuilder{
        Random random=new Random();

        private String isim;
        private String soyisim;
        private int yas;

        private String[] isimler={"Hýzýr","Uður","Hasan","Zeynep","Mahmut"};
        private String[] soyisimler={"Çakýrbeyli","Kaya","Çay","KUL","Ünlü"};


        public AboneBuilder setisim(){
            this.isim=isimler[random.nextInt(isimler.length)];
            return this;
        }
        public AboneBuilder setsoyisim(){
            this.soyisim=soyisimler[random.nextInt(soyisimler.length)];
            return this;
        }

        public AboneBuilder setyas() {
            this.yas = Math.abs(random.nextInt() % 20) + 24;
            return this;
        }

        public Abone build(){
            return new Abone(this);
        }
    }

    private Abone(AboneBuilder builder){
        this.isim=builder.isim;
        this.soyisim=builder.soyisim;
        this.yas=builder.yas;
    }
    public String getIsim(){
        return isim;
    }
    public String getSoyisim(){
        return soyisim;
    }
    public int getYas(){
        return yas;
    }

    @Override
    public void update(String message) {
        System.out.println(getIsim()+" "+getSoyisim()+"("+getYas()+") adlý aboneye iletilen mesaj: "+message);
    }

	
}
