package sit.tu_varna.bg.libraries;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private String usernamePattern = "^[0-9a-zA-Z-_.]{8,25}$";
    private String passwordPattern = "^[0-9a-zA-Z-_.]{8,20}$";
    private String emailPattern = "^(.+)@(.+)$";

    public Validator() {}

    private boolean matches(String value, String pt) {
        Pattern pattern = Pattern.compile(pt);
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }

    public boolean usernameValidate(String value) {
        return this.matches(value, this.usernamePattern);
    }

    public boolean usernameValidate(String value, String pattern) {
        return this.matches(value, pattern);
    }

    public boolean passwordValidate(String value) {
        return this.matches(value, this.passwordPattern);
    }

    public boolean passwordValidate(String value, String pattern) {
        return this.matches(value, pattern);
    }

    public boolean emailValidate(String value) {
        return this.matches(value, this.emailPattern);
    }

    public boolean emailValidate(String value, String pattern) {
        return this.matches(value, pattern);
    }
}
