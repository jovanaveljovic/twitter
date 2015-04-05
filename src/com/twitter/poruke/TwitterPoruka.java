package com.twitter.poruke;
/**
 * Predstavlja poruku jednog korisnika na twitteru
 * 
 * @author Jovana
 * @version 1.0
 *
 */

public class TwitterPoruka {
	
	/**
	 * Ime korisnika
	 * 
	 */
	private String korisnik;
	/**
	 * Tekst poruke
	 */
	private String poruka;
	
	/**
	 * Metoda vraca ime korisnika, tj vrednost atributa korisnik.
	 * @return ime korisnika kao String
	 */
	public String getKorisnik() {
		return korisnik;
	}
	
	/**
	 * Metoda postavlja ime korisnika na unetu vrednost.
	 * @param korisnik novo ime korisnika
	 * @throws java.lang.RuntimeException ako je uneto ime korisnika
	 *  <ul>
	 * <li>null</li>
	 * <li>prazan String</li>
	 * </ul>
	 */
	public void setKorisnik(String korisnik) {
		if (korisnik==null || korisnik.equals(""))
			throw new RuntimeException("Ime korisnika mora biti uneto");
	this.korisnik = korisnik;
	}
	
	/**
	 * Metoda vraca tekst poruke tj. vrednost atributa poruka.
	 * @return tekst poruke kao String
	 */
	public String getPoruka() {
		return poruka;
	}
	
	/**
	 * Metoda postavlja tekst poruke na unetu vrednost.
	 * @param poruka novi tekst poruke
	 * @throws java.lang.runtimeException ako je uneti tekst poruke
	 * <ul>
	 * <li>null</li>
	 * <li>prazan String</li>
	 * </ul>
	 */
	public void setPoruka(String poruka) {
		if (poruka==null || poruka.length()>140)
			throw new RuntimeException("Poruka mora biti uneta i mora imati najvise 140 znakova");
		this.poruka = poruka;
	}
	
	/**
	 * Metoda vraca vrednosti atributa korisnik i poruka 
	 * uz odgovarajuci tekst
	 * @return ime korisnika i tekst poruke kao String
	 */
	public String toString(){
		return "KORISNIK:"+korisnik+" PORUKA:"+poruka;
	} 
	
}
