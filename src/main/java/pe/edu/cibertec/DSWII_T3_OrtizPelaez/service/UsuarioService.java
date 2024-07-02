package pe.edu.cibertec.DSWII_T3_OrtizPelaez.service;

import pe.edu.cibertec.DSWII_T3_OrtizPelaez.model.bd.Usuario;

public class UsuarioService implements IUsuarioService{
    @Override
    public Usuario obtenerUsuarioPorNomUsuario(
            String nomusuario) {
        return usuarioRepository.findByNomusuario(nomusuario);
    }
}
