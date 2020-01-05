/**
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Copyright (C) 2019 INGEINT <https://www.ingeint.com> and contributors (see README.md file).
 */

package com.ingeint.ws.base;

import static javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import org.adempiere.exceptions.AdempiereException;

import com.ingeint.ws.presenter.ExceptionMessage;

public class AdempiereExceptionHandler implements ExceptionMapper<AdempiereException> {

	@Override
	public Response toResponse(AdempiereException exception) {
		return Response.status(INTERNAL_SERVER_ERROR).entity(new ExceptionMessage(exception.getLocalizedMessage())).build();
	}

}
