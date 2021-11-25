package mailSender;

import lombok.SneakyThrows;

public class MailSender {
    @SneakyThrows
    public static Object sendMail(MailInfo info){
        System.out.println(info.getEmail() + "Email was sent successfully");
        return null;
    }
}
