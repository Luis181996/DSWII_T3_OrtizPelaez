package pe.edu.cibertec.DSWII_T3_OrtizPelaez.service;

import pe.edu.cibertec.DSWII_T3_OrtizPelaez.model.bd.pk.Usuario;

public interface IUsuarioService {
    Usuario obtenerUsuarioPorNomUsuario(
            String nomusuario);
}
