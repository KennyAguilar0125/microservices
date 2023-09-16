package com.agrotech.usuariosmicroservice.controllers;

import com.agrotech.usuariosmicroservice.dtos.UsuariosRequest;
import com.agrotech.usuariosmicroservice.entities.Usuarios;
import com.agrotech.usuariosmicroservice.services.UsuariosService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
public class UsuariosController {

    private final UsuariosService usuariosService;

    @GetMapping("/hello")
    @ResponseStatus(HttpStatus.OK)
    public String hello(){
        return "Hellow World Not Secured";
    }

    @GetMapping("/helloSecured")
    @ResponseStatus(HttpStatus.OK)
    public String helloSecured(){
        return "Hellow World Secured";
    }

    @PostMapping("/createUser")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@Valid @RequestBody UsuariosRequest usuariosRequest){
        this.usuariosService.create(usuariosRequest);
    }

    @DeleteMapping("/deleteUser")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@RequestParam String id){
        this.usuariosService.delete(Long.parseLong(id));
    }

    @GetMapping("/search/correo/{correo}")
    @ResponseStatus(HttpStatus.OK)
    public Usuarios findOneByCorreo(@PathVariable String correo){
       return this.usuariosService.findOneByCorreo(correo);
    }

}
