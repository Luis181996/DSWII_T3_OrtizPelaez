package pe.edu.cibertec.DSWII_T3_OrtizPelaez.model.bd;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "alumno")
public class Alumno {
    @Id
    private String idalumno;
    @Column(name = "apealumno")
    private String apealumno;
    @Column(name = "nomalumno")
    private String nomalumno;
    @OneToOne
    @JoinColumn(name = "idesp")
    private Especialidad especialidad;
    @Column(name = "proce")
    private String proce;
}
