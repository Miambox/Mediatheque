package com.mediatheque.service;

public class ItemsNotAvailableException extends Exception {
	private static final long serialVersionUID = 1L;

	public ItemsNotAvailableException(String message) {
		super(message);
	}

}
