package com.nix.config;

public interface Config {
	<T> Class<? extends T> getImplClass(Class<T> type);
}
