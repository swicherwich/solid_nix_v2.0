package com.nix.service.impl;

import com.nix.excetion.InspirationException;
import com.nix.service.HasInspiration;

public class HasInspirationImpl implements HasInspiration {
	
	private boolean hasInspiration = true;
	
	
	public void hasInspiration() {
		if(hasInspiration) {
			System.out.println("Today is a beautiful day. I'm full of ideas!");
		} else {
			throw new InspirationException("Everything is grey... I can't write anymore!");
		}
	}
}
