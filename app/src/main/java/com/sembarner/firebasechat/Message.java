package com.sembarner.firebasechat;

import java.util.Date;

public class Message {
    private String textmessage;
    private String author;
    private long timemessage;

    public Message(String textmessage, String author) {
        this.textmessage = textmessage;
        this.author = author;
        timemessage = new Date().getTime();

    }

    public Message() {
    }

    public String getTextmessage() {
        return textmessage;
    }

    public void setTextmessage(String textmessage) {
        this.textmessage = textmessage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getTimemessage() {
        return timemessage;
    }

    public void setTimemessage(long timemessage) {
        this.timemessage = timemessage;
    }
}
