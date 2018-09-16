package com.scope.banking.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Transaction")
public class Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="transactionID")
	private int transactionId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="asset")
	private Scope_Asset asset;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="buyer")
	private Scope_user buyer;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="seller")
	private Scope_user seller;

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public Scope_Asset getAsset() {
		return asset;
	}

	public void setAsset(Scope_Asset asset) {
		this.asset = asset;
	}

	public Scope_user getBuyer() {
		return buyer;
	}

	public void setBuyer(Scope_user buyer) {
		this.buyer = buyer;
	}

	public Scope_user getSeller() {
		return seller;
	}

	public void setSeller(Scope_user seller) {
		this.seller = seller;
	}
	
}
