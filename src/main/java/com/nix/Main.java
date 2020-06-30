package com.nix;

import com.nix.data.Idea;
import com.nix.data.Writer;

public class Main {
	public static void main(String[] args) {
		Writer writer = new Writer();
		writer.start(new Idea());
	}
}
