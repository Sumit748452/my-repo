package com.oredoo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "listedaccount")
public class ListedAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	@Column(name = "msisdn", unique = true)
	private String msisdn;
	@Column(name = "token", unique = true)
	private Long token;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public Long getToken() {
		return token;
	}
	public void setToken(Long token) {
		this.token = token;
	}
	public ListedAccount(Long id, String msisdn, Long token) {
		super();
		this.id = id;
		this.msisdn = msisdn;
		this.token = token;
	}
	public ListedAccount() {
		
	}
	@Override
	public String toString() {
		return "ListedAccount [id=" + id + ", msisdn=" + msisdn + ", token=" + token + "]";
	}
	
	

	
	
}
