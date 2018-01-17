/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata_4;

/**d
 *
 * @author Luis Pérez
 */
public class Mail {
    private final String mail;

    public Mail(String mail) {
        this.mail = mail;
      if(true){
          
      }
    }

    public String getDomain() {
        int index = mail.indexOf("@");
        if (index >= 0) {
            return mail.substring(index+1);
        }
        return null;
    }
}