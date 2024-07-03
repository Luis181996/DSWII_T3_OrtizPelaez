package pe.edu.cibertec.DSWII_T3_OrtizPelaez.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.DSWII_T3_OrtizPelaez.model.bd.pk.Notas;
import pe.edu.cibertec.DSWII_T3_OrtizPelaez.model.dto.DtoEntity;
import pe.edu.cibertec.DSWII_T3_OrtizPelaez.model.dto.NotasDto;
import pe.edu.cibertec.DSWII_T3_OrtizPelaez.service.INotasService;
import pe.edu.cibertec.DSWII_T3_OrtizPelaez.util.DtoUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@PreAuthorize("hasRole('SUPERVISOR')")
@AllArgsConstructor
@RestController
@RequestMapping("api/v1/notas")
public class NotasController {
    private INotasService iNotasService;

    @GetMapping("")
    public ResponseEntity<List<Notas>> listarNotas(){
        List<Notas> notasList = iNotasService.listarNotas();
        if(notasList.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(notasList);
    }

    @GetMapping("/pubs-dto ")
    public ResponseEntity<List<DtoEntity>> listarNotasDto(){
        List<DtoEntity> notaDtoList = new ArrayList<>();
        notaDtoList = iNotasService.listarNotas()
                .stream()
                .map(x -> new DtoUtil().convertirADto(x, new NotasDto()))

                .collect(Collectors.toList());
        if(notaDtoList.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(notaDtoList, HttpStatus.OK);
    }
}
