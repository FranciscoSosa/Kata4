package kata4.control;

import kata4.model.Histogram;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Kata4 {
    public static void main(String[] args) {
        Histogram<String> histogram = MailHistogramBuilder.build(MailListReader.read("email.txt"));
        new HistogramDisplay(histogram).execute();
    }
}
