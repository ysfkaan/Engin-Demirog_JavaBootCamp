package gun5odev1.core.concretes;

import gun5odev1.core.abstracts.IMailService;

public class MailManager implements IMailService {

	
	public void VerficationMail() {
		System.out.println("doğrulama maili gönderildi" );
		
		if (true) {
			System.out.println("mailiniz doğrulanmıştır");
			
		}
		
	}

}
