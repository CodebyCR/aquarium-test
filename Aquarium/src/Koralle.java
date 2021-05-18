import javax.swing.JOptionPane;

public class Koralle extends Aquarium {

	private String farbe;
	private boolean photosynthese = false;
	
	public Koralle(String platz, int wasserEinnahme, String farbe) {

		super(platz, wasserEinnahme);
		this.farbe = farbe;
	}

	public void Reinigen(){
		photosynthese = true;
		JOptionPane.showMessageDialog(null, "Photosynthese der Koralle...");
		JOptionPane.showMessageDialog(null, "Aquarium wurde gereinigt.");
	}

	//Get&Set
	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	
	public boolean isPhotosynthese() {
		return photosynthese;
	}

	
	public void setPhotosynthese(boolean photosynthese) {
		this.photosynthese = photosynthese;
	}
	
	
}
