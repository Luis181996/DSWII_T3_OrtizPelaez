package pe.edu.cibertec.DSWII_T3_OrtizPelaez.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_T3_OrtizPelaez.model.bd.pk.Usuario;
import pe.edu.cibertec.DSWII_T3_OrtizPelaez.repository.UsuarioRepository;

@AllArgsConstructor
@Service
public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario obtenerUsuarioPorNomUsuario(String nomusuario) {
        return usuarioRepository.findByNomusuario(nomusuario);
    }
}
