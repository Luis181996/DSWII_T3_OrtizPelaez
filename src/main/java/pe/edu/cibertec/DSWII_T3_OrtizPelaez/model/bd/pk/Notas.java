package pe.edu.cibertec.DSWII_T3_OrtizPelaez.model.bd.pk;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.edu.cibertec.DSWII_T3_OrtizPelaez.model.bd.pk.Alumno;
import pe.edu.cibertec.DSWII_T3_OrtizPelaez.model.bd.pk.Curso;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "notas")
public class Notas {
    @OneToOne
    @JoinColumn(name = "idalumno")
    private Alumno alumno;
    @OneToOne
    @JoinColumn(name = "idcurso")
    private Curso curso;
    @Column(name = "exaparcial")
    private Double exaparcial;
    @Column(name = "exafinal")
    private Double exafinal;
}
