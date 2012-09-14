package com.sdfteam.d3armory.util;

import java.lang.reflect.Type;

import flexjson.ObjectBinder;
import flexjson.ObjectFactory;

/**
 * Converts values to number.
 * 
 * @author NoTiCe
 * 
 */
public class NumberFactory implements ObjectFactory {

	public Object instantiate(ObjectBinder context, Object value,
			Type targetType, @SuppressWarnings("rawtypes") Class targetClass) {
		Object result = null;
		if (value != null) {
			String convertValue = value.toString();
			if (convertValue.contains(".")) {
				result = Double.valueOf(convertValue);
			} else {
				result = Long.valueOf(convertValue);
			}
		}
		return result;
	}

}
