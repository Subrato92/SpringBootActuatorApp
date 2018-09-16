package com.scope.banking.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="asset")
public class Scope_Asset {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="assetId")
	private int assetId;
	
	@Column(name="name", length=30, nullable=false)
	private String assetName;
	
	@Column(name="userName", length=30, nullable=false)
	private String uName;
	
	@Column(name="value", nullable=false)
	private long assetValue;
	
	public long getAssetValue() {
		return assetValue;
	}
	public void setAssetValue(long assetValue) {
		this.assetValue = assetValue;
	}
	public int getAssetId() {
		return assetId;
	}
	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}
	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	
}
