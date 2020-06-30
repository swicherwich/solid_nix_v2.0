package com.nix;

import com.nix.service.HasInspiration;
import com.nix.service.WritingPreparation;
import com.nix.service.impl.HasInspirationImpl;
import com.nix.service.impl.WritingPreparationImpl;

public class Writer {
	
	private final HasInspiration hasInspiration = new HasInspirationImpl();
	private final WritingPreparation writingPreparation = new WritingPreparationImpl();
	
	public void start(Idea idea) {
		hasInspiration.hasInspiration();
		writingPreparation.prepareForAWork();
		write(idea);
		writingPreparation.finishTheWork();
	}
	
	public void write(Idea idea) {
		System.out.println("Writing a poem...");
	}
}
