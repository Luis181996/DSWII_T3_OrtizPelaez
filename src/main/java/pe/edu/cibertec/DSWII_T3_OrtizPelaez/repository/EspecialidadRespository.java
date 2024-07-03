package pe.edu.cibertec.DSWII_T3_OrtizPelaez.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_T3_OrtizPelaez.model.bd.pk.Especialidad;

@Repository
public interface EspecialidadRespository extends JpaRepository<Especialidad, Integer> {
}
