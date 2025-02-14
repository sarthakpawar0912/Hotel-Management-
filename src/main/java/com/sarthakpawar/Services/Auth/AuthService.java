package com.sarthakpawar.Services.Auth;

import com.sarthakpawar.DTO.SignUpRequest;
import com.sarthakpawar.DTO.UserDto;

public interface AuthService {

    UserDto createUser(SignUpRequest signUpRequest);
}
