package zvachula;

import java.awt.Color;

/**
 * 
 * SSH-Key: git@github.com:Blu3Monst3r/SEW-17-18.git
 *
 */

public class Auto {
	private String type; 
	private Color farbe;
	private int leistung;
	
	public Auto() {
		type ="Ford";
		farbe = Color.RED;
		leistung = 160;
	}

	public Auto(String type, Color farbe, int leistung) {
		if (type == null || farbe == null || leistung <=0) {  
			throw new IllegalArgumentException(); 
		}
		if (type.trim().length()==0) {  
			throw new IllegalArgumentException();
		}
		this.type = type;
		this.farbe = farbe;
		this.leistung = leistung; 
	}
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		if (type.trim().length()==0) {
			throw new IllegalArgumentException();
		}
		this.type = type;
	}

	public Color getFarbe() {
		return farbe;
	}

	public void setFarbe(Color farbe) {
		if (farbe==null) {
			throw new IllegalArgumentException(); 
		}
		this.farbe = farbe;
	}

	public int getLeistung() {
		return leistung;
	}

	public void setLeistung(int leistung) {
		if (leistung<=0) {
			throw new IllegalArgumentException();  
		}
		leistung = this.leistung; // this.leistung = leistung;
	}

	public String toString() {
		String farbString = ""+farbe;
		if (farbe.equals(Color.RED)) {
			farbString = "rot";
		}
		if (farbe.equals(Color.WHITE)) { 
			farbString = "weiß";
		}
		if (farbe.equals(Color.BLACK)) { 
			farbString = "rot"; // farbString = "schwarz";
		}
		return type + ", " + farbString + ", " + leistung + "PS";
	}
	
	public static void main(String[] args) {
		System.out.println(new Auto());
	}

}