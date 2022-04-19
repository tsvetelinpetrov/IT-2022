package sit.tu_varna.bg.models;

import java.util.Objects;

public class Login {
    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Login(String username) {
        this(username, null);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Login)) return false;
        Login login = (Login) o;
        return username.equals(login.username) && password.equals(login.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }
}
