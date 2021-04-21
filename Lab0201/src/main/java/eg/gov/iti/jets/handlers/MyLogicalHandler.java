package eg.gov.iti.jets.handlers;

import jakarta.xml.ws.*;
import jakarta.xml.ws.handler.*;

public class MyLogicalHandler implements LogicalHandler<LogicalMessageContext> {
    @Override
    public void close(MessageContext arg0) {

    }

    @Override
    public boolean handleFault(LogicalMessageContext arg0) {
        return false;
    }

    @Override
    public boolean handleMessage(LogicalMessageContext arg0) {
        System.out.println("from Logical Handler");
        System.out.println(arg0);
        return true;
    }

    // @Override
    // public boolean handleMessage(LogicalMessageContext messageContext) {
    // LogicalMessage message = messageContext.getMessage();
    // System.out.println("Message content");
    // System.out.println(">>>> " + message.getPayload());
    // return true;
    // }

    // @Override
    // public boolean handleFault(LogicalMessageContext messageContext) {
    // System.out.println("handleFault");
    // return true;
    // }

    // @Override
    // public void close(MessageContext messageContext) {
    // System.out.println("Handler closed");
    // }
}
