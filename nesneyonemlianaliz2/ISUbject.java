package nesneyonemlianaliz2;

public interface ISUbject {
	void attach(Observer observer);
    void detach(Observer observer);
    void notify(String message);
}
