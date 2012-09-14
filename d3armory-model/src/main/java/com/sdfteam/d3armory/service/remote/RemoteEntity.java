package com.sdfteam.d3armory.service.remote;

/**
 * A remote entity. Contains the error message. Battle.net servers returning
 * this structure for an exception (example: account not found). These may
 * contain null or detailed messages. Other entities needs to extend this class
 * to be able to carry such an information.
 * 
 * @author NoTiCe
 * 
 */
public class RemoteEntity {
	private String code;
	private String reason;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
