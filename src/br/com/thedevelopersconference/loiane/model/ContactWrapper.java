package br.com.thedevelopersconference.loiane.model;

/**
 * Contact Wrapper
 * Usado pelo Spring para fazer o wrapper do objeto
 * JSON - Ext JS
 * 
 * Projeto Exemplo apresentado no TDC 2011
 * The Developer's Conference
 * Sao Paulo - SP - 6 a 10 de Julho de 2011
 * http://www.thedevelopersconference.com.br/
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
public class ContactWrapper {

	private Contact data;

	public Contact getData() {
		return data;
	}

	public void setData(Contact data) {
		this.data = data;
	}
	
}
