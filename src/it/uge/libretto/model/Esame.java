package it.uge.libretto.model;

import java.time.LocalDate;

/**
 * oggetto semplice che contieni i dati
 * dati privati
 * motodi get set
 * metodi di servizio
 * 
 * 
 * @author eugenio
 *
 */
public class Esame {
	
	private String codice ;
	private String titolo ;
	private String docente ;
	private int voto;
	private boolean superato;
	private LocalDate dataSuperamento;
	
	
	/**
	 * Costruttore della classe
	 * 
	 * @param codice
	 * @param titolo
	 * @param docente
	 */
	public Esame(String codice, String titolo, String docente) {
		super();
		this.codice = codice;
		this.titolo = titolo;
		this.docente = docente;
		
		this.superato = false;
	}


	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}


	/**
	 * @param codice the codice to set
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}


	/**
	 * @return the titolo
	 */
	public String getTitolo() {
		return titolo;
	}


	/**
	 * @param titolo the titolo to set
	 */
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	/**
	 * @return the docente
	 */
	public String getDocente() {
		return docente;
	}


	/**
	 * @param docente the docente to set
	 */
	public void setDocente(String docente) {
		this.docente = docente;
	}


	/**
	 * @return the voto
	 */
	public int getVoto() {
		return voto;
	}


	/**
	 * @param voto the voto to set
	 */
	public void setVoto(int voto) {
		this.voto = voto;
	}


	/**
	 * @return the superato
	 */
	public boolean isSuperato() {
		return superato;
	}


	/**
	 * @param superato the superato to set
	 */
	public void setSuperato(boolean superato) {
		this.superato = superato;
	}


	/**
	 * @return the dataSuperamento
	 */
	public LocalDate getDataSuperamento() {
		return dataSuperamento;
	}


	/**
	 * @param dataSuperamento the dataSuperamento to set
	 */
	public void setDataSuperamento(LocalDate dataSuperamento) {
		this.dataSuperamento = dataSuperamento;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Esame [codice=" + codice + ", titolo=" + titolo + ", docente=" + docente + ", voto=" + voto
				+ ", superato=" + superato + ", dataSuperamento=" + dataSuperamento + "]";
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codice == null) ? 0 : codice.hashCode());
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Esame other = (Esame) obj;
		if (codice == null) {
			if (other.codice != null)
				return false;
		} else if (!codice.equals(other.codice))
			return false;
		return true;
	}
	
	

	
}
