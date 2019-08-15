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
