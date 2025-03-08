package org.lld.displayObserver;

public class Display implements Observer {
    private String lastMessage = "";
    @Override
    public void update(String message) {
        lastMessage = message;
        System.out.println("Display:" + message);
    }
    public String getLastMessage() {
        return lastMessage;
    }

}
