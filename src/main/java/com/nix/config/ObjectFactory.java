package com.nix.config;

import com.nix.config.impl.JavaConfig;

import java.lang.reflect.InvocationTargetException;

public class ObjectFactory {
	private static final ObjectFactory instance = new ObjectFactory();
	private final Config config = new JavaConfig("com.nix");
	
	private ObjectFactory() { }
	
	public static ObjectFactory getInstance() {
		return instance;
	}
	
	
	public <T> T createObject(Class<T> type) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		Class<? extends T> classImpl = type;
		if(type.isInterface()) {
			classImpl = config.getImplClass(type);
		}
		T t = classImpl.getDeclaredConstructor().newInstance();
		return t;
	}
	
}
