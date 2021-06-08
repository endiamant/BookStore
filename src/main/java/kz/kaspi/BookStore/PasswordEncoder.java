package kz.kaspi.BookStore;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String raw = "123";
        String encodedPassword = encoder.encode(raw);
        System.out.print(encodedPassword);
    }

}
