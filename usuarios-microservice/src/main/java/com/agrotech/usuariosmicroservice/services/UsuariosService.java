package com.agrotech.usuariosmicroservice.services;

import com.agrotech.plantasmicroservice.entities.Plagas;
import com.agrotech.usuariosmicroservice.dtos.UsuariosRequest;
import com.agrotech.usuariosmicroservice.entities.Roles;
import com.agrotech.usuariosmicroservice.entities.Usuarios;
import com.agrotech.usuariosmicroservice.enums.ERole;
import com.agrotech.usuariosmicroservice.repositories.UsuariosRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class UsuariosService {

    private final UsuariosRepository repository;
    private final PasswordEncoder passwordEncoder;

    public Usuarios create(UsuariosRequest dto) {

        Set<Roles> roles = dto.getRoles().stream().map(
                role -> Roles.builder()
                        .nombre(ERole.valueOf(role))
                        .descripcion("Prueba")
                        .creadoEn(new Timestamp(System.currentTimeMillis()))
                        .actualizadoEn(new Timestamp(System.currentTimeMillis()))
                        .build()
        ).collect(Collectors.toSet());

        var usuario = Usuarios.builder()
                .nombre(dto.getNombre())
                .apellido(dto.getApellido())
                .cedula(dto.getCedula())
                .correo(dto.getCorreo())
                .password(passwordEncoder.encode(dto.getPassword()))
                .activo(true)
                .creadoEn(new Timestamp(System.currentTimeMillis()))
                .actualizadoEn(new Timestamp(System.currentTimeMillis()))
                .roles(roles)
                .build();

        log.info("Usuario added: {}", usuario);

        return repository.save(usuario);
    }

    public void delete(Long id) {
        repository.deleteById(id);
        log.info("Se a borrado el usuario con id = ".concat(id.toString()));
    }

    public Usuarios findOneByCorreo(String correo) {
        return repository.findByCorreo(correo).orElse(null);
    }

}
