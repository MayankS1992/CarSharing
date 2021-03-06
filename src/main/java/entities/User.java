package entities;

import lombok.Data;

@Data
public class User {
    private String fullName;
    private String username;
    private String email;
    private String password;
    private Role role;
}
