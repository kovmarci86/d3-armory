package com.sdfteam.d3armory.service.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Tells a field is a remote data with informations for accessing the data. The
 * system using the field can retrieve this information from the annotation.
 * 
 * @author NoTiCe
 * 
 */
@Target({ ElementType.FIELD })
public @interface RemoteData {

	/**
	 * The type of the data.
	 * 
	 * @return
	 */
	DataType type();
}
