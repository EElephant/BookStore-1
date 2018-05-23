package top.yimiaohome.shiro;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class ShiroUser implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private Set<String> roles=new HashSet<String>();

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Set<String> getRoles() {
        return roles;
    }
    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }
}