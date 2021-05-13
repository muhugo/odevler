package eCommerce.core.googleMail;

import eCommerce.core.EmailService;
import googleMail.GoogleMailManager;

public class GoogleMailManagerAdater implements EmailService {
  private GoogleMailManager googleMailManager;
  public GoogleMailManagerAdater() {
	  super();
	  this.googleMailManager= new GoogleMailManager();
  }
	
	

@Override
public void send(String email, String message) {
googleMailManager.send(email, message);
	
}
	
	

	
		}

