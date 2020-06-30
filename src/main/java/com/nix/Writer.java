package com.nix;

import com.nix.service.HasInspiration;
import com.nix.service.impl.HasInspirationImpl;

public class Writer {
	
	private final HasInspiration hasInspiration = new HasInspirationImpl();
	
	public void start(Idea idea) {
		hasInspiration.hasInspiration();
		System.out.println("Preparing for a work...");
		write(idea);
		System.out.println("Finish the work...");
	}
	
	public void write(Idea idea) {
		System.out.println("Writing a poem...");
	}
}
