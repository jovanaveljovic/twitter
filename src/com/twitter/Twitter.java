package com.twitter;

import java.util.LinkedList;

import com.twitter.poruke.TwitterPoruka;

/**
 * Predstavlja drustvenu mrezu twitter.
 * 
 * @author Jovana
 * @version 1.0
 */
public class Twitter {
	
	/**
	 * Lista poruka.
	 */
	private LinkedList<TwitterPoruka> poruke =
			new LinkedList<TwitterPoruka>();
	
	/**
	 * Metoda vraca sve poruke koje se trenutno nalaze u listi.
	 * @return sve poruke kao listu
	 */
	public LinkedList<TwitterPoruka> vratiSvePoruke(){
		return poruke;
	}
	
	/**
	 * Metoda na osnovu unetih podataka pravi novu poruku i 
	 * unosi je na kraj liste.
	 * @param korisnik ime korisnika
	 * @param poruka tekst poruke
	 */
	public void unesi(String korisnik, String poruka) {
		
		TwitterPoruka tp = new TwitterPoruka();
		tp.setKorisnik(korisnik);
		tp.setPoruka(poruka);
		
		poruke.addLast(tp);
	}
	
	/**
	 * Metoda vraca sve poruke koje u sebi imaju zadati tag
	 * @param maxBroj maksimalan broj poruka 
	 * @param tag kriterijum pretrazivanja
	 * @return sve poruke u vidu niza
	 */
	public TwitterPoruka[] vratiPoruke(int maxBroj, String tag) {
		 
		if (tag==null || tag.isEmpty())
			
			throw new RuntimeException("Morate uneti tag");
		
		 if (maxBroj<=0)
			 maxBroj = 100;
		 
		 int brojac = 0;
		
		TwitterPoruka[] rezultat = new TwitterPoruka[maxBroj];
		
		for (int i = 0; i < poruke.size(); i++)
		
			if (poruke.get(i).getPoruka().indexOf(tag)!=-1)
				if (brojac < maxBroj){
					rezultat[brojac]=poruke.get(i);
					brojac++;
			}
				else break;
			
		return rezultat;
			
		
	}
	
	} 
	
	

