package mailSender;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    List<MailInfo> infos = new ArrayList<>();
    MailSender sender = new MailSender();

    public void addMailInfo(MailInfo single_info) {
        infos.add(single_info);
    }

    public void sendAll() {
        for (MailInfo info : infos) {
            MailSender.sendMail(info);
        }
    }
}
