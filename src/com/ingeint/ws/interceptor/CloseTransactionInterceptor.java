package com.ingeint.ws.interceptor;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.compiere.util.Trx;

import com.ingeint.ws.base.RequestEnv;

public class CloseTransactionInterceptor extends AbstractPhaseInterceptor<Message> {

	public CloseTransactionInterceptor() {
		super(Phase.POST_LOGICAL);
	}

	@Override
	public void handleMessage(Message message) throws Fault {
		Trx trx = Trx.get((String) message.getExchange().get(RequestEnv.TRX_NAME), false);
		trx.commit();
		trx.close();
	}

}
