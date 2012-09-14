package com.sdfteam.d3armory.service.remote.exception;

import java.io.IOException;

import com.sdfteam.d3armory.service.remote.RemoteEntity;

/**
 * Represents an exception coming from the Battle.net servers. May contain an
 * ErrorEntity describing the problem.
 * 
 * When receiving this exception, the communication was ended successfully, but
 * the result is an error.
 * 
 * @author NoTiCe
 * 
 */
@SuppressWarnings("serial")
public class D3ServerCommunicationException extends IOException {

	private RemoteEntity errorEntity;

	/**
	 * Creates the entity with a given cause.
	 * 
	 * @param errorEntity
	 *            The cause message from the server.
	 */
	public D3ServerCommunicationException(RemoteEntity errorEntity) {
		this.errorEntity = errorEntity;
	}

	/**
	 * Gives back the error entity.
	 * 
	 * @return The error entity, may be null.
	 */
	public RemoteEntity getErrorEntity() {
		return errorEntity;
	}
}
