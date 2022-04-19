package sit.tu_varna.bg.models;

import java.util.Objects;

public class User {

    private String name;
    private Login login;

    private String imageName;
    private String jobTitle;
    private String info;

    private Skills skills;

    private Contact contact;

    public User(String name, String jobTitle, String info, String imageName, Login login, Contact contact, Skills skills) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.info = info;
        this.login = login;
        this.imageName = imageName;
        this.contact = contact;
        this.skills = skills;
    }

    public User(String name, Login login) {
        this(name,
                null,
                null,
                "male.png ",
                login,
                new Contact(null, null, new Address(null, null)),
                new Skills()
        );
    }

    public User(Login login) {
        this("", login);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        Login objLogin = user.getLogin();
        if(login == objLogin) return true;
        if(objLogin == null || login.getClass() != objLogin.getClass()) return false;
        return Objects.equals(login.getUsername(), user.login.getUsername());
    }

    @Override
    public int hashCode() {
        return Objects.hash(login.getUsername());
    }

    public void update(User newUser) {
        this.setName(newUser.getName());
        this.setJobTitle(newUser.getJobTitle());
        this.setInfo(newUser.getInfo());
    }
}
