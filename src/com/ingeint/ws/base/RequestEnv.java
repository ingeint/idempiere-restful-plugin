package com.ingeint.ws.base;

import java.util.Properties;

import org.apache.cxf.phase.PhaseInterceptorChain;
import org.compiere.util.Env;

public class RequestEnv {

	public static final String TRX_NAME = "trx.name";

	public static String getCurrentTrxName() {
		return (String) PhaseInterceptorChain.getCurrentMessage().getExchange().get(TRX_NAME);
	}

	public static Properties getCtx() {
		return Env.getCtx();
	}

}
