package pe.edu.cibertec.DSWII_T3_OrtizPelaez.model.bd;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "pagos")
public class Pagos {
    @Id
    private String idalumno;
    @Column (name = "ciclo")
    private String ciclo;
    private int ncuota;
    private Double monto;
    private Date fecha;

}
