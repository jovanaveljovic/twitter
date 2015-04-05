/**
 * 
 */
package com.twitter.poruke;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Jovana
 *
 */
public class TwitterPorukaTest {
	
	private TwitterPoruka twitterPoruka;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		twitterPoruka = new TwitterPoruka();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		twitterPoruka = null;
	}



	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setKorisnik(java.lang.String)}.
	 */
	@Test
	public void testSetKorisnik() {
		twitterPoruka.setKorisnik("Jovana");
		
		assertEquals("Jovana", twitterPoruka.getKorisnik());
	}
	
	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setKorisnik(java.lang.String)}.
	 */
	@Test  (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikNull() {
		twitterPoruka.setKorisnik(null);
		
	}
	
	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setKorisnik(java.lang.String)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikEmptyString() {
		twitterPoruka.setKorisnik("");
	}

	

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setPoruka(java.lang.String)}.
	 */
	@Test
	public void testSetPoruka() {
		twitterPoruka.setPoruka("Hello world!");
		
		assertEquals("Hello world!", twitterPoruka.getPoruka());
	}
	
	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setPoruka(java.lang.String)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaNull() {
		twitterPoruka.setPoruka(null);
		
	}
	 
	
	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setPoruka(java.lang.String)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaVelika() {
		twitterPoruka.setPoruka("Hello world! Hello world! Hello world! Hello world! Hello world! Hello world!"
				+ " Hello world! Hello world! Hello world! Hello world! Hello world! Hello world! Hello world!"
				+ " Hello world! Hello world! Hello world! Hello world! Hello world! Hello world! Hello world! ");
		
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#toString()}.
	 */
	@Test
	public void testToString() {
		twitterPoruka.setKorisnik("Jovana");
		twitterPoruka.setPoruka("Hello world");
		
		assertEquals("KORISNIK:"+twitterPoruka.getKorisnik()+" PORUKA:"+twitterPoruka.getPoruka(), twitterPoruka.toString());
	}

	
}
