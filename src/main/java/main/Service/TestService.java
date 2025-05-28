package main.Service;

import writer.IWriter;

public class TestService {

    private IWriter writer;
    private String myName;

    public void setWriter(IWriter writer) {
        this.writer = writer;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String run() {
        String s = "My name is " + this.myName;
        writer.writer(s);
        return s;
    }
}