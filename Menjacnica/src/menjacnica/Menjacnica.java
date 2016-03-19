package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	private LinkedList<Valuta> valuta;
	private GregorianCalendar datum;

	@Override
	public void dodajKursaValute(GregorianCalendar datum) {

	}

	@Override
	public void brisanjeKursaValuta(GregorianCalendar datum) {

	}

	@Override
	public Valuta pronalazenjeKursaValute(GregorianCalendar datum) {
		
		return null;
	}

}
