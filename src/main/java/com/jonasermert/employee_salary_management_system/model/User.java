package com.jonasermert.employee_salary_management_system.model;

public class User {

    private long id;
    private String username;
    private String password;
    private Set<Authority> authorities;
    private String fullName;
    private String email;
    private String profilepicture = "default.png";
    private Integer grade;
    private String address;
    private String phoneNumber;
    private Boolean active = true;

    // Account
    private boolean enabled = true;
    private boolean accountNonExpired = true;
    private boolean accountNonLocked = true;
    private boolean credentialsNonExpired = true;
}
