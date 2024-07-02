package pe.edu.cibertec.DSWII_T3_OrtizPelaez.service;

import pe.edu.cibertec.DSWII_T3_OrtizPelaez.model.bd.Usuario;

public interface IUsuarioService {
    Usuario obtenerUsuarioPorNomUsuario(
            String nomusuario);
}
