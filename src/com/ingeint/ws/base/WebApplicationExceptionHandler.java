package com.ingeint.ws.base;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import org.compiere.util.Trx;

public class WebApplicationExceptionHandler implements ExceptionMapper<WebApplicationException> {

	@Override
	public Response toResponse(WebApplicationException exception) {
		Trx trx = Trx.get(RequestEnv.getCurrentTrxName(), false);
		trx.rollback();
		return exception.getResponse();
	}

}