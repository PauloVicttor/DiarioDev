package com.paulovictor.DiarioDev.Services;

import com.paulovictor.DiarioDev.request.AuthRequest;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AuthenticationService extends UserDetailsService {

    String getToken(AuthRequest auth);

    String validateJwtToken(String token);
}