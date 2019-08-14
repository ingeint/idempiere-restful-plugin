package com.ingeint.ws.presenter;

import org.compiere.model.MBPartner;

public class Partner {

	private int clientId;
	private int orgId;
	private int id;
	private String name;
	private String taxId;
	private boolean isActive;

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public int getOrgId() {
		return orgId;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

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

	public String getTaxId() {
		return taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Partner(int clientId, int orgId, int id, String name, String taxId, boolean isActive) {
		this.clientId = clientId;
		this.orgId = orgId;
		this.id = id;
		this.name = name;
		this.taxId = taxId;
		this.isActive = isActive;
	}

	public static Partner copy(MBPartner partner) {
		return new Partner(partner.getAD_Client_ID(), partner.getAD_Org_ID(), partner.get_ID(), partner.getName(), partner.getTaxID(), partner.isActive());
	}

}
