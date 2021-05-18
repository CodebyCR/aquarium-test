import javax.swing.JOptionPane;


public class Application {

	public static void main(String agrs[]) {
		

		
		//Objekte
		JOptionPane.showMessageDialog(null, "Stellen Sie sich ein Aquarium vor mit 10 Liter Wasserinhalt, in diesen Schwimmen 2 Fische."
				+ "\n Ein Clownfisch und ein Docktorfisch."
				+ "\n Schwimmt mindestens einer der Fische kommt es zu einer Verunreinigug und das Wasser muss gerreinigt werden.");
				
		Fisch docktorFisch = new Fisch("links", 2, "ja".equals(JOptionPane.showInputDialog("Schwimmt der Docktorfisch?")));
		
		Fisch nemoFisch = new Fisch("rechts", 1, "ja".equals(JOptionPane.showInputDialog("Schwimmt der Clownfisch?")));
		
		Koralle supermanKoralle = new Koralle("links", 3, "rot-blau");
		
		Koralle hulkKoralle = new Koralle("rechts", 2, "grün");
		
		//Verunreinigung & Reinigung
		if(docktorFisch.isSchwimmt() || nemoFisch.isSchwimmt()) {
			JOptionPane.showMessageDialog(null, ("Das Aquarium wurde verunrenigt."));
			
			if(docktorFisch.isSchwimmt() && nemoFisch.isSchwimmt()) {
				docktorFisch.setWasser( docktorFisch.getWasser() - ( docktorFisch.getWasserEinnahme() + nemoFisch.getWasserEinnahme() ) );
				JOptionPane.showMessageDialog(null, "Es sind noch " + docktorFisch.getWasser() + "Liter Wasser sauber.");
				
			}
			else if(docktorFisch.isSchwimmt()) {
				docktorFisch.setWasser(docktorFisch.getWasser() - docktorFisch.getWasserEinnahme() );
				JOptionPane.showMessageDialog(null, "Es sind noch " + docktorFisch.getWasser() + "Liter Wasser sauber.");
				supermanKoralle.Reinigen();
				docktorFisch.setWasser(docktorFisch.getWasser() + supermanKoralle.getWasserEinnahme());
			}
			else{
				nemoFisch.setWasser(nemoFisch.getWasser() -  nemoFisch.getWasserEinnahme() );
				JOptionPane.showMessageDialog(null, "Es sind noch " + nemoFisch.getWasser() + "Liter Wasser sauber.");
				hulkKoralle.Reinigen();
				nemoFisch.setWasser(nemoFisch.getWasser() + hulkKoralle.getWasserEinnahme());
			}
		}
		else {
			supermanKoralle.Reinigen();
			hulkKoralle.Reinigen();
		}
		
		//Wasser wiederherstellung
		int altWasser = 10 - docktorFisch.getWasser();
		
		if(docktorFisch.getWasser() < 10) {
			nemoFisch.Reinigen();
			JOptionPane.showMessageDialog(null, "Es wurden noch " + altWasser + "Liter gereinigt.");
			
		}
		
	}
}
