package com.sarthakpawar.DTO;

import com.sarthakpawar.enums.UserRole;
import lombok.Data;

@Data
public class AuthenticationResponse {

            private String jwt;

            private Long userId;

            private UserRole userRole;

    public AuthenticationResponse(Long userId, String jwt, UserRole userRole) {
        this.userId = userId;
        this.jwt = jwt;
        this.userRole = userRole;
    }

    public AuthenticationResponse() {
    }

    @Override
    public String toString() {
        return "AuthenticationResponse{" +
                "jwt='" + jwt + '\'' +
                ", userId=" + userId +
                ", userRole=" + userRole +
                '}';
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
}
