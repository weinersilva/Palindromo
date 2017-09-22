package br.com.weinersilva;

import org.junit.Assert;
import org.junit.Test;

public class TestaPalindromo {

    @Test 
	public void main() {
	 
	 Palindromo palindromo = new Palindromo();
	 
	
	 Assert.assertTrue( palindromo.ehPalindromo("Socorram-me subi no onibus em Marrocos"));
	 
	 Assert.assertFalse(palindromo.ehPalindromo("Anotaram o dia da maratona"));
	 
    }
}
