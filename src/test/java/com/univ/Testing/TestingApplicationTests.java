package com.univ.Testing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestingApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testCreationCompte() {
		Compte compte = new Compte();
		float solde = compte.getSolde();
		Assert.assertTrue(solde == 0);
	}

	@Test
	public void testCrediter() {
		try {
			Compte compte = new Compte();
			compte.crediter(0);
			float solde = compte.getSolde();
			Assert.assertTrue(solde == 0);
		} catch(Exception e) {				// si on a une exception... 
			Assert.fail("Erreur credit");	// ... c'est une erreur
		}		
	}
	
	@Test(expected = Exception.class)			// exception attendue...	
	public void testDebiter() throws Exception {
		Compte compte = new Compte();
		float solde = compte.debiter(-10);		// ... on ne peut pas debiter -10
	}

}
