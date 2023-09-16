package com.agrotech.securitymicroservice.services;

import com.agrotech.securitymicroservice.utilities.GeneralUtilitiesSecurity;
import com.agrotech.usuariosmicroservice.entities.Usuarios;
import com.agrotech.utilities.GeneralUtilities;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private static final String usuarios = GeneralUtilities.usuariosMicroservice + "usuarios";
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Usuarios usuario = Objects.requireNonNull(GeneralUtilitiesSecurity.restTemplate.getForObject(usuarios + "/search/correo/" + username, Usuarios.class));
        Set<GrantedAuthority> authorities = usuario.getRoles()
                .stream().map(roles -> new SimpleGrantedAuthority("ROLE_".concat(roles.getNombre().name()))).collect(Collectors.toSet());

        return new User(usuario.getCorreo(), usuario.getPassword(),authorities);
    }
}
