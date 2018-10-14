package Kata3;

public class Kata3 {
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        histogram.increment("gmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("yahoo.com");
        histogram.increment("yahoo.com");
        histogram.increment("astalavista.com");

        new HistogramDisplay(histogram).execute();
    }
}
