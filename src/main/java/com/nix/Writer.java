package com.nix;

public class Writer {
	
	public static void start(Idea idea) {
		System.out.println("Finding inspiration...");
		System.out.println("Preparing for a work...");
		write(idea);
		System.out.println("Finish the work...");
	}
	
	public static void write(Idea idea) {
		System.out.println("Writing a poem...");
	}
}
