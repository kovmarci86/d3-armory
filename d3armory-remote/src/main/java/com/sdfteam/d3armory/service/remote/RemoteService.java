package com.sdfteam.d3armory.service.remote;

import com.sdfteam.d3armory.service.configuration.Configuration;
import com.sdfteam.d3armory.service.remote.exception.D3ServerCommunicationException;

/**
 * A RemoteService give access to Remote entities.
 * 
 * @author NoTiCe
 * 
 */
public interface RemoteService<T extends RemoteEntity> {
	T receiveEntity(Configuration configuration)
			throws D3ServerCommunicationException;
}
