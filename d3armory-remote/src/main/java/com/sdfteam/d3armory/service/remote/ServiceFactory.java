package com.sdfteam.d3armory.service.remote;

/**
 * Creates and configures remote services.
 * 
 * @author NoTiCe
 * 
 */
public class ServiceFactory {

	/**
	 * Creates a RemoteService instance.
	 * 
	 * @param <T>
	 *            The type of the RemoteEntity.
	 * @param clazz
	 *            The type of the RemoteEntity.
	 * @return The created and configured RemoteService
	 */
	public <T extends RemoteEntity> RemoteService<T> getService(Class<T> clazz) {
		SpringRemoteService<T> remoteService = new SpringRemoteService<T>(clazz);
		return remoteService;
	}

}
