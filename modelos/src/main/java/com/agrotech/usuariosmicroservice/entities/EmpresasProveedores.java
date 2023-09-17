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
public class EmpresasProveedores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "proveedor_id", nullable = false)
    private Proveedores proveedores;

    @ManyToOne
    @JoinColumn(name = "empresa_id", nullable = false)
    private Empresas empresas;

    @Override
    public String toString() {
        return "EmpresasProveedores{" +
                "id=" + id +
                ", proveedores=" + proveedores +
                ", empresas=" + empresas +
                '}';
    }
}
