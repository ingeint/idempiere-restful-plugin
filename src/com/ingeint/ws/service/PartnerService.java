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

package com.ingeint.ws.service;

import java.util.List;
import java.util.Properties;

import javax.ws.rs.NotFoundException;

import org.compiere.model.MBPartner;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.util.Trx;

import com.ingeint.ws.base.RequestEnv;
import com.ingeint.ws.exception.InactiveRecord;

public class PartnerService {

	public MBPartner get(int id) {
		String trxName = RequestEnv.getCurrentTrxName();
		Properties ctx = RequestEnv.getCtx();

		MBPartner partner = new MBPartner(ctx, id, trxName);

		if (partner.get_ID() <= 0) {
			throw new NotFoundException();
		} else if (!partner.isActive()) {
			throw new InactiveRecord(id);
		}

		return partner;
	}

	public List<MBPartner> all() {
		return new Query(Env.getCtx(), MBPartner.Table_Name, "IsActive = ?", Trx.createTrxName()).setParameters(true).list();
	}

	public void delete(int id) {
		String trxName = RequestEnv.getCurrentTrxName();
		Properties ctx = RequestEnv.getCtx();

		MBPartner partner = new MBPartner(ctx, id, trxName);

		if (partner.get_ID() <= 0) {
			throw new NotFoundException();
		}

		partner.deleteEx(true, trxName);
	}
}
