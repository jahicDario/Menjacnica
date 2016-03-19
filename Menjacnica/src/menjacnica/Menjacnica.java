package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	private LinkedList<Valuta> valute;
	

	@Override
	public void dodavanjeKursaValute(Valuta v) {
		valute.addLast(v);
	}

	@Override
	public void brisanjeKursaValuta(Valuta v) {
		for (int i = 0; i < valute.size(); i++) {
			if(v.getDatum().equals(valute.get(i).getDatum())){
				valute.remove(valute.get(i));
				return;
			}
		}
	}

	@Override
	public Valuta pronalazenjeKursaValute(GregorianCalendar datum) {
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getDatum().equals(datum)){
				return valute.get(i);
			}
		}
		//ne postoji informacija za trazeni datum
		return null;
	}

}
