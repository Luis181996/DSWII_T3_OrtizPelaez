package pe.edu.cibertec.DSWII_T3_OrtizPelaez.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_T3_OrtizPelaez.model.bd.pk.Notas;
import pe.edu.cibertec.DSWII_T3_OrtizPelaez.repository.NotasRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class NotasService {
    private NotasRepository notasRepository;

    @Override
    public List<Notas> listarNotas() {
        return  notasRepository.findAll();
    }
}
