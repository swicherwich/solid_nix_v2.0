package com.nix.config.impl;

import com.nix.config.Config;
import org.reflections.Reflections;

import java.util.Set;

public class JavaConfig implements Config {
	
	private final Reflections scanner;
	
	public JavaConfig(String packageToScan) {
		this.scanner = new Reflections(packageToScan);
	}
	
	@Override
	public <T> Class<? extends T> getImplClass(Class<T> ifc) {
		Set<Class<? extends T>> classes = scanner.getSubTypesOf(ifc);
		if(classes.size() != 1) {
			throw new RuntimeException("Interface has zero or more implementations");
		}
		return classes.iterator().next();
	}
}
