package br.com.thedevelopersconference.loiane.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonAutoDetect;

/**
 * Contact POJO
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
@JsonAutoDetect
@Entity
@Table(name="CONTACT")
public class Contact {
	
	@Id
	@GeneratedValue
	@Column(name="CONTACT_ID")
	private int id;
	
	@Column(name="CONTACT_NAME", nullable=false)
	private String name;
	
	@Column(name="CONTACT_PHONE", nullable=false)
	private String phone;
	
	@Column(name="CONTACT_EMAIL", nullable=false)
	private String email;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
}
