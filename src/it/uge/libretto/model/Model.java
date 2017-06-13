package it.uge.libretto.model;

import java.util.ArrayList;
import java.util.List;

public class Model {
	
	private List<Esame> esami ;
	
	//Costruttore
	public Model(){
		this.esami = new ArrayList<Esame>();
	}
	
	/**
	 * Aggiunge un nuovo esame all'elenco degli esami precedenti
	 * verificando che non ci sia già
	 * @param e
	 * @return true se l'ha inserito false se esisteva già
	 */
	public boolean addEsame(Esame e){
		if(!esami.contains(e)){
			esami.add(e) ;
			return true ;
		} else  {
			return false;
		}
		
	}
	
	/**
	 * Ricerca se esiste un esame con il codice specificato
	 * se esiste lo restituisce
	 * altrimenti restituisce null
	 * @param codice esame da cercare
	 * @return esame oppure null
	 */
	public Esame trovaEsame(String codice){
		int pos = esami.indexOf(new Esame(codice,null,null));
		if(pos == -1){
			return null;
		} else {
			return esami.get(pos);
		}
	}
}
