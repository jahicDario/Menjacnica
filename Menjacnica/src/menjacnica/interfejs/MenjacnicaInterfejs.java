package menjacnica.interfejs;

import java.util.GregorianCalendar;

import menjacnica.Valuta;

public interface MenjacnicaInterfejs {

	public void dodajKursaValute(GregorianCalendar datum);
	public void brisanjeKursaValuta(GregorianCalendar datum);
	public Valuta pronalazenjeKursaValute(GregorianCalendar datum);
	
}
