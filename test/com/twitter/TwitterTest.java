/**
 * 
 */
package com.twitter;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.twitter.poruke.TwitterPoruka;

/**
 * @author Jovana
 *
 */
public class TwitterTest {
	Twitter twitter;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		twitter = new Twitter();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		twitter = null;
	}

	/**
	 * Test method for {@link com.twitter.Twitter#vratiSvePoruke()}.
	 */
	@Test
	public void testVratiSvePoruke() {
		LinkedList<TwitterPoruka> p = new LinkedList<TwitterPoruka>();

		assertEquals(p, twitter.vratiSvePoruke());

	}

	
	/**
	 * Test method for {@link com.twitter.Twitter#unesi(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testUnesi() {
		LinkedList<TwitterPoruka> p = new LinkedList<TwitterPoruka>();
		
		twitter.unesi("Jovana", "Poruka 1");
		twitter.unesi("Milica", "Poruka 2");
		
		assertEquals("Milica", twitter.vratiSvePoruke().get(1).getKorisnik());
		
	}
	
	
	/**
	 * Test method for {@link com.twitter.Twitter#unesi(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testUnesiSize() {
		
		twitter.unesi("Jovana", "Poruka 1");
		twitter.unesi("Jovana", "Poruka 2");
		assertEquals(2, twitter.vratiSvePoruke().size());
		
	}


	/**
	 * Test method for {@link com.twitter.Twitter#vratiPoruke(int, java.lang.String)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testVratiPorukeNull() {
		
		twitter.vratiPoruke(5, null);
		
	}
	
	/**
	 * Test method for {@link com.twitter.Twitter#vratiPoruke(int, java.lang.String)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testVratiPorukeEmpty() {
		
		twitter.vratiPoruke(5, "");
		
	}

	
	/**
	 * Test method for {@link com.twitter.Twitter#vratiPoruke(int, java.lang.String)}.
	 */
	@Test 
	public void testVratiPoruke() {
		
		twitter.unesi("Jovana", "Poruka 1");
		twitter.unesi("Milica", "Poruka broj 2");
		twitter.unesi("Tamara", "Poruka 3");
		
		assertEquals("Poruka broj 2", twitter.vratiPoruke(3, "broj")[0].getPoruka());
		
	
	}
	
	
	
	
}
