package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	private LinkedList<Valuta> valute;

	
	public Menjacnica() {
		valute = new LinkedList<Valuta>();
	}

	@Override

	public void dodavanjeKursaValute(Valuta v) {
		valute.add(v);
	}

	@Override
	public void brisanjeKursaValuta(Valuta v) {
		int dan = v.getDatum().get(GregorianCalendar.DAY_OF_MONTH);
		int mesec = v.getDatum().get(GregorianCalendar.MONTH);
		int godina = v.getDatum().get(GregorianCalendar.YEAR);
		for (int i = 0; i < valute.size(); i++) {
			
			int danV = valute.get(i).getDatum().get(GregorianCalendar.DAY_OF_MONTH);
			int mesecV = valute.get(i).getDatum().get(GregorianCalendar.MONTH);
			int godinaV = valute.get(i).getDatum().get(GregorianCalendar.YEAR);
			
			if(dan == danV && mesec == mesecV && godina == godinaV){
				valute.remove(valute.get(i));
				return;
			}
		}
	}

	@Override
	public Valuta pronalazenjeKursaValute(GregorianCalendar datum) {

		int dan = datum.get(GregorianCalendar.DAY_OF_MONTH);
		int mesec = datum.get(GregorianCalendar.MONTH);
		int godina = datum.get(GregorianCalendar.YEAR);
		for (int i = 0; i < valute.size(); i++) {
			
			int danV = valute.get(i).getDatum().get(GregorianCalendar.DAY_OF_MONTH);
			int mesecV = valute.get(i).getDatum().get(GregorianCalendar.MONTH);
			int godinaV = valute.get(i).getDatum().get(GregorianCalendar.YEAR);
			
			if(dan == danV && mesec == mesecV && godina == godinaV){
				return valute.get(i);
			}
		}
		//Nema informacija o trazenom datumu.
		return null;
	}

}
