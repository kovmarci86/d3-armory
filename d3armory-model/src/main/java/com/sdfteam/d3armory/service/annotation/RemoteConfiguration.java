package com.sdfteam.d3armory.service.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * A remote entity access configuration annotation. Defines the url for the
 * entity to access on.
 * 
 * @author NoTiCe
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface RemoteConfiguration {
	/**
	 * Url to access to the Class annotated with RemoteEntity.
	 * 
	 * @return The url, which may be processed before sending request.
	 */
	String url();
}
