package com.mysiteinred.backend.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.nio.file.*;

@RestController
@RequestMapping("/api/upload")
@CrossOrigin
public class ImageUploadController {

    @PostMapping
    public String upload(@RequestParam("file") MultipartFile file) throws Exception {
        Path folder = Paths.get("uploads");
        if (!Files.exists(folder)) Files.createDirectories(folder);

        Path path = folder.resolve(file.getOriginalFilename());
        Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);

        return "/uploads/" + file.getOriginalFilename(); // URL que será salva no artigo
    }
}
