package ru.kata.spring.boot_security.demo.dto;

import java.util.Set;

public class UserDto {
    private Long id;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String email;
    private Integer age;
    private Set<Long> roles;


    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) { this.username = username; }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) { this.age = age; }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Long> getRoles() {
        return roles;
    }

    public void setRoles(Set<Long> roles) {
        this.roles = roles;
    }
}
