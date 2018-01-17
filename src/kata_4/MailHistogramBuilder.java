/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata_4;

/**
 *
 * @author Luis Pérez
 */

import kata_4.Histogram;
import kata_4.Mail;
import java.util.List;



public class MailHistogramBuilder {
    public static Histogram<String> build(List<Mail> list) {
        Histogram<String> histo = new Histogram<>();
        String domain;
        for(Mail m : list) {
            domain = m.getDomain();
            if (domain != null)
                histo.increment(m.getDomain());
        }
        return histo;
    }
}