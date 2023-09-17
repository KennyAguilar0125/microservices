package com.agrotech.usuariosmicroservice.entities;

import com.agrotech.agromicroservice.entities.Empresas;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Empresa_proveedor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmpresasClientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Clientes clientes;

    @ManyToOne
    @JoinColumn(name = "empresa_id", nullable = false)
    private Empresas empresas;

    @Override
    public String toString() {
        return "EmpresasClientes{" +
                "id=" + id +
                ", clientes=" + clientes +
                ", empresas=" + empresas +
                '}';
    }
}
