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

package com.ingeint.ws.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ingeint.ws.presenter.Partner;
import com.ingeint.ws.service.PartnerService;

@Path("/partner")
@Produces(MediaType.APPLICATION_JSON)
public class PartnerController {

	private PartnerService partnerService = new PartnerService();

	@GET
	@Path("/{id}")
	public Partner get(@PathParam("id") int id) {
		return Partner.copy(partnerService.get(id));
	}

	@GET
	public List<Partner> get() {
		return partnerService.all().stream().map(partner -> Partner.copy(partner)).collect(Collectors.toList());
	}

	@PUT
	public String put() {
		return "put";
	}

	@POST
	public String post() {
		return "post";
	}

	@DELETE
	@Path("/{id}")
	public void delete(@PathParam("id") int id) {
		partnerService.delete(id);
	}

}