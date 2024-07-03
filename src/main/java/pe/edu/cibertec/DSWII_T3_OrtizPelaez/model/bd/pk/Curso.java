package pe.edu.cibertec.DSWII_T3_OrtizPelaez.model.bd.pk;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "curso")
public class Curso {
    @Id
    private String idcurso;
    @Column(name = "nomcurso")
    private String nomcurso;
    @Column(name = "credito")
    private Integer credito;
}
