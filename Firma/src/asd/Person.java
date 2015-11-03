package asd;

import java.io.Serializable;

public class Person implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3560636930088757730L;
	private String imie;
	private String nazwisko;
	
	public Person() {}
	
	Person(String imie, String nazwisko) {
		this.setImie(imie);
		this.setNazwisko(nazwisko);
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	
	@Override
	public String toString() {
		return getImie() + " " + getNazwisko();
	}

}
