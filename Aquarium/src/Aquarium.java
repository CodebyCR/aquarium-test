import javax.swing.JOptionPane;

public abstract class Aquarium {

	private String platz;
	private int wasserEinnahme;
	//Aquarium Wasser
	private int wasser = 10;
	
	public Aquarium(String platz, int wasserEinnahme) {
		this.platz = platz;
		this.wasserEinnahme = wasserEinnahme;
	}

	public void Reinigen(){
		JOptionPane.showMessageDialog(null, "Der Filter des Aquariums läuft...");
		JOptionPane.showMessageDialog(null, "Aquarium wurde gereinigt.");
		wasser = 10;
	}
	
//	Get & Set
	public String getPlatz() {
		return platz;
	}

	public void setPlatz(String platz) {
		this.platz = platz;
	}

	public int getWasserEinnahme() {
		return wasserEinnahme;
	}

	public void setWasserEinnahme(int wasserEinnahme) {
		this.wasserEinnahme = wasserEinnahme;
	}

	
	public int getWasser() {
		return wasser;
	}

	
	public void setWasser(int wasser) {
		this.wasser = wasser;
	}
	
	
}
