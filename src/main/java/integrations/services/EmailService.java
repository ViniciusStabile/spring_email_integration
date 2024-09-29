package integrations.services;

import integrations.dto.EmailDTO;

public interface EmailService {
	
	void sendEmail(EmailDTO dto);

}
