package com.nix.data;

import com.nix.config.ObjectFactory;
import com.nix.service.Inspiration;
import com.nix.service.WritingPreparation;
import com.nix.service.impl.InspirationImpl;
import com.nix.service.impl.WritingPreparationImpl;

import java.lang.reflect.InvocationTargetException;

public class Writer {
	
	private final Inspiration inspiration = ObjectFactory.getInstance().createObject(Inspiration.class);
	private final WritingPreparation writingPreparation = ObjectFactory.getInstance().createObject(WritingPreparation.class);
	
	public Writer() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
	}
	
	public void start(Idea idea) {
		inspiration.hasInspiration();
		writingPreparation.prepareForAWork();
		write(idea);
		writingPreparation.finishTheWork();
	}
	
	public void write(Idea idea) {
		System.out.println("Writing a poem...");
	}
}
