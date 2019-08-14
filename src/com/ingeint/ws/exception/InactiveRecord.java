package com.ingeint.ws.exception;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import com.ingeint.ws.presenter.ExceptionMessage;

public class InactiveRecord extends WebApplicationException {

	private static final long serialVersionUID = 7309715384785125028L;

	public InactiveRecord(int id) {
		super(Response.status(Response.Status.NOT_FOUND).entity(new ExceptionMessage(Response.Status.NOT_FOUND.getStatusCode(), String.format("Record %s is inactive", id))).build());
	}

}
