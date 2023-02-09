package models;

/*
 * @author mafemartinez
 * @author angiecgomez
 * @author juamruiz 
 */
public class Admin {

    /*
     * Attributes
     */
    private String name;
    private String lastname;
    private String login;
    private String password;

    /*
     * Empty constructor
     */
     
    public Admin() {
    }

    /*
     * Constructor with parameters
     */

    public Admin(String name, String lastname, String login, String password) {
        this.name = name;
        this.lastname = lastname;
        this.login = login;
        this.password = password;
    }

    /*
     * Getters and setters
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
