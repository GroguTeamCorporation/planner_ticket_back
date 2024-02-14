package dev.plannerticket.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import dev.plannerticket.Services.FileStorageService;


@RestController
@RequestMapping(path = "${api-endpoint}")
/* public class ImageController {

    private final String uploadDir = "src/main/resources/static/images/";

    @GetMapping("/images/{filename:.+}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String filename) throws IOException {
        Path filePath = Paths.get(uploadDir).resolve(filename).normalize();
        Resource resource = new UrlResource(filePath.toUri());

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .contentType(MediaType.IMAGE_JPEG) 
                .body(resource);
    }
} */

public class ImageController {
    // ***** añadido ***** :
        @Autowired
        private FileStorageService fileStorageService;
    
/*     @PostMapping(path = "/images")
    ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) {
        return ResponseEntity.status(201).body("imagen agregada con éxito");
    }    
 */
    @PostMapping(path = "/images")
    public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) {
        // Utiliza FileStorageService para guardar la imagen
        String fileName = fileStorageService.storeFile(file);
        // Devuelve una respuesta con el nombre del archivo
        return ResponseEntity.status(HttpStatus.CREATED).body("Archivo subido con éxito: " + fileName);
    }
}
