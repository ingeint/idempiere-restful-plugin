package com.ingeint.ws.interceptor;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.compiere.util.Trx;

import com.ingeint.ws.base.RequestEnv;

public class OpenTransactionInterceptor extends AbstractPhaseInterceptor<Message> {

	public OpenTransactionInterceptor() {
		super(Phase.PRE_LOGICAL);
	}

	@Override
	public void handleMessage(Message message) throws Fault {
		message.getExchange().put(RequestEnv.TRX_NAME, Trx.createTrxName());
	}

}
