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

import java.util.Properties;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.compiere.util.Env;

public class ConfigContextInterceptor extends AbstractPhaseInterceptor<Message> {

	public ConfigContextInterceptor() {
		super(Phase.PRE_LOGICAL);
	}

	@Override
	public void handleMessage(Message message) throws Fault {
		Properties ctx = new Properties();
		ctx.put("#AD_Client_ID", "11");
		ctx.put("#AD_Language", "es_CO");
		Env.setCtx(ctx);
	}

}
