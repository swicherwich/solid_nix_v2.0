package com.nix;

import com.nix.data.Idea;
import com.nix.data.Writer;

import java.lang.reflect.InvocationTargetException;

public class Main {
	public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
		Writer writer = new Writer();
		writer.start(new Idea());
	}
}
