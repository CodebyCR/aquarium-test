

public class Fisch extends Aquarium {

	private boolean schwimmt;


	public Fisch(String platz, int wasserEinnahme,boolean schwimmt) {
		super(platz, wasserEinnahme);
		this.schwimmt = schwimmt;
	}


		//Set&Get
	public boolean isSchwimmt() {
			return schwimmt;
		}


	public void setSchwimmt(boolean schwimmt) {
			this.schwimmt = schwimmt;
		}



}
