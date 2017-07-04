package demo.model;

import java.io.Serializable;

/**
 * Created by mingfei.net@gmail.com
 * 7/4/17 17:12
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;

    public User() {
    }

    public User(Integer id, String username, String password) {

        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
