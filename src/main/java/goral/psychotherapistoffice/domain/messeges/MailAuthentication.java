package goral.psychotherapistoffice.domain.messeges;

import goral.psychotherapistoffice.config.ConfigProvider;
import jakarta.mail.Authenticator;
import jakarta.mail.PasswordAuthentication;

public class MailAuthentication extends Authenticator {


    String email = ConfigProvider.get("gmailcredentials.email");
    String password = ConfigProvider.get("gmailcredentialscredentials.password");

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return new  PasswordAuthentication(email, password);
    }
}
