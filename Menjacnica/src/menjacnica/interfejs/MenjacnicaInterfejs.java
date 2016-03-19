package menjacnica.interfejs;

import java.util.GregorianCalendar;

import menjacnica.Valuta;

public interface MenjacnicaInterfejs {

	public void dodavanjeKursaValute(Valuta v);
	public void brisanjeKursaValuta(Valuta v);
	public Valuta pronalazenjeKursaValute(GregorianCalendar datum);
	
}
