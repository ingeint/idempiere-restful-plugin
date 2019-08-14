package com.ingeint.ws.interceptor;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

public class CloseTransactionInterceptor extends AbstractPhaseInterceptor<Message> {

	public CloseTransactionInterceptor() {
		super(Phase.POST_LOGICAL);
	}

	@Override
	public void handleMessage(Message message) throws Fault {

	}

}
