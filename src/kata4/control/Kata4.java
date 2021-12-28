package kata4.control;

import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

import java.util.List;

public class Kata4 {
    private static List<Mail> mailList;
    private static Histogram<String> histogram;
    private static final String filename = "email.txt";

    public static void main(String[] args) {
        execute();
    }

    private static void input(){
        mailList = MailListReader.read(filename);
    }

    private static void process(){
        histogram = MailHistogramBuilder.build(mailList);
    }

    private static void output(){
        new HistogramDisplay(histogram).execute();
    }

    private static void execute(){
        input();
        process();
        output();
    }
}
