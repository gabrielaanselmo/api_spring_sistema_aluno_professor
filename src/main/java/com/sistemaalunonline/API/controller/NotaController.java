package com.sistemaalunonline.API.controller;

import com.sistemaalunonline.API.model.Nota;
import com.sistemaalunonline.API.service.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/notas")
public class NotaController {

    @Autowired
    private NotaService notaService;

    @GetMapping
    public ResponseEntity<List<Nota>> findAll() {
        List<Nota> notas = notaService.findAll();
        return ResponseEntity.ok().body(notas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Nota> findById(@PathVariable Long id) {
        Nota nota = notaService.findById(id);
        return ResponseEntity.ok().body(nota);
    }

    @PostMapping
    public ResponseEntity<Nota> save(@RequestBody Nota nota) {
        Nota obj = notaService.save(nota);
        return ResponseEntity.ok().body(obj);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        notaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

