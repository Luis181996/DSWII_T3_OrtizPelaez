package pe.edu.cibertec.DSWII_T3_OrtizPelaez.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import pe.edu.cibertec.DSWII_T3_OrtizPelaez.model.dto.ArchivoDto;
import pe.edu.cibertec.DSWII_T3_OrtizPelaez.service.FileService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/files")
public class FileControler {
    private FileService fileService;

    @PostMapping("")
    public ResponseEntity<ArchivoDto> subirArchivos(
            @RequestParam("files") List<MultipartFile> multipartFileList) {
        try {
            if (multipartFileList.isEmpty()) {
                return new ResponseEntity<>(ArchivoDto.builder()
                        .mensaje("La lista de archivos no puede estar vacía").build(),
                        HttpStatus.BAD_REQUEST);
            }

            for (MultipartFile file : multipartFileList) {
                String fileName = file.getOriginalFilename();
                long fileSize = file.getSize();

                if (fileName == null || !fileName.endsWith(".docx")) {
                    return new ResponseEntity<>(ArchivoDto.builder()
                            .mensaje("Solo se permiten archivos con extensión .docx").build(),
                            HttpStatus.BAD_REQUEST);
                }

                if (fileSize > 2 * 1024 * 1024) {
                    return new ResponseEntity<>(ArchivoDto.builder()
                            .mensaje("El tamaño del archivo no debe superar los 2 MB").build(),
                            HttpStatus.BAD_REQUEST);
                }
            }

            fileService.guardarArchivos(multipartFileList);
            return new ResponseEntity<>(ArchivoDto.builder()
                    .mensaje("Archivos subidos correctamente").build(),
                    HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(ArchivoDto.builder()
                    .mensaje("Ocurrió un error inesperado: " + e.getMessage()).build(),
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
