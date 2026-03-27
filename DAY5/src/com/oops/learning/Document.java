package com.oops.learning;

public class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void sendToPrinter(Printer p) {
        p.printDocument(this); // passing this
    }
}
