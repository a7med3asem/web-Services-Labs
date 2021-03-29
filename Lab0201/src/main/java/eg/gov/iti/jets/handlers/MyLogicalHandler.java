package eg.gov.iti.jets.handlers;

import jakarta.xml.ws.handler.*;

public class MyLogicalHandler implements LogicalHandler<LogicalMessageContext> {
    @Override
    public boolean handleMessage(LogicalMessageContext messageContext) {
        Boolean outboundProperty = (Boolean) messageContext.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if (outboundProperty.booleanValue()) {
            System.out.println("\nOutbound message:");
        } else {
            System.out.println("\nInbound message:");
        }

        System.out.println("** Response: " + messageContext.getMessage().toString());
        return true;
    }

    @Override
    public boolean handleFault(LogicalMessageContext messageContext) {
        return true;
    }

    @Override
    public void close(MessageContext messageContext) {
        System.out.println("Handler closed");
    }
}
