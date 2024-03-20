package accounts;

public class UserProfile {
    private final String login;
    private final String password;

    public UserProfile(String login, String pass) {
        this.login = login;
        this.password = pass;
    }

    public UserProfile(String login) {
        this.login = login;
        this.password = login;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return password;
    }
}