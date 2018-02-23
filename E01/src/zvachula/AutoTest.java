package zvachula;
import static org.junit.Assert.assertEquals;

import java.awt.Color;

import org.junit.Test;

public class AutoTest {
	@Test
	public void testAuto() {
		Auto a = new Auto();
		assertEquals("Ford", a.getType());
		assertEquals(Color.RED, a.getFarbe());
		assertEquals(160, a.getLeistung());
	}
	
	@Test
	public void testAutoWithParam() {
		Auto a = new Auto("Mercedes",Color.BLUE,200);
		assertEquals("Mercedes", a.getType());
		assertEquals(Color.BLUE, a.getFarbe()); 
		assertEquals(200, a.getLeistung());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testTypeIsNullFarbeIsNullLeistungSmallerThanZero() {
		Auto a = new Auto(null,null,-10);
		a.setType(null);  
		a.setFarbe(null);
		a.setLeistung(-10); 
	}
	
	@Test
	public void testToStringRed() {
		Auto a = new Auto();
		a.setFarbe(Color.RED);
		assertEquals("Ford, rot, 160PS",a.toString()); 
	}
	@Test 
	public void testToStringWhite() {
		Auto a = new Auto();
		a.setFarbe(Color.WHITE);
		assertEquals("Ford, weiﬂ, 160PS", a.toString());
	}
	
	@Test 
	public void testToStringBlack() {
		Auto a = new Auto();
		a.setFarbe(Color.BLACK);
		assertEquals("Ford, schwarz, 160PS", a.toString());  
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testLeerString() {
		Auto a = new Auto(" ",Color.YELLOW,90);
		a.setType(" ");
		a.setFarbe(Color.YELLOW);
		a.setLeistung(90); 
	}
	
	@Test
	public void testSetTypeGetType() {
		Auto a = new Auto();
		a.setType("Benz"); 
		assertEquals("Benz", a.getType());
	}
	
	@Test
	public void testSetFarbeGetFarbe() {
		Auto a = new Auto();
		a.setFarbe(Color.GREEN);
		assertEquals(Color.GREEN, a.getFarbe());
	}
	
	@Test
	public void testSetLeistungGetLeistung() {
		Auto a = new Auto();
		a.setLeistung(300);
		assertEquals(300, a.getLeistung());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSetLeistungSmaller0()  {
		Auto a = new Auto();
		a.setLeistung(-10);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSetFarbeIsNull() {
		Auto a = new Auto();
		a.setFarbe(null); 
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSetTypeLeerString() {
		Auto a = new Auto();
		a.setType(" "); 
	}
}
