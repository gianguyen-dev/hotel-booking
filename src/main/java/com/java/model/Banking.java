package com.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "banking")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Banking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_card")
	private long id_card;
	
	@Column(name = "ccv")
	private int ccv;
	
	@Column(name = "wallet")
	private int wallet;

	public long getId_card() {
		return id_card;
	}

	public void setId_card(long id_card) {
		this.id_card = id_card;
	}

	public int getCcv() {
		return ccv;
	}

	public void setCcv(int ccv) {
		this.ccv = ccv;
	}

	public int getWallet() {
		return wallet;
	}

	public void setWallet(int wallet) {
		this.wallet = wallet;
	}
	
}
