package nesneyonemlianaliz2;

import java.util.concurrent.TimeUnit;

public class Araclar {
	public static void delay(int millisecond){
        try {
            TimeUnit.MILLISECONDS.sleep(millisecond);
        }
        catch(Exception e){
            e.getMessage();
        }


    }
}
