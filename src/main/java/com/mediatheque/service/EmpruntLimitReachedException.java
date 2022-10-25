package com.mediatheque.service;

public class EmpruntLimitReachedException extends Exception {
	private static final long serialVersionUID = 1L;

	public EmpruntLimitReachedException(String message) {
		super(message);

	}
}
