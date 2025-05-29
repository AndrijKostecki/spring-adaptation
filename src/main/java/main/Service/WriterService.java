package main.Service;



import org.springframework.beans.factory.annotation.Autowired;

import writer.IWriter;


public class WriterService {

    private final IWriter writer;

    @Autowired
    public WriterService(IWriter writer) {
        this.writer = writer;
    }

    public String formatText(String text) {
        writer.writer(text);
        return "Processed: " + text;
    }
}