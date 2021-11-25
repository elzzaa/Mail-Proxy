package mailSender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static mailSender.Sex.MALE;
import static org.junit.jupiter.api.Assertions.*;

class MailSenderTest {

    Client client = new Client("Tom", 21, MALE);
    MailInfo mailInfo = new MailInfo(client);

    @BeforeEach
    void setUp() {
        MailSender.sendMail(mailInfo);
    }

    @Test
    void sendAll() {
        assertEquals("Client(id=0, name=Tom, age=21, sex=male)", MailSender.sendMail(mailInfo));
    }
}