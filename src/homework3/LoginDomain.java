package homework3;

import java.util.Locale;

public class UserEmail {
    /*7. Given a user's email address: john_smith@example.com.
    Create two strings "login" and "domain" which will be substrings of full email address.
    The First Name and Last Name of the user should be in the following format: "Name Surname".
    */
    public static void main(String[] args) {
        String email = "john_smith@example.com";
        String login = email.substring(0,1).toUpperCase() + email.substring(1,email.indexOf("_")) + " "
                + email.substring(email.indexOf("_")+1, email.indexOf("_")+2).toUpperCase()
                + email.substring((email.indexOf("_")+2), email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1);
        System.out.println("Login: " + login);
        System.out.println("Domain: " + domain);
    }
}
