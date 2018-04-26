package test;
import org.junit.Test;

import junit.framework.TestCase;

public class notationTest extends TestCase {

	@Test
	public static void testA() {
		
		assertEquals("A", metier.NoteTDD.note(75, 25));
	}
	
	@Test
	public static void testB(){

		assertEquals("B", metier.NoteTDD.note(50, 10));
	}
	@Test
	public static void testC(){

		assertEquals("C", metier.NoteTDD.note(35, 10));
	}
	@Test
	public static void testD(){

		assertEquals("D", metier.NoteTDD.note(0, 25));
	}
	
	@Test
	public static void testString() {
		assertEquals("Erreur dans l'entrée : For input string: \"Toto\"", metier.NoteTDD.note("Toto", "25"));
		assertEquals("Erreur dans l'entrée : For input string: \"Toto\"", metier.NoteTDD.note("25", "Toto"));
	}
	
	@Test
	public static void testNegative(){
		assertEquals("Erreur dans exam", metier.NoteTDD.note(-1, 5));
		assertEquals("Erreur dans cc", metier.NoteTDD.note(5, -5));
	}

}
