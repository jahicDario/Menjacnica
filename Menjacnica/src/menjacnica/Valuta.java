package menjacnica;

import java.util.GregorianCalendar;

public class Valuta {

	private String naziv;
	private String skraceniNaziv;
	private double prodajniKurs;
	private double kupovniKurs;
	private double srednjiKurs;
	private GregorianCalendar datum;

	

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		if (naziv == null) {
			throw new RuntimeException("Greska prilikom unosa naziva");
		} else {
			this.naziv = naziv;
		}
	}

	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) {
		if(skraceniNaziv == null){
			throw new RuntimeException("Greska prilikom unosa skracenog naziva.");
		}else{
			this.skraceniNaziv = skraceniNaziv;			
		}
		
	}

	public double getProdajniKurs() {
		return prodajniKurs;
	}

	public void setProdajniKurs(double prodajniKurs) {
		if(prodajniKurs < 0){
			throw new RuntimeException("Greska prilikom unosa prodajnog kursa!");
		}else{			
			this.prodajniKurs = prodajniKurs;
		}
	}

	public double getKupovniKurs() {
		return kupovniKurs;
	}

	public void setKupovniKurs(double kupovniKurs) {
		if(kupovniKurs < 0){
			throw new RuntimeException("Greska prilikom unosa kupovnog kursa.");
		}else{
			this.kupovniKurs = kupovniKurs;	
		}
	}

	public double getSrednjiKurs() {
		return srednjiKurs;
	}

	public void setSrednjiKurs(double srednjiKurs) {
		if(srednjiKurs<0){
			throw new RuntimeException("Greska prilikom unosa srednjeg kursa.");
		}else{
			this.srednjiKurs = srednjiKurs;			
		}
	}
	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) {
		if(datum == null){
			throw new RuntimeException("Greska prilikom unosa datuma.");
		}else{
			this.datum = datum;			
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Valuta) {
			Valuta v = (Valuta) obj;
			if (v.getNaziv().equals(this.naziv)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv + ", prodajniKurs=" + prodajniKurs
				+ ", kupovniKurs=" + kupovniKurs + ", srednjiKurs=" + srednjiKurs + "]";
	}

}
