
package kata_4;

/**
 *
 * @author Luis Pérez
 */



import java.io.IOException;
import java.util.List;


 
 public class Kata_4 {
 
     public static void main(String[] args) throws IOException {
         String fileName = "emails.txt";
         List<Mail> mailList = MailListReader.read(fileName);
         Histogram<String> histogram = MailHistogramBuilder.build(mailList);
         HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
         histoDisplay.execute();
     }
 }