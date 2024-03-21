package net.ausiasmarch.initial.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.ausiasmarch.initial.entity.InitialEntity;
import net.ausiasmarch.initial.repository.InitialRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
@RestController
@RequestMapping("/initial")
public class InitialApi {

    @Autowired
    InitialRepository oInitialRepository;

    @GetMapping("/{id}")
    public ResponseEntity<InitialEntity> get(@PathVariable("id") Long id) {
        return ResponseEntity.ok(oInitialRepository.findById(id).get());
    }

}
