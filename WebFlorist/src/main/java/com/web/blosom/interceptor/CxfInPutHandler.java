package com.web.blosom.interceptor;

import javax.servlet.http.HttpServletRequest;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.transport.http.AbstractHTTPDestination;

public class CxfInPutHandler extends AbstractPhaseInterceptor<Message>{

	public CxfInPutHandler(){
		  super(Phase.PRE_STREAM);
		 }

	public void handleMessage(Message message) throws Fault {
		System.out.println("Inside in coming intercptor");
		if(message.getExchange().getInMessage() != null){
			if(message.getExchange().getInMessage().get(AbstractHTTPDestination.HTTP_REQUEST) != null){
				HttpServletRequest request = (HttpServletRequest) message.getExchange().getInMessage().get(AbstractHTTPDestination.HTTP_REQUEST);
				
			}
		}
	}
}
