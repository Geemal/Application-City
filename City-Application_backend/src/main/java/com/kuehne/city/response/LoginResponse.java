package com.kuehne.city.response;

import org.springframework.lang.NonNull;

public class LoginResponse {

    @NonNull
    String token;
    String authorities;

    public String getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    public LoginResponse(String token, String authorities) {
        this.token = token;
        this.authorities = authorities;
    }

    @NonNull
    public String getToken() {
        return token;
    }

    public void setToken(@NonNull String token) {
        this.token = token;
    }
}
