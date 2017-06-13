package it.uge.libretto;

import java.net.URL;
import java.util.ResourceBundle;

import it.uge.libretto.model.Esame;
import it.uge.libretto.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class LibrettoController {
	
	Model model;

    /**
     * Motodo che permette al Main di informare la vista di quale è il model
     * 
	 * @param model the model to set
	 */
	public void setModel(Model model) {
		this.model = model;
	}

	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtCodice;

    @FXML
    private TextField txtTitolo;

    @FXML
    private TextField txtDocente;

    @FXML
    private Button btnInserisci;

    @FXML
    private Button btnCerca;

    @FXML
    private TextArea txtMessaggi;

    @FXML
    void handleCerca(ActionEvent event) {
    	
    	// reupera i dati dalla vista
    	String codice = txtCodice.getText();
    	
    	// verifica la validità dei dati
    	if(codice.length()<5){
    		txtMessaggi.appendText("Codice non valido\n");
    		return;
    	}
    	
    	// chiede al model di effettuare l'operazione
    	Esame e = model.trovaEsame(codice) ;
    	
    	// aggiorna la vista con il risultato dell'operazione
    	if (e == null){
    		txtMessaggi.appendText("Codice non trovato\n");
    	} else {
    		txtMessaggi.appendText("Codice " + codice + " trovato\n");
    		
    		txtCodice.setText(e.getCodice());
    		txtTitolo.setText(e.getTitolo());
    		txtDocente.setText(e.getDocente());
    	}
    	

    }

    @FXML
    void handleInserisci(ActionEvent event) {
    	// reupera i dati dalla vista
    	String codice = txtCodice.getText();
    	String titolo = txtTitolo.getText();
    	String docente = txtDocente.getText();
    	
    	// verifica la validità dei dati
    	if(codice.length()<5 || titolo.length() ==0 || docente.length() == 0){
    		txtMessaggi.appendText("Dati esame insufficineti\n");
    		return;
    	}
    	
    	// chiede al model di effettuare l'operazione
    	Esame e = new Esame(codice, titolo, docente);
    	boolean result = model.addEsame(e);
    	
    	// aggiorna la vista con il risultato dell'operazione
    	if(result){
    		txtMessaggi.appendText("Esame aggiunto correttamente\n");
    	} else {
    		txtMessaggi.appendText("Esame non aggiunto correttamente\n");
    	}

    }

    @FXML
    void initialize() {
        assert txtCodice != null : "fx:id=\"txtCodice\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert txtTitolo != null : "fx:id=\"txtTitolo\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert txtDocente != null : "fx:id=\"txtDocente\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert btnCerca != null : "fx:id=\"btnCerca\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert txtMessaggi != null : "fx:id=\"txtMessaggi\" was not injected: check your FXML file 'Libretto.fxml'.";

    }
}
