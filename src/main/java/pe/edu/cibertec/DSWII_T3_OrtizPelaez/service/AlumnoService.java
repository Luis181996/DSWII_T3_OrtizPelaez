package pe.edu.cibertec.DSWII_T3_OrtizPelaez.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_T3_OrtizPelaez.model.bd.pk.Alumno;
import pe.edu.cibertec.DSWII_T3_OrtizPelaez.repository.AlumnoRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class AlumnoService {
    private AlumnoRepository alumnoRepository;

    @Override
    public List<Alumno> listarAlumnos() {
        return alumnoRepository.findAll();
    }
}
