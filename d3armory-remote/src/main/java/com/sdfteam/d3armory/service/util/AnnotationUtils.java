package com.sdfteam.d3armory.service.util;

import java.lang.annotation.Annotation;

public class AnnotationUtils {
	/**
	 * Checks the class to have the given annotation.
	 * 
	 * @param clazz
	 *            The class to check.
	 * @param annotation
	 *            The annotation to check.
	 * @return True if class has annotation. False otherwise.
	 */
	public static boolean hasAnnotation(Class<?> clazz,
			Class<? extends Annotation> annotation) {
		Annotation found = clazz.getAnnotation(annotation);
		return found != null;
	}
}
