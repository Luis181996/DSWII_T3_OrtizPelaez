package pe.edu.cibertec.DSWII_T3_OrtizPelaez.model.bd.pk;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.edu.cibertec.DSWII_T3_OrtizPelaez.model.bd.pk.Rol;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idusuario;
    @Column(name = "nomusuario")
    private String nomusuario;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "activo")
    private Boolean activo;
    @ManyToMany(
            cascade = CascadeType.MERGE,
            fetch = FetchType.EAGER )
    @JoinTable(name = "usuario_rol", joinColumns =
    @JoinColumn(name = "idusuario"),
            inverseJoinColumns = @JoinColumn(name = "idrol"))
    private Set<Rol> roles;
}
