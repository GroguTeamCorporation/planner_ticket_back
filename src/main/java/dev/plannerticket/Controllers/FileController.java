package dev.plannerticket.Controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import dev.plannerticket.Services.FileStorageService;

@RequestMapping(path = "${api-endpoint}")
@RestController
public class FileController {

/*     @Autowired
    private FileStorageService fileStorageService;

    @PostMapping(path = "/images")
    public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) throws IOException {
        // Lógica para guardar el archivo
        String fileName = fileStorageService.storeFile(file);

        // Retorna la ruta relativa del archivo
        return ResponseEntity.ok().body(fileName);
    } */


/*     @PostMapping (path = "/images")
    public ResponseEntity<String> fileUpload (@RequestParam("file") MultipartFile file) {

        EventService.event(file);
        return ResponseEntity.status(201).body("Imagen agregada con éxito");
    }    
*/

} 

