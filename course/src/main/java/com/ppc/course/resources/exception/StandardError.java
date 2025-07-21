package com.ppc.course.resources.exception;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Instant timestamp;
	private Integer status;
	private String error; // Campo "error" para a mensagem genérica
	private String message; // Campo "message" para a mensagem específica da exceção
	private String path;
	
	public StandardError() {
		// Construtor padrão, se necessário
	}

	// Construtor corrigido para incluir o campo 'error'
	public StandardError(Instant timestamp, Integer status, String error, String message, String path) {
		super(); // Chama o construtor da superclasse (Object)
		this.timestamp = timestamp;
		this.status = status;
		this.error = error; // Agora o campo 'error' é inicializado corretamente
		this.message = message;
		this.path = path;
	}

	// Getters e Setters
	public Instant getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Instant timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}