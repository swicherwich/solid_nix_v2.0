package com.nix.data;

import com.nix.service.Inspiration;
import com.nix.service.WritingPreparation;
import com.nix.service.impl.InspirationImpl;
import com.nix.service.impl.WritingPreparationImpl;

public class Writer {
	
	private final Inspiration inspiration = new InspirationImpl();
	private final WritingPreparation writingPreparation = new WritingPreparationImpl();
	
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
