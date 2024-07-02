package pe.edu.cibertec.DSWII_T3_OrtizPelaez.model.bd;

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
@Table(name = "especialidad")
public class Especialidad {
    @Id
    private String idesp;
    @Column(name = "nomesp")
    private String nomesp;
    @Column(name = "costo")
    private Double costo;
}
