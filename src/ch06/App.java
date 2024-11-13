package ch06;

import ch06.notification.BasicNotifier;
import ch06.notification.EmailNotifier;
import ch06.notification.Notifier;
import ch06.notification.SmsNotifier;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class App {

    public static void 알림(Notifier notifier){
        notifier.send();
    }

    // 데코레이터 패턴 : 기능 확장 (핵심)
    public static void main(String[] args) throws IOException {
        // 1. 전체 알림 (기본알림 -> 문자알림 -> 이메일알림)

        // 2. 전체 알림 (기본알림 -> 이메일알림 -> 문자알림)
        Notifier n2 = new SmsNotifier(new EmailNotifier(new BasicNotifier()));
        알림(n2);

        // 3. 기본 알림

        // 4. 기본 알림 + 문자 알림

        // 5. 기본 알림 + 이메일 알림

        // 6. 이메일 알림

        // 7. 문자 알림

        // 8. 문자알림 + 이메일알림
    }
}
